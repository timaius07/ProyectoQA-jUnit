package Test;

import org.junit.Before;
import org.junit.Test;
import Pages.RegisterPage;


public class RegisterPassword extends BaseTest {
	
	@Before
	public void open(){
		driver.get("https://elaulaenlinea.com/login/signup.php");
	}
	
	@Test
	public void registerCredencial() {
	RegisterPage registerPage = new RegisterPage(driver);
	registerPage.enterCredentials("Marco07","4321","mlopez@est.utn.ac.cr","mlopez@est.utn.ac.cr"
			,"Marco","Antonio","Bajo Rodriguez","Costa Rica");
	registerPage.clickLoginButton();			
	}

}
