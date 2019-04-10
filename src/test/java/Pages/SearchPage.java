package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage extends BasePage {
	
	WebDriver driver;
	WebElement searchTextBox;
	WebElement accessButton;
	
	//Constructor
	public SearchPage(WebDriver driver){
		this.driver = driver;
	    searchTextBox = this.driver.findElement(By.xpath("//input[@type='text']"));
		accessButton = this.driver.findElement(By.xpath("//input[@type='submit']"));	
	}
	
	public void enterCredentials(String search) {
		sendKeys(searchTextBox, search);
	}
	
	public void clickLoginButton() {
		clickElement(accessButton);		
	}		

}
