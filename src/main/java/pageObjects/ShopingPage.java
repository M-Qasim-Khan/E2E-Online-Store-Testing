package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopingPage {

	public WebDriver driver;

	public ShopingPage(WebDriver driver) {
		this.driver = driver;
	}

	By searchbox = By.id("search_query_top");
	By searchbutton = By.name("submit_search");
	By addtocart = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span");
	By proceedToCheckOut = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span");
	
	public WebElement searchBox() {
		return driver.findElement(searchbox);
	}
	public WebElement searchButton() {
		return driver.findElement(searchbutton);
	}
	public WebElement addToCart() {
		return driver.findElement(addtocart);
	}
	public WebElement proceedToCheckhout() {
		ExpectedConditions.elementToBeClickable(proceedToCheckOut);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckOut));
		return driver.findElement(proceedToCheckOut);
	}

}
