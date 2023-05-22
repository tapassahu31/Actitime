package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(id="username")
    private WebElement usbtx;
    
    @FindBy(name="pwd")
    private WebElement pwtbx;
    
    @FindBy(id="keepLoggedInCheckBox")
    private WebElement chkbx;
    
    @FindBy(xpath="//div[text()='Login ']")
    private WebElement lgbtm;
    
    public LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    public void setLogin(String un,String pw) {
    	usbtx.sendKeys(un);
    	pwtbx.sendKeys(pw);
    	chkbx.click();
    	lgbtm.click();
    
    }
}
