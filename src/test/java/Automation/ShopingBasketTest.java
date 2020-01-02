package Automation;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mongodb.assertions.Assertions;

import junit.framework.Assert;
import pageObjects.LandingPage;
import pageObjects.LogInPage;
import pageObjects.ShopingBasket;
import pageObjects.ShopingPage;

public class ShopingBasketTest extends Base {

	@BeforeTest
	public void initializeBrowser() throws IOException {

		driver = openBrowser();
		
	}

	@AfterTest
	public void closeBrowser() {
		//driver.close();
		//driver = null;
	}

	@Test
	public void confirmOrder() throws InterruptedException {
		driver.get(prop.getProperty("url"));

		LandingPage lp = new LandingPage(driver);
		lp.getSignIn().click();

		LogInPage lip = new LogInPage(driver);
		lip.getUserName().sendKeys(prop.getProperty("username"));
		lip.getPassword().sendKeys(prop.getProperty("password"));
		lip.getSigninButton().click();

		ShopingPage sp = new ShopingPage(driver);
		sp.searchBox().sendKeys("Printed Chiffon Dress");
		sp.searchButton().click();
		sp.addToCart().click();
		sp.proceedToCheckhout().click();

		ShopingBasket sb = new ShopingBasket(driver);
		sb.summaryProceedtoCheckOut().click();
		sb.addressProceedtoCheckOut().click();
		sb.shippingTermofServices().click();
		sb.shippingProceedtoCheckOut().click();
		sb.paymentByBank().click();
		sb.paymentConfirmOrder().click();

		Assert.assertEquals(prop.getProperty("ordermessage"), sb.confirmFinalOrder().getText());
	}

}
