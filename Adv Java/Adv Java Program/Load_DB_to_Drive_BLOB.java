//Program to load file from DB into Drive
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Load_DB_to_Drive_BLOB {
public static void main(String[] args) {
    try {
        //set up connection
        Connection con = DriverManager.getConnection
        ("jdbc:oracle:thin:@localhost:1521:XE","system","tiger");
        Scanner sc = new Scanner(System.in);
        System.out.println("Connection established");
        PreparedStatement ps = con.prepareStatement
                             ("select * from MultiMediaDB3 where MEDIAID = ?");
        System.out.println("Enter id to get the associated media");
        String id = sc.nextLine();
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()) {
            Blob b = rs.getBlob(2);
            byte arr[]= b.getBytes(1,(int)(b.length()));//b.length() return long
            System.out.println("Enter the path where you want to load the media:");
            String path = sc.nextLine();
            File f = new File(path);
            FileOutputStream fos = new FileOutputStream(f);
            fos.write(arr);
            System.out.println("File loaded into driver successfully");
            fos.close();
        }
       
        rs.close();
        ps.close();
        sc.close();
        con.close();
    }
    catch(Exception e) {
        e.printStackTrace();
    }
   
   
}
}
/*
 public abstract java.sql.Blob getBlob(int) throws java.sql.SQLException;
 ---------------------------------------------------------------------
 - It is available inside java.sql.ResultSet.
 - It returns the Blob based on given columnIndex.

  */