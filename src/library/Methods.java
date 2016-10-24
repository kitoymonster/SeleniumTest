package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Methods {
	public void SetTextField(WebDriver driver, String xpath, String textInput) {
		driver.findElement(By.xpath(xpath)).sendKeys(textInput);
	}
	
	public void ButtonClick(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public int GetElementCount(WebDriver driver, String xpath) {
		return driver.findElements(By.xpath(xpath)).size();
	}
}
