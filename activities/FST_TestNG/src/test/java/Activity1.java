import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Activity1 {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Create Firefox driver instance
        driver = new FirefoxDriver();

        // Open browser with URL
        driver.get("https://training-support.net");
    }

    @Test
    public void testPageTitleAndNavigation() {
        // Get and print title of the page
        String homeTitle = driver.getTitle();
        System.out.println("Home Page Title: " + homeTitle);

        // Assertion for homepage title
        assertEquals(homeTitle, "Training Support");

        // Find "About Us" button and click it
        driver.findElement(By.id("about-link")).click(); 
        // If ID is different, use linkText("About Us") instead:
        // driver.findElement(By.linkText("About Us")).click();

        // Get title of the new page
        String aboutTitle = driver.getTitle();
        System.out.println("About Page Title: " + aboutTitle);

        // Assertion for new page title
        assertEquals(aboutTitle, "About Training Support");
    }

    @AfterClass
    public void tearDown() {
        // Close browser
        driver.close();
    }
}
