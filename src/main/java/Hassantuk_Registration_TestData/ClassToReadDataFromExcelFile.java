package Hassantuk_Registration_TestData;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ClassToReadDataFromExcelFile {
	
	static String DirectoryPath;
	static String FilePath;
	static XSSFWorkbook WorkBook;
	static XSSFSheet SheetNo;
	
	//Creating Constructor
	public ClassToReadDataFromExcelFile (String Filepath, String Sheet) throws IOException {
		
		DirectoryPath = System.getProperty("user.dir");
		FilePath = new String(Filepath);
		WorkBook = new XSSFWorkbook(FilePath) ;	
		SheetNo = WorkBook.getSheet(Sheet);
	
	}

	public static int findRowCount1() throws IOException, InterruptedException {

		
		int RowCOunt = SheetNo.getPhysicalNumberOfRows();
		//System.out.println("ROw COunt = " +RowCOunt);
		return RowCOunt;

	}

	public static double CopyStringNumeric(int row,int col) throws IOException, InterruptedException {
		// TODO Auto-generated constructor stub
		
		double cellValNumeric = SheetNo.getRow(row).getCell(col).getNumericCellValue();
		//System.out.println("cellVal = " +cellValNumeric);
		return cellValNumeric;
	} 

	public static String CopyStringString(int row,int col) throws IOException {
		// TODO Auto-generated constructor stub
		
		String cellValString = SheetNo.getRow(row).getCell(col).getStringCellValue();
		//System.out.println("cellVal = " +cellValString);
		return cellValString;

	} 




}
