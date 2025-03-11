package com.hrm.Webdriverutility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverUtility {

	public void waitForElementPrest(WebDriver driver, WebElement ele) {

		WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(5));
		wdw.until(ExpectedConditions.visibilityOf(ele));

	}

	public void switchToTabonUrl(WebDriver driver, String partialUrl) {

		Set<String> win = driver.getWindowHandles(); 

		Iterator<String> itr = win.iterator();

		while (itr.hasNext()) { 

			String windowId = itr.next();
			driver.switchTo().window(windowId);

			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(partialUrl)) {
				break;
			}
		}
	}

	public void switchToTabonTitle(WebDriver driver, String partialTitle) {

		Set<String> win = driver.getWindowHandles();

		Iterator<String> itr = win.iterator();

		while (itr.hasNext()) {

			String windowId = itr.next();
			driver.switchTo().window(windowId);

			String actTitle = driver.getTitle();
			if (actTitle.contains(partialTitle)) {
				break;
			}
		}
	}

	public void switchToframe(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}

	public void switchToframe(WebDriver driver, String nameId) {
		driver.switchTo().frame(nameId);
	}

	public void switchToframe(WebDriver driver, WebElement ele) {
		driver.switchTo().frame(ele);
	}

	public void switchToAlertAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}

	public void switchToAlertDismiss(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}

	public void select(WebElement ele, String text) {
		Select sel = new Select(ele);
		sel.selectByVisibleText(text);
	}

	public void select(WebElement ele, int index) {
		Select sel = new Select(ele);
		sel.selectByIndex(index);
	}

	public void mouseMovement(WebDriver driver, WebElement ele) {
		Actions atn = new Actions(driver);
		atn.moveToElement(ele).click().perform();
	}

	public void doubleClick(WebDriver driver, WebElement ele) {
		Actions atn = new Actions(driver);
		atn.doubleClick(ele).perform();
	}

}
