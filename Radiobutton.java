package javaPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	    
	    // 1st way 
	    driver.findElement(By.xpath("//input[@value='1']")).click();
	   
		

	}

}
