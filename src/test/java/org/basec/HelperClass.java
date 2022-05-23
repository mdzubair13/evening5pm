package org.basec;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HelperClass {

	public static WebDriver driver;

	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void maxi() {
		driver.manage().window().maximize();

	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void filltext(WebElement loc, String value) {
		loc.sendKeys(value);
	}

	public static void btnClick(WebElement loc) {
		loc.click();

	}

	public static String readexcel(String sheets, int rows, int cells) throws IOException {

		File f = new File("C:\\\\Users\\\\zubee\\\\ClassWorkSpace\\\\MVN5pm\\\\sheets\\\\SampleData.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);

		Sheet sheet = book.getSheet(sheets);

		Row row = sheet.getRow(rows);

		Cell cell = row.getCell(cells);

		int type = cell.getCellType();

		String name = "";

		if (type == 1) {

			name = cell.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd, MMMM, yyyy");
			name = s.format(d);
		} else {

			double d = cell.getNumericCellValue();
			long l = (long) d;

			name = String.valueOf(l);
		}

		return name;

	}

	public static void screenshot(String name) throws IOException {

		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File f = new File("C:\\Users\\zubee\\ClassWorkSpace\\MVN5pm\\screenshot\\" + name + ".png");
		FileUtils.copyFile(src, f);

	}

	public static void dateTime() {
		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		String format = s.format(d);
		System.out.println(format);
	}

}
