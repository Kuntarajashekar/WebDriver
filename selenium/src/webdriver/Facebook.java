package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Facebook {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com/");
		driver.findElement(By.xpath(".//input[@name='email']")).sendKeys("venki.jujjuru@gmail.com");
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("venki.jujjuru@gmail.com");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("pass")).sendKeys("9949492342");
		Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
	    driver.close();	
		

	}

}
