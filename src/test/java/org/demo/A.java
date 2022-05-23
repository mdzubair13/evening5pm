package org.demo;

import org.basec.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A extends HelperClass {
public static WebDriver driver;
	
	@Parameters({"Browser"})
	@Test
	public void tc1(String brow) {
		
		if (brow.startsWith("ch")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			
		}else if (brow.startsWith("ed")) {
			
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			
		}else {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		
		driver.get("https://www.flipkart.com/");
		
		
		
	}

	
}
