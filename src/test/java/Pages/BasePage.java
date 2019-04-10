package Pages;
import java.net.PasswordAuthentication;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	
	public void sendKeys(WebElement element, String text){
		element.sendKeys(text);
		
	}
	
	public void clickElement(WebElement element){
		element.click();
	}
	
	
}