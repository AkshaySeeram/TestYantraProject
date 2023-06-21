package testng_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_WIth_Excel_A2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		multipleRead("Login");
	}

	public static String[][] multipleRead(String sheetName) throws EncryptedDocumentException, IOException {

		File  file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);

		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		String data[][]=new String[row-1][col];
		for (int i = 1; i <row; i++) { //Row Iteration
			for (int j = 0; j <col; j++) { //cell iteration
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}			
		}

		/*for (int i = 0; i <row-1; i++) { 
			for (int j = 0; j <col; j++) { 
				System.out.println(data[i][j]);
			}			
		}*/
		return data;
	}
}
