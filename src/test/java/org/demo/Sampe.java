package org.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sampe {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=  new ChromeDriver();
		
		int a= 20;
		
		if (a==10) {
			
		}
		System.out.println("25/5/22");
		System.out.println("last");

		
		for (int i = 0; i < args.length; i++) {
			
		}

		
		
	}
	
	
	
}
