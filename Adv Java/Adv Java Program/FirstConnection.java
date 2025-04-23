import java.sql.*;

public class FirstConnection {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "MYDB", "MYDB"); // Connection to the data base
            Statement stm = con.createStatement(); // then create a statement in this statement of help we can execute a query 
            ResultSet resSet = stm.executeQuery("SELECT * FROM JDBCTEST");
            
            System.out.println("Name\tRollNo\t MobNo");
            System.out.println("------------------------");
            while (resSet.next()) {
//                System.out.println("NAME: " + resSet.getString("NANE") + ", ROLLNO: " + resSet.getInt("ROLLNO") + ", MOBNUMBER: " + resSet.getLong("MOBNO"));
                System.out.println(resSet.getString("NANE") +"\t"+ resSet.getInt("ROLLNO") +"\t"+ resSet.getLong("MOBNO"));

            }
        } catch (Exception e) {
            System.out.println("Error--------------");
            e.printStackTrace(); 
        }
    }
}
