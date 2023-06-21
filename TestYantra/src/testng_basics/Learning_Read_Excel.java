package testng_basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Learning_Read_Excel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		readExcel();
		multipleRead("Login");
	}

	public static void readExcel() throws EncryptedDocumentException, IOException {
		File file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet("Login");
		Row row=sheet.getRow(0);
		Cell cell=row.getCell(0);
		System.out.println(cell.toString());
	}

	public static void multipleRead(String sheetName) throws EncryptedDocumentException, IOException {
		File  file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetName);

		int row=sheet.getPhysicalNumberOfRows();
		int col=sheet.getRow(0).getPhysicalNumberOfCells();
		for (int i = 0; i <row; i++) { //Row Iteration
			for (int j = 0; j <col; j++) { //cell iteration
				System.out.println(sheet.getRow(i).getCell(j).toString());
			}			
		}
	}
}