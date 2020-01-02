package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By signin = By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a");

	public WebElement getSignIn() {

		return driver.findElement(signin);

	}

}
