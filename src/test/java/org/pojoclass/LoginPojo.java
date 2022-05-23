package org.pojoclass;

import org.basec.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends HelperClass{
	
	
public LoginPojo() {
	
PageFactory.initElements(driver, this);
}	

@CacheLookup
@FindBy(id="email")
private WebElement txtuser;

public WebElement getTxtuser() {
	return txtuser;
}

@CacheLookup
@FindBys({
		
	@FindBy(id="pass"),	
	@FindBy(xpath="//input[@id='pass']")
		
})
private WebElement txtpass;

public WebElement getTxtpass() {
	return txtpass;
}

@CacheLookup
@FindAll({
	
	@FindBy(name="log"),
	@FindBy(xpath="//button[text()='Log In']")
	
})
private WebElement loginbtn;

public WebElement getLoginbtn() {
	return loginbtn;
}








}
