package Sel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Working_With_Property_File {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/configuration.properties");
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}
}
