package Basic1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class ReadDataExcelTest{

	public  void VtigerExcelTest() throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("src\\test\\resources\\DataJ.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("sheet1");
		Row rw = sh.getRow(1);
		Cell cl = (Cell) rw.getCell(1);
		String data = ((org.apache.poi.ss.usermodel.Cell) cl).getStringCellValue(); 
		System.out.println(data);
		
		
		
	}

}
