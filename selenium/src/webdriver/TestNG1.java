package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 {

	public static WebDriver wd;
	
	@Test(priority=1)
	
	public void launchBrowser()
	{
		 wd=new FirefoxDriver();
		 wd.manage().window().maximize();
		 wd.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@Test(priority=3)
	
	public void verifyTitle()
	{
		wd.get("https://www.google.co.in");
		Assert.assertEquals(wd.getTitle(), "Google");
		
	}
	
	
	@Test(priority=5)
	
	public void closeBrowser()
	{
		
		wd.close();
	}
	
	
	@Test(priority=2)
	
	public void verifyGmailTitle()
	{
		wd.get("http://www.gmail.com");
		
		Assert.assertEquals("Gmail", wd.getTitle());
	}
		
		
		@Test(priority=4,enabled=false)
		
		public void verifyYahooTitle()
		{
			wd.get("https://in.yahoo.com/");
			Assert.assertEquals("Yahoo", wd.getTitle());
			
			
		}
	
}
