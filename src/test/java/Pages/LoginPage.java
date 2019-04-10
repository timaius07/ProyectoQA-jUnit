package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


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