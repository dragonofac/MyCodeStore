package tool.usage.sample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class LearnPOITool {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream("/Users/mzlin/Downloads/EXCEL.xls"));
		
		//得到Excel工作薄对象
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		
		//获得工作表的数目
		wb.getNumberOfSheets();
		
		//得到Excel工作表对象(一个工作薄有多个sheet,根据sheetIndex索引)
		int sheetIndex = 2;
		HSSFSheet sheet = wb.getSheetAt(sheetIndex);
		
		//返回最后一行记录的所在行编号
		System.out.println(sheet.getLastRowNum());
		
		//得到Excel工作表的行
		HSSFRow row = sheet.getRow(1000);
		
		//获取一行的有效单元格个数
		row.getLastCellNum();
		
		//得到Excel工作单元格
		HSSFCell cell = row.getCell(0);
		
		show(cell.getStringCellValue());
		
		//获取单元格的链接地址
		cell.getHyperlink();
		
		//show(cell.getStringCellValue());
	}
	public static void show(Object obj){
		System.out.println(obj);
	}
}
