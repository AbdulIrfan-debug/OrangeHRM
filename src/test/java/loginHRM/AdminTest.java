package loginHRM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.OrangeHRM.objectrepositoryutility.Admin;
import com.OrangeHRM.objectrepositoryutility.DashBoard;
import com.OrangeHRM.objectrepositoryutility.Login;
import com.hrm.Webdriverutility.DriverUtility;

import co.hrm.fileUtility.PropertyfileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminTest {
	
//	Admin ad; 
	@Test 
	public void searchUser() throws IOException {
		PropertyfileUtility pu = new PropertyfileUtility(); 

		String url = pu.getDataFromPropertyFile("./TestData/Commandata1.properties", "url");
		String userName = pu.getDataFromPropertyFile("./TestData/Commandata1.properties", "username");
		String passWord = pu.getDataFromPropertyFile("./TestData/Commandata1.properties", "password");

		//WebDriverManager.firefoxdriver().setup(); 
		WebDriver driver = new ChromeDriver();    
		driver.get(url);

		// login to the application
		Login lp = new Login(driver);
		lp.loginToApp(userName, passWord);

		// to navigate to Admin
		DashBoard d = new DashBoard(driver); 
		d.Admin.click();

		// creating admin object for accsess admin Webelement
		Admin ad = new Admin(driver);   
		ad.searchForUser("Adam"); 

		//message Validation after Search
		String msg = driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span']")).getText();
		System.out.println(msg);

		boolean res = msg.equals("(1) Record Found") ? true : false;
		System.out.println(res); 
		 
		//If user Not Found add user 
        ad.addUser(res);
        
        
        //logout application
        ad.logout();
        
        driver.quit();
        

//	@Test
//	public void addUser() throws IOException {
	
//		boolean userVerification = searchUser();
//						
//		if (userVerification == false) {			
//			ad.addButton.click();
//			DriverUtility du = new DriverUtility();			
//			du.select(ad.userRole, 1);	
//			
//			ad.emloyeenamefield.sendKeys("Kamal");
//			DriverUtility du1 = new DriverUtility();
//			du1.select(ad.status, 1);
//			
//			ad.userNameField.sendKeys("Kamal@123");
//			ad.passwordField.sendKeys("123@");
//			ad.confirmPasswordField.sendKeys("123@");		
//		}	
		 
	} 
}
