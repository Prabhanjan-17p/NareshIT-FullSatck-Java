package Collections_Framework.Properties;
/*
Now make the changes in the database.properties file and execute java program directly without re-compilation and re-deployment
 */
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo2 {

	public static void main(String[] args) throws IOException 
	{     
		
		Properties properties = new Properties();
		
		
		String filePath = "D:\\new\\data.properties";
		
		var writer = new FileWriter(filePath);
		try(writer)
		{
			properties.setProperty("book", "Java");
			properties.setProperty("author", "James");
			properties.setProperty("price", "1200");
			
			//Storing properties in the Properties file
			properties.store(writer, "Book Properties set");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//Reading the data from Properties file 
		
		var reader = new FileReader(filePath);
		
		try(reader)
		{
			properties.load(reader);
			System.out.println("Book Name is "+properties.getProperty("book"));
			System.out.println("Author Name is "+properties.getProperty("author"));
			System.out.println("Price Name is "+properties.getProperty("price"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}