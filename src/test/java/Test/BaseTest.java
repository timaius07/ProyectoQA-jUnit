package Test;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver ;
	
	@Before
	public void SetDriver() {
	    System.setProperty( "webdriver.gecko.driver",  "./src/test/java/Driver/geckodriver.exe" );
	    driver = new FirefoxDriver(  );
	}
	

	//@Before
	//	public void SetDriver() {
	//	    System.setProperty( "webdriver.chrome.driver",  "./src/test/java/Driver/chromedriver74.exe" );
	//	    driver = new ChromeDriver();
	//	}
	
}