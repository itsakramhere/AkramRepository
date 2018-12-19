package DataHelper;

import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Helper 
{
	public static List<HashMap<String, String>> excelData(String filename ,String Sheetname)
	{
		List<HashMap<String, String>> mydata=new ArrayList<HashMap<String,String>>();
		
		try {
			FileInputStream fis=new FileInputStream(filename);
			Workbook wb=new XSSFWorkbook(fis);
			Sheet sh=wb.getSheet(Sheetname);
			
		
			Row headerRow=sh.getRow(0);
			
			for(int r=1;r<sh.getPhysicalNumberOfRows();r++)
			{
				Row currentRow=sh.getRow(r);
				HashMap<String, String> hashmap = new HashMap<String, String>();
				for(int c=0;c<currentRow.getPhysicalNumberOfCells();c++)
				{
					Cell CurrentCell=currentRow.getCell(c);
					
					switch(CurrentCell.getCellType())
					{
					case Cell.CELL_TYPE_STRING:
						hashmap.put(headerRow.getCell(c).getStringCellValue(), CurrentCell.getStringCellValue());
					}
				}
				mydata.add(hashmap);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mydata;
		
		
	}
}
