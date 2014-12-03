package tool.ReadExcel.AvaliableInterface;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.FormulaEvaluator;

/*
1）CELL_TYPE_BLANK ：空值
2）CELL_TYPE_BOOLEAN ：布尔型
3）CELL_TYPE_ERROR ： 错误
4）CELL_TYPE_FORMULA ：公式型
5）CELL_TYPE_STRING：字符串型
6）CELL_TYPE_NUMERIC：数值型
*/
public class ReadExcelCellContent {
	private HSSFWorkbook hwb;
	private HSSFSheet sheet;
	
	public ReadExcelCellContent(String file,int sheetIndex)
	{
		POIFSFileSystem fs;
		try {
			fs = new POIFSFileSystem(new FileInputStream(file));
			hwb = new HSSFWorkbook(fs);
			sheet = hwb.getSheetAt(sheetIndex);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public Object getCellData(Cell cell, FormulaEvaluator formula) {
	    if(cell == null) {
	        return null;
	    }
	    switch (cell.getCellType()) 
	    {
		    case Cell.CELL_TYPE_STRING:
		        return cell.getRichStringCellValue().getString();
		    case Cell.CELL_TYPE_NUMERIC:
		        if (DateUtil.isCellDateFormatted(cell)) {
		            return cell.getDateCellValue();
		        } else {
		            return cell.getNumericCellValue();
		        }
		    case Cell.CELL_TYPE_BOOLEAN:
		        return cell.getBooleanCellValue();
		    case Cell.CELL_TYPE_FORMULA:
		        return formula.evaluate(cell).getNumberValue();
		    default:
		        return null;
	    }
	} 
	public void setSheet(int sheetIndex){
		sheet = hwb.getSheetAt(sheetIndex);
	}
	
	public Cell getCell(int rowNum,int columnNum)
	{
		return sheet.getRow(rowNum).getCell(columnNum);
	}
}
