package Pages;

import java.security.cert.PKIXRevocationChecker.Option;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends BasePage {

	WebDriver driver;
	WebElement usernameTextBox;
	WebElement passwordTextBox;
	WebElement emailTextBox;
	WebElement emailTextBox2;
	WebElement firstnameTextBox;
	WebElement lastnameTextBox;
	WebElement cityTextBox;
	WebElement contryCmbBox;
	WebElement accessButton;
	
	
	
	//Constructor
		public RegisterPage(WebDriver driver){
			this.driver = driver;
			usernameTextBox = this.driver.findElement(By.id("id_username"));
			passwordTextBox = this.driver.findElement(By.id("id_password"));
			emailTextBox = this.driver.findElement(By.id("id_email"));
			emailTextBox2 = this.driver.findElement(By.id("id_email2"));
			firstnameTextBox = this.driver.findElement(By.id("id_firstname"));
			lastnameTextBox = this.driver.findElement(By.id("id_lastname"));
			cityTextBox = this.driver.findElement(By.id("id_city"));
			contryCmbBox = this.driver.findElement(By.id("id_country"));
			accessButton =    this.driver.findElement(By.id("id_submitbutton"));
			
		}		
		
		public void enterCredentials(String username, String password, String email, String email2,String name, 
									 String lastname,  String city, String country) {
			
			sendKeys(usernameTextBox, username);
			sendKeys(passwordTextBox, password);
			sendKeys(emailTextBox, email);
			sendKeys(emailTextBox2, email2);
			sendKeys(firstnameTextBox, name);
			sendKeys(lastnameTextBox, lastname);
			sendKeys(cityTextBox, city);
			Select drpCountry = new Select(driver.findElement(By.id("id_country")));
			drpCountry.selectByVisibleText(country);
			
		}
		
		public void clickLoginButton() {
			clickElement(accessButton);		
		}
		
				
		
}
