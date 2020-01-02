package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopingBasket {

	public WebDriver driver;
	
	public ShopingBasket(WebDriver driver) {
		this.driver = driver;
	}

	By summaryProceedtocheckout = By.xpath("//a[@class='button-exclusive btn btn-default']");
	By addressProceedtocheckhout = By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");
	By shippingTermofServices = By.xpath("//input[@id='cgv']");
	By shippingProceedtocheckhout = By.xpath("//*[@id=\"form\"]/p/button/span");
	By paymentByBank = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
	By paymentconfirmorder = By.xpath("//span[contains(text(),'I confirm my order')]");
	By confirmFinalOrder = By.xpath("//strong[contains(text(),'Your order on My Store is complete.')]");

	public WebElement summaryProceedtoCheckOut() {
		return driver.findElement(summaryProceedtocheckout);
	}

	public WebElement addressProceedtoCheckOut() {
		return driver.findElement(addressProceedtocheckhout);
	}
	public WebElement shippingTermofServices() {
		return driver.findElement(shippingTermofServices);
	}
	public WebElement shippingProceedtoCheckOut() {
		return driver.findElement(shippingProceedtocheckhout);
	}
	public WebElement paymentByBank() {
		return driver.findElement(paymentByBank);
	}
	public WebElement paymentConfirmOrder() {
		return driver.findElement(paymentconfirmorder);
	}
	public WebElement confirmFinalOrder() {
		return driver.findElement(confirmFinalOrder);
	}

}
