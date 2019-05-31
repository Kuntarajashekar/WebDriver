package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrm {
	WebDriver driver;
	@BeforeTest
	public void open() {
   
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
   }
	@Test
	public void login() throws Exception {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(10000);
	}
	@Test
	public void logout() throws Exception {
		driver.findElement(By.linkText("Welcome Admin")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Logout")).click();
	}
	@AfterTest
	
	public void close() {
		driver.close();
	}
}