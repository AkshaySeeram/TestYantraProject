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

public class Generic_Excel {

	public static String StringData(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException {
		File  file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		Cell cell=row.getCell(colnum);
		return cell.toString();
	}
	
	public static boolean booleanData(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException {
		File  file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		Cell cell=row.getCell(colnum);
		return cell.getBooleanCellValue();
	}

	public static double NumericData(String sheetname,int rownum,int colnum) throws EncryptedDocumentException, IOException {
		File  file=new File("./TestData/TestData.xlsx");
		FileInputStream fis=new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet(sheetname);
		Row row=sheet.getRow(rownum);
		Cell cell=row.getCell(colnum);
		return cell.getNumericCellValue();
	}

	
}
