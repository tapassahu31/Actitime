package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskTab;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass {//inheritance from BaseClass
	
	@Test
	public void testcreatCustomer() throws EncryptedDocumentException, IOException {
		Reporter.log("creatCustomer",true);
		FileLib f=new FileLib();
		 String customerName = f.getExcelFile("CreatCustomer",1, 2);
		 String customerDiscreption=f.getExcelFile("CreatCustomer", 1, 3);
		 
		HomePage h=new HomePage(driver);
		h.setTasktab();
		
		TaskTab t=new TaskTab(driver);
	      t.getAddnewcustomer().click();
	      t.getNewcustomer().click();
	      t.getEntername().sendKeys(customerName);;
	      t.getDescription().sendKeys(customerDiscreption);;
	      t.getSelectcustomer().click();
	      t.getOurCompany().click();
	      t.getCreateCustomer().click();
	     
	      String actualText = t.getActualCustomer().getText();
	       Assert.assertEquals(actualText, customerName);
	      
	     
	      
	     
	     
		
		
	}

}
