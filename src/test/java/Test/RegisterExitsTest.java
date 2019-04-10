package Test;

import org.junit.Before;
import org.junit.Test;
import Pages.RegisterPage;


public class RegisterExitsTest  extends BaseTest {
	

	@Before
	public void open(){
		driver.get("https://elaulaenlinea.com/login/signup.php");
	}
	
	@Test
	public void registerCredencial() {
	RegisterPage registerPage = new RegisterPage(driver);
	registerPage.enterCredentials("Marco07","Timaius2688929z","mcambronerov@est.utn.ac.cr","mcambronerov@est.utn.ac.cr"
			,"Marco C","CamVar","Bajo Rodriguez","Costa Rica");
	registerPage.clickLoginButton();			
	}

	
	
}
