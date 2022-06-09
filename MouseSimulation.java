package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		 Thread.sleep(2000);
		 
		 // creating webElement reference
		 WebElement  Electronics = driver.findElement(By.xpath("//*[text()='Electronics']"));
		 
		// mouse simulATION USING ACTION CLASS
		 Actions act = new Actions(driver);
		 
		 // mouse hover to weblelement
		 Thread.sleep(2000);
		 act.moveToElement(Electronics).build().perform();
		 
		 // right click on webelement
		 Thread.sleep(2000);
		 act.contextClick(Electronics).build().perform();
		 
		 // release the webelement
		 Thread.sleep(2000);
		 act.release(Electronics).build().perform();
		 
		 Thread.sleep(2000);
		 act.sendKeys(Keys.ENTER).build().perform();
		 
		 // 
		 Thread.sleep(2000);
		 driver.navigate().refresh();
		 Thread.sleep(2000);
		 WebElement Home = driver.findElement(By.xpath("//*[text()='Home']"));
		 Thread.sleep(2000);
		 act.sendKeys(Home,Keys.ENTER).build().perform();
		 System.out.println("home menu clicked");
	}

}
