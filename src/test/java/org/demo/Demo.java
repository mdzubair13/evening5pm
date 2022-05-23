package org.demo;
import org.pojoclass.*;
import org.basec.HelperClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo extends HelperClass{

	
	@Test
	private void tc1() {
		launchChromeBrowser();
		maxi();
		
	

	}

	
	@Test
	private void tc3() throws InterruptedException {
		Thread.sleep(5000);
		LoginPojo l= new LoginPojo();
		btnClick(l.getLoginbtn());
		
	}
	
	
	
	@Test(dataProvider="login")
	private void tc2(String name,String pass) {
		url("https://www.facebook.com/");
		LoginPojo l =new LoginPojo();
		filltext(l.getTxtuser(), name);
		filltext(l.getTxtpass(), pass);	
	}

	@DataProvider(name="login")
	private Object[] [] data() {
		
		
		return new  Object[][] {
			{"Sql","Sql@123"},
			{"python","python"}
	
			
		};
		
		
	}
	
	
	
	
	
	
}
