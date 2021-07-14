import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Set the property of the webdriver to the location where it is placed/downloaded
		System.setProperty("webdriver.chrome.driver", "/Users/aa/Documents/selenium-test-santosh/chromedriver");

//		Create instance of the chrome driver
		WebDriver driver = new ChromeDriver();

//		Use get method to go to google (launch a new browser session)
		driver.get("www.google.com");

//		Find the text input element by name (locate element with specified selector)
		WebElement element = driver.findElement(By.name("q"));

//		Enter something to search for
		element.sendKeys("Cheese");

//		Submitting the form
		element.submit();

//		Closing the browser (quit driver and associated window)
		driver.quit();

	}

}
