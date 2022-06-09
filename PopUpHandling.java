package javaPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://demoqa.com/browser-windows");
		 Thread.sleep(3000);
		 driver.findElement(By.id("tabButton")).click();
		 Thread.sleep(3000);
		 
		 Set<String> WindowsID = driver.getWindowHandles();
		 System.out.println(WindowsID);
		 System.out.println(WindowsID.size());
		 
		 Iterator<String> abc = WindowsID.iterator();
		 String Windows1 = abc.next();
		 String Windows2 = abc.next();
		 
		 driver.switchTo().window(Windows2);
		 System.out.println(Windows2);
		 System.out.println(driver.getTitle());
		 Thread.sleep(3000);
		 driver.close();
		 
		 driver.switchTo().window(Windows1);
		 System.out.println(Windows1);
		 System.out.println(driver.getTitle());
		 Thread.sleep(3000);
		 driver.close();
		 

	}

}
