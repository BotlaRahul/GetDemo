package sept24_properties_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		FileInputStream fis =new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\sept_Selinium\\src\\test\\java\\sept24_properties_files\\Config.properties");
		prop.load(fis);
				
		System.out.println(prop.getProperty("url"));
		
		System.out.println(prop.getProperty("username"));
		
		System.out.println(prop.getProperty("browser"));

	}

}
