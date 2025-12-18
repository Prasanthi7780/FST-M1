package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity7 {
	// Driver object
	WebDriver driver;
	WebDriverWait wait;

	// Setup function
	@BeforeClass
	public void setUp() {
		// Initialize driver
		driver = new FirefoxDriver();

		// Initialize the wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Open the test page
		driver.get("https://training-support.net/webelements/login-form");
	}

	@DataProvider(name = "Credentials")
	public Object[][] creds() {
		return new Object[][] { { "admin", "wrongpassword" }, { "wrongusername", "password" },
				{ "&$_%", "correctpassword" } };
	}

	// Actual tests

	@Test(priority = 1)
	public void pageTitleTest() {
		// assertion
		Assert.assertEquals(driver.getTitle(), "Selenium: Login Form");

	}

	@Test(dataProvider = "Credentials")
	public void invalidLoginTest(String username, String password) throws InterruptedException {
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));

		// Clear username & password fields
		usernameField.clear();
		passwordField.clear();

		// Enter credential
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);

		Thread.sleep(2000);

		// Click login
		driver.findElement(By.xpath("//button[text()='Submit']")).click();

		// Assertions
		String message = driver.findElement(By.id("subheading")).getText();
		Assert.assertEquals(message, "Invalid credentials");
	}

	// Teardown functions
	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}