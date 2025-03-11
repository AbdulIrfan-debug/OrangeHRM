package loginHRM;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.OrangeHRM.objectrepositoryutility.Login;
import co.hrm.fileUtility.PropertyfileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest  {
	
	@Test
	public void loginTestCase01() throws IOException, InterruptedException {

		PropertyfileUtility pu = new PropertyfileUtility(); 

		String url = pu.getDataFromPropertyFile("./TestData/Commandata1.properties", "url");
		String userName = pu.getDataFromPropertyFile("./TestData/Commandata1.properties", "username");
		String passWord = pu.getDataFromPropertyFile("./TestData/Commandata1.properties", "password");

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get(url);        
        
        Login lp = new Login(driver);
        lp.loginToApp(userName,passWord);	
		
	}
}
