import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/aa/Documents/selenium-test-santosh/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://formy-project.herokuapp.com/autocomplete");

		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		autocomplete.sendKeys("64 Lombardy Crescent, Scarborough, ON");

		Thread.sleep(1000);

		WebElement autocompleteResult = driver.findElement(By.className("pac-item"));
		autocompleteResult.click();

		Thread.sleep(1000);
		driver.quit();

	}
}
