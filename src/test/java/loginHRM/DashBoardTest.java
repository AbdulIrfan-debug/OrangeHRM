package loginHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.OrangeHRM.objectrepositoryutility.DashBoard;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DashBoardTest {
	
	public void home() {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		DashBoard db = new DashBoard(driver);
		db.AssignLeave.click();
		
		 
	}

}
