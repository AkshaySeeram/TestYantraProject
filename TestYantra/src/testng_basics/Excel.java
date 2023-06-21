package testng_basics;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

public class Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.out.println(Generic_Excel.StringData("Login",1, 1));
		System.out.println(Generic_Excel.booleanData("Login",1, 1));
		System.out.println(Generic_Excel.NumericData("Login",1, 1));
	}
}
