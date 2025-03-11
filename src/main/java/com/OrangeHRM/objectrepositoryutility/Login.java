package com.OrangeHRM.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    WebDriver driver;
	
	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// inorder to avoid writeacsess to other
	@FindBy(name = "username")
	private WebElement userNameField;

	@FindBy(name = "password")
	private WebElement passwordField;

	@FindBy(xpath = "//button[@type= 'submit']")
	private WebElement loginButton;

	public WebElement getUserNameField() { 
		return userNameField; 
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
  
	public void loginToApp(String userName, String password) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		userNameField.sendKeys(userName); 
		passwordField.sendKeys(password);
		loginButton.click();
	}
}
