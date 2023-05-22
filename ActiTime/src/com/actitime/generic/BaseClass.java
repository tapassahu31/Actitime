package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static WebDriver driver;
    @BeforeClass
    public void openBrowser(){
    	Reporter.log("openBrowser",true);
    	driver=new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    	
    }
    @AfterClass
    public void closeBrowser() {
    	Reporter.log("closedBrowser",true);
    	driver.close();
    }
    @BeforeMethod
    public void loginPage() throws IOException {
    	Reporter.log("loginPage",true);
    	FileLib f=new FileLib();
    	String url = f.getProperty("url");
    	String un=f.getProperty("username");
    	String pw=f.getProperty("password");
    	driver.get(url);
    	LoginPage l=new LoginPage(driver);
    	l.setLogin(un, pw);
    	/*driver.get("https://demo.actitime.com/");
    	driver.findElement(By.id("username")).sendKeys("admin");
    	driver.findElement(By.name("pwd")).sendKeys("manager");
    	driver.findElement(By.id("keepLoggedInCheckBox")).click();
    	driver.findElement(By.xpath("//div[text()='Login ']")).click();*/
    }
    @AfterMethod
   
    public void logoutPage() {
    	 Reporter.log("logoutPage",true);
    	driver.findElement(By.id("logoutLink")).click();
    }
    
   
    
    
    
}
