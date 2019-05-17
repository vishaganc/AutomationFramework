package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Lib implements IAutoConstant {
	public static Workbook wb;
	public static String getCellValue(String sheetName,int rowNum,int colNum) {
		String cellValue="";
		try {
			Workbook wb=WorkbookFactory.create(new FileInputStream(EXCEL_PATH));
			cellValue = wb.getSheet(sheetName).getRow(rowNum).getCell(colNum).toString();
			
		} catch (Exception e) {
			
		}
		return cellValue;
	}
	public static String getPropertyValue(String propertyName) {
		String propertyValue=" ";
		Properties prop=new Properties();
		try {
			prop.load(new FileInputStream(CONFIG_FILE_PATH));
			propertyValue=prop.getProperty(propertyName);
		}  catch (IOException e) {
			
		}
		return propertyValue;
	}
	public static int getTotalRowCount(String sheetName) {
		int totalRowCount=0;
		try {
			FileInputStream excelobj = new FileInputStream(EXCEL_PATH);
			wb= WorkbookFactory.create(excelobj);
			wb.getSheet(sheetName).getLastRowNum();
			} catch (Exception e) {
		}
		return totalRowCount;
		
	}
	public static void captureScreenshot(WebDriver driver,String testMethodName){
		String currDateAndTime = new Date().toString().replaceAll(":", "_");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcFile=ts.getScreenshotAs(OutputType.FILE);
		File destFile=new File(SCREENSHOT_PATH +testMethodName+"_"+currDateAndTime+".png");
		try {
			Files.copy(srcFile, destFile);
		} catch (Exception e) {
			
		}
	}
}
