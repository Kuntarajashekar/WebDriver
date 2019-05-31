package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgprog {
	WebDriver driver;
	@BeforeTest
	public void open() throws Exception {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		System.out.println("opent firefox browser");
		Thread.sleep(5000);
	}
	@Test
	public void run() throws Exception {
		driver.findElement(By.id("identifierId")).sendKeys("rajashekarreddy2025@gmail.com");
		Thread.sleep(5000);
	    driver.findElement(By.name("identifierNext")).click();
		
		System.out.println("First registration");
	}
	@Test
	public void run1() {
		System.out.println("Second registration");
	}
	@AfterTest
	public void close() {
		System.out.println("logout");
	}
	
	
	

}
