package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id="logoutLink")
	private WebElement lgbtm;
	
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement taskbtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout() {
		lgbtm.click();		
	}
	public void setTasktab() {
		taskbtn.click();
	}

}
