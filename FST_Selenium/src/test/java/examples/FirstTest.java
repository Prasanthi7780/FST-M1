package examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {
public static void main(String[] args) {
// Initialize the driver object
WebDriver driver = new FirefoxDriver();

// Open the page
driver.get("https://training-support.net");

// Page interactions

// Close the tab
driver.close();
// Close the browser
driver.quit();

}

}
