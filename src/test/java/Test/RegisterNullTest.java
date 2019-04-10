package Test;

import org.junit.Before;
import org.junit.Test;

import Pages.RegisterPage;



public class RegisterNullTest  extends BaseTest {
	

	@Before
	public void open(){
		driver.get("https://elaulaenlinea.com/login/index.php");
	}
	
	@Test
	public void registerCredencial() {
	RegisterPage registerPage = new RegisterPage(driver);
	registerPage.enterCredentials("Marco","Lopez","marcolopez1994@hotmai.com","Mlopez94","Mlopez94");
	registerPage.clickLoginButton();			
	}

	
	
}
