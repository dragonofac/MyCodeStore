package tool.demo.usePOI;

import tool.ReadExcel.AvaliableInterface.ReadExcelCellContent;


public class UsingReadExcelCellContentDemo {

	public static void main(String[] args) {
		ReadExcelCellContent rc = 
				new ReadExcelCellContent("/Users/mzlin/Downloads/EXCEL.xls",0);
		Object obj =
				(String)rc.getCellData(rc.getCell(3, 5),null);
		System.out.println(obj);
	}

}
