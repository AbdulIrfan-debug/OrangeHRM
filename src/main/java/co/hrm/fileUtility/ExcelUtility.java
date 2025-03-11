package co.hrm.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String loginTest(String sheetName,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("./TestData/OrangeHRMTestData.xlsx");
	    Workbook wbk = WorkbookFactory.create(fis);
	    
	    String data = wbk.getSheet(sheetName).getRow(row).getCell(cell).toString();	    
	    wbk.close();
	    
	    return data;  
	}
}
