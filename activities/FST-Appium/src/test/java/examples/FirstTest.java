package examples;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator20ptions;

public class FirstTest {
// Declaring the required objects
AppiumDriver driver; // Parent for AndroidDriver and IOSDriver
WebDriverWait wait;

@BeforeClass // Setup function
public void setUp() {
// Desired Capabilities
UiAutomator20ptions caps = new UiAutomator20ptions();
caps.setPlatformName("android");
caps.setAutomationName("UiAutomator2");
caps.setApp("path/To/app.apk");
caps. noReset () ;
// Initialize the driver object
driver = new AndroidDriver(serverURL, caps);

}

Run All
public class FirstTest {
// Declaring the required objects
AppiumDriver driver; // Parent for AndroidDriver and IOSDriver
WebDriverWait wait;

@BeforeClass // Setup function
public void setUp() throws MalformedURLException, URISyntaxException {
// Desired Capabilities
UiAutomator20ptions caps = new UiAutomator20ptions();
caps.setPlatformName("android");
caps.setAutomationName("UiAutomator2");
caps.setApp("path/to/app.apk");T
caps.noReset () ;

// Appium Server URL
URL serverURL = new URI("http://localhost:4723").toURL();

// Initialize the driver object
driver = new AndroidDriver(serverURL, caps);

}

@Test
Run | Debug
public void testMethod() {
// Test steps

}

@AfterClass
public void tearDown() {
// Close the app
driver.quit();

}
}
}

