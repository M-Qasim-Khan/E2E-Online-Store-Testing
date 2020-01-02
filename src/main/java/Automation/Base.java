package Automation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static WebDriver driver;
	public static Properties prop;

	public WebDriver openBrowser() throws IOException {

		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\qasim\\eclipse-workspace\\OnlineStoreTesting\\src\\main\\java\\Automation\\datadriven.properties");
		prop.load(fis);

		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty(prop.getProperty("key"), prop.getProperty("value"));
			driver = new ChromeDriver();
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		return driver;

	}
	
	public void getScreenShots(String result) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\qasim\\eclipse-workspace\\test\\"+result+"screeshots.png"));
	}

}
