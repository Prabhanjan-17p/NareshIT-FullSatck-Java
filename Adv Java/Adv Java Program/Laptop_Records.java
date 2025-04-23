import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Laptop_Records {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB");
			Statement stm = con.createStatement();
			ResultSet res = stm.executeQuery("SELECT * FROM LAPTOPREC");
			System.out.println("Brand\tModel\tProcessor\tRamsize\tPrice");
			System.out.println("----------------------------------------------");
			while (res.next()) {
				System.out.println(res.getString("BRANDNAME")+"\t"+res.getString("MODEL")+"\t"+res.getString("PROCESSOR")+"\t"+res.getInt("RAMSIZE")+"\t"+res.getInt("PRICE"));
			}
			res.close();
			stm.close();
			con.close();
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
