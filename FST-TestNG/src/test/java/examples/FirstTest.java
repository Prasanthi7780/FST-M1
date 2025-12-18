package examples;

import org. apache. xmlbeans. impl.xb.xsdschema. Public;
import org.junit.AfterClass;
import org.unit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium. firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
	WebDriver Driver ;
	//Setup Function
	@BeforeClass
	public void SetUp () {
		Driver = new FirefoxDriver();
	}
	//Open new Page
	Driver.get ("https://training-support.net");


	@Test
	public void pageTitleTest () {
	String Pagetitle = Driver.getTitle();
	Assert.assertEquals(Pagetitle, "Training Support");
	}

	@AfterClass
	public void TearDown ()
	{
		Driver.quit ();
	}

	}

