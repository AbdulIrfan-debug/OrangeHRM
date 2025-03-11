package com.OrangeHRM.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoard {
	
	// Home page In OrangeHRM
	WebDriver driver;
	
	public DashBoard(WebDriver driver) { 
		 this.driver = driver;
		 PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[text()='Admin']/parent::a")	
	public WebElement Admin;
	
	@FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-quick-launch']/div/button[@title ='Assign Leave']")
	public WebElement AssignLeave;
	
	@FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-quick-launch']/div/button[@title ='Leave List']")
	public WebElement LeaveList;
	
	@FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-quick-launch']/div/button[@title ='Timesheets']")
	public WebElement TimeSheets;
	
	@FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-quick-launch']/div/button[@title ='Apply Leave']")
	public WebElement ApplyLeave;
	
	@FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-quick-launch']/div/button[@title ='My Leave']")
	public WebElement MyLeave;
	
	@FindBy(xpath = "//div[@class='oxd-grid-3 orangehrm-quick-launch']/div/button[@title ='My Timesheet']")
	public WebElement MyTimeSheet;
	
	@FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
	public WebElement profiledropdown;
	
	@FindBy(linkText = "Logout")
	public WebElement logOut;	
	
	public void logout() {
		
		profiledropdown.click();
		logOut.click();		
	}	
}
