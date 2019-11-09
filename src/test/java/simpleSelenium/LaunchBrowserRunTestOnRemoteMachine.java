package simpleSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchBrowserRunTestOnRemoteMachine {
	@Test
	public void launchBrowserAndTest() {
		System.setProperty("webdriver.chrome.driver", "E:/Selenium/work/simpleSelenium/src/test/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
		String title = "Cheese";
		driver.findElement(By.name("q")).sendKeys(title);
		driver.findElement(By.name("q")).submit();
		Assert.assertTrue(driver.getTitle().startsWith(title));
		try {
			Thread.sleep(2000);
		} catch (Exception e) {

		}
		driver.quit();
	}
}
