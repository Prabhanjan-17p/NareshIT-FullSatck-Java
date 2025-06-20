package Collections_Framework.Properties;
/*
Properties :
------------
public class Properties extends Hashtable<K,V>

It is a legacy class and It represents a persistent set of properties.

It is subclass of Hashtable available in java.util package.

It is used to maintain the persistent data in the key-value form. It takes both key and value as a String format.

It is used to load properties file in our java application directly at runtime without compilation/deploymnet.

Constructors :
--------------
Commonly we are using this constructor  :

   Properties p1 = new Properties();
   Creates an empty property list.

Methods :
----------
1) public void load(InputStream stream): Reads a property list (key    and value pair) from the input byte stream.

2) public void load(Reader reader):Reads a property list (key and       value pair) from the Character Oriented stream.

3) Object setProperty(String key, String value) : It Calls the Hashtable method put internally to store the key and value pait in String format

4) public String getProperty(String key) :Searches for the property     with the specified key in this property list.

5) public void	store(OutputStream out, String comments) : It
   Writes this property list (key and element pairs) in this Properties table to the output stream.

6) public void	store(Writer writer, String comments) : It
   Writes this property list (key and element pairs) in this Properties table to the character stream.


Steps :
--------
1) Create a file whose extension must be  .properties as shown below

database.properties
---------------
driver = oracle.jdbc.driver.OracleDriver
user = scott
password = ravi

 */
import java.util.*;
import java.io.*;

public class PropertiesDemo 
{
	public static void main(String[] args) throws IOException
	{
		var reader = new FileReader("D:\\new\\database.properties");
		
		//Load the Properties file
		Properties p = new Properties(); //k,v String format
		p.load(reader);
					
		String driver = p.getProperty("driver");
		System.out.println(driver); 
		
		String user = p.getProperty("userName");
		System.out.println(user); 
		
		String pwd = p.getProperty("password");
		System.out.println(pwd); 		
	}
}