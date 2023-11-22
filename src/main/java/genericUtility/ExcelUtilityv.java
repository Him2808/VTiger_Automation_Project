package genericUtility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * this class is use to fetch test data present in excel
 * @author Himanshu
 *
 */
public class ExcelUtilityv {
	/**
	 * this method is use to fetch test data from excel
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws Exception
	 */
	public String getDataFromExcel(String sheetname,int row,int cell) throws Exception {
		
		FileInputStream fis=new FileInputStream(IconstantUtilityv.excelPath);
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh=book.getSheet(sheetname);
		DataFormatter format=new DataFormatter();
		String cellValue=format.formatCellValue(sh.getRow(row).getCell(cell));
		return cellValue;
		
	}

}
