package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception{
	 System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.manage().deleteAllCookies();
	 driver.get("https://www.facebook.com/");
	 
	 //type casting of 2 interface
	 JavascriptExecutor jse = (JavascriptExecutor) driver;
	 
	 // locate web element using javascriptExecutor 
	 jse.executeScript("document.getElementById('email'). value='abc@gamil.com'");
	 jse.executeScript("document.getElementById('pass'). value='abc@123'");
	 
	 Thread.sleep(2000);
	 jse.executeScript("window.scrollBy(0, 400)");
	 
	}

}
