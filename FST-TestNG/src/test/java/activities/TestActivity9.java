package activities;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestActivity9 {
	// Driver object
	WebDriver driver;

	// Setup function
	@BeforeClass(alwaysRun = true)
	public void setUp() {
		// Initialize driver
		driver = new FirefoxDriver();
		Reporter.log("Starting Test |");
		// Open the test page
		driver.get("https://training-support.net/webelements/alerts");
		Reporter.log("Opened Browser |");
	}
	
	// To switch focus back to the main page
	@BeforeMethod
	public void switchFocus() {
		driver.switchTo().defaultContent();
	}
	
	@Test
	public void simpleAlertTestCase() {
		// Find the button to open a SIMPLE alert and click it
		driver.findElement(By.xpath("//button[@id='simple']")).click();		
		Reporter.log("Simple Alert opened |");
		// Switch the focus from the main window to the Alert box and get the text in it and print it
		Alert simpleAlert = driver.switchTo().alert();
		String simpleAlertText = simpleAlert.getText();
		System.out.println(simpleAlertText);
		Reporter.log("Alert text is: " + simpleAlertText + " |");
		Assert.assertEquals("You've just triggered a simple alert!", simpleAlertText);
		simpleAlert.accept();
		Reporter.log("Simple alert closed");
		
	}
	
	@Test
	public void confirmAlertTestCase() {
		// Find the button to open a CONFIRM alert and click it
		WebElement confirmation = driver.findElement(By.xpath("//button[@id='confirmation']"));
		confirmation.click();
		Reporter.log("Confirm Alert opened |");
		// Switch the focus from the main window to the Alert box and get the text in it and print it
		Alert confirmationAlert = driver.switchTo().alert();
		String confirmationAlertText = confirmationAlert.getText();
		System.out.println(confirmationAlertText);
		Reporter.log("Alert text is: " + confirmationAlertText + " |");		 
        Assert.assertEquals("You've just triggered a confirmation alert!", confirmationAlertText);
		confirmationAlert.dismiss();
		Reporter.log("Confirmation Alert closed |");
	}
	
	@Test
	public void promptAlertTestCase() {
		// Find the button to open a PROMPT alert and click it
		WebElement prompt = driver.findElement(By.xpath("//button[@id='prompt']"));
		prompt.click();
		Reporter.log("Prompt Alert opened |");
		// Switch the focus from the main window to the Alert box and get the text in it and print it
		Alert promptAlert = driver.switchTo().alert();
		String promptAlertText = promptAlert.getText();
		System.out.println(promptAlertText);
		Reporter.log("Alert text is: " + promptAlertText + " |");
        Assert.assertEquals("I'm a Prompt! Type something into me!", promptAlertText);
		promptAlert.sendKeys("Awesome!");
		// Close the alert by clicking Ok
		promptAlert.accept();
		Reporter.log("Prompt Alert closed |");
	}
	
	// Teardown function
	@AfterClass(alwaysRun = true)
	public void tearDown() {
		Reporter.log("Ending Test |");
		// Close the browser
		driver.quit();
	}
}