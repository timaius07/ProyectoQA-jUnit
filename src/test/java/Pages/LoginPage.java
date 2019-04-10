package Pages;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
	
	WebDriver driver;
	WebElement userTextBox;
	WebElement passwordTextBox;
	WebElement accessButton;
	

	
	//Constructor
	public LoginPage(WebDriver driver){
		this.driver = driver;
		userTextBox =     this.driver.findElement(By.id("username"));
		passwordTextBox = this.driver.findElement(By.id("password"));
		accessButton =    this.driver.findElement(By.id("loginbtn"));
		
	}
		
	public void enterCredentials(String user, String password) {
		sendKeys(userTextBox, user);
		sendKeys(passwordTextBox, password);	
	}
	
	public void clickLoginButton() {
		clickElement(accessButton);		
	}		
}