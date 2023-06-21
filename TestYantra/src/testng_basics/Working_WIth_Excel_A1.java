package testng_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_WIth_Excel_A1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		multipleRead("Login");
	}

	public static void multipleRead(String sheetName) throws EncryptedDocumentException, IOException {
		File  file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);

		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 1; i <row; i++) { //Row Iteration
			for (int j = 0; j <col; j++) { //cell iteration
				System.out.println(sheet.getRow(i).getCell(j).toString());
			}			
		}
	}
}