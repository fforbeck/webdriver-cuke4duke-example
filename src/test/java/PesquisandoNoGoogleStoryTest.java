import org.junit.Test;

public class PesquisandoNoGoogleStoryTest {

	@Test
	public void testPesquisandoNoGoogleAPalavraGroovy() throws Exception {
		final GoogleSearchPage googleSearchPage = new GoogleSearchPage(
				new WebDriverFacade().getWebDriver());
		googleSearchPage.visit();
		googleSearchPage.search("groovy");
		googleSearchPage.shouldSee("Groovy - Home");
	}

}