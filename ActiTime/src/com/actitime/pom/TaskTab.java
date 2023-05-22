package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskTab {
   @FindBy(xpath="//div[text()='Tasks']")
   private WebElement tsktb;
   
   @FindBy(xpath="//div[text()='Add New']")
   private WebElement addnewcustomer;
   
   @FindBy(xpath="//div[text()='+ New Customer']")
   private WebElement newcustomer;
   
   @FindBy(xpath="//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
   private WebElement entername;
   
   @FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
   private WebElement description;
   
   @FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
   private WebElement selectcustomer;
   
   @FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
   
   @FindBy(xpath="//div[text()='Create Customer']")
   private WebElement createCustomer;
   
   @FindBy(xpath=("//div[@class='titleEditButtonContainer']/div[1]"))
   private WebElement actualCustomer;
   
  

public TaskTab(WebDriver driver) {
	   PageFactory.initElements( driver, this);
   }

public WebElement getTsktb() {
	return tsktb;
}

public WebElement getAddnewcustomer() {
	return addnewcustomer;
}

public WebElement getNewcustomer() {
	return newcustomer;
}

public WebElement getEntername() {
	return entername;
}

public WebElement getDescription() {
	return description;
}

public WebElement getSelectcustomer() {
	return selectcustomer;
}

public WebElement getOurCompany() {
	
	return ourCompany;
}

public WebElement getCreateCustomer() {
	return createCustomer;
}
public WebElement getActualCustomer() {
	return actualCustomer;
}





   
   
   
   
}
