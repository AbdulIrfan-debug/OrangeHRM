package com.OrangeHRM.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrm.Webdriverutility.DriverUtility;

public class Admin {
	WebDriver driver;

	public Admin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement userAdmin;

	@FindBy(xpath = " //div[@class='oxd-form-actions']/button/following-sibling::button")
	private WebElement serchButton; 

	// adduser
	@FindBy(xpath = "//button[text() = ' Add ']")
	public WebElement addButton;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[1]")
	public WebElement userRole;
	
	@FindBy(xpath = "//div[@class='oxd-select-option']/span[text()='Admin']")
	public WebElement userroleSelect;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	public WebElement emloyeenamefield;	
	
	@FindBy(xpath = "//div[@class='oxd-autocomplete-option']/span[text()='Ranga  Akunuri']")
	public WebElement enames;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text--after'])[2]")
	public WebElement status;
	
	@FindBy(xpath = "//div[@class='oxd-select-option']/span[text()='Enabled']")
	public WebElement statusSelect;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement userNameField;
	
//	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[3]")
	
	@FindBy(xpath = "(//input[@type = 'password'])[1]")
	public WebElement passwordField;
	
	@FindBy(xpath = "(//input[@type = 'password'])[2]")
	public WebElement confirmPasswordField; 
	
	@FindBy(xpath = "//button[text()=' Save ']")
	public WebElement saveButton; 
	
				
	public WebElement getUserAdmin() {
		return userAdmin;
	}

	public WebElement getSerchButton() {
		return serchButton;
	}	 

	public void searchForUser(String user) {
		userAdmin.sendKeys(user);
		serchButton.click();
	}	
	
    public void addUser(boolean res) {
		DriverUtility du = new DriverUtility();

		if (res == false) {
			addButton.click(); 
			userRole.click(); 
			
			userroleSelect.click();

			emloyeenamefield.sendKeys("Ranga");
			du.mouseMovement(driver, enames);			
			
			status.click();
			statusSelect.click();			

			userNameField.sendKeys("Kamal@127");
			passwordField.sendKeys("abdulirfan@1");
//			du.waitForElementPrest(driver,ad.confirmPasswordField);
			
			confirmPasswordField.sendKeys("abdulirfan@1");
			saveButton.click();
		}
	}
    
    public void logout() {
		new DashBoard(driver).logout();  
	}
}
