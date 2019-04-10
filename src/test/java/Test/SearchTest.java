package Test;

import org.junit.Before;
import org.junit.Test;
import Pages.SearchPage;

public class SearchTest extends BaseTest {
	
	@Before
	public void open(){
		driver.get("https://elaulaenlinea.com/course/index.php");
	}
	
	@Test
	public void SearchCredenciales() {
	SearchPage searchPage = new SearchPage(driver);
	searchPage.enterCredentials("Auditor�a de Tecnolog�as de Informaci�n");
	searchPage.clickLoginButton();			
	}

}
