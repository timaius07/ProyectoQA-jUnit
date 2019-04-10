package Test;

import org.junit.Before;
import org.junit.Test;
import Pages.LoginPage;

public class LoginUserNull  extends BaseTest {
	
	@Before
	public void open(){
		driver.get("https://elaulaenlinea.com/login/index.php");
	}
	
	@Test
	public void loginCredenciales() {
	LoginPage loginPage = new LoginPage(driver);
	loginPage.enterCredentials("", "Timaius2688929");
	loginPage.clickLoginButton();			
	}

}
