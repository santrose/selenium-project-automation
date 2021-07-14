import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FullForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/aa/Documents/selenium-test-santosh/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/form");

		FormPage formPage = new FormPage();
		formPage.submitForm(driver);

		ConfirmationPage confirmationPage = new ConfirmationPage();
		confirmationPage.waitForAlertBanner(driver);

		assertEquals("The form was successfully submitted!", confirmationPage.getAlertBannerText(driver));

		driver.quit();
	}

}
