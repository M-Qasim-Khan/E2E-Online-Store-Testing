package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPage {
	
	WebDriver driver;
	
	public LogInPage(WebDriver driver) {
		this.driver = driver;		
	}
	
	
	By username = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='passwd']");
	By signinbutton = By.xpath("//button[@id='SubmitLogin']");
	
	public WebElement getUserName() {
		return driver.findElement(username);
	}
	
	public WebElement getPassword() {
		return driver.findElement(password);
	}
	
	public WebElement getSigninButton() {
		return driver.findElement(signinbutton);
	}

}
