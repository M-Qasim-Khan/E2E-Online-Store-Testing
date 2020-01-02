package Automation;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;

public class HomePageTest extends Base {
	
	@BeforeTest
	public void initializeBrowser() throws IOException {
		
		driver = openBrowser();
	}
	@AfterTest
	public void closeBrowser() {
		//driver.close();
		driver = null;
	}
	
	@Test
	public void sginIn() {
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.getSignIn().click();
		
	}

}
