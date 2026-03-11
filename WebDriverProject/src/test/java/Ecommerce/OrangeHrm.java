package Ecommerce;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;


/* 1) open application
   2) Test logo presence
   3) login to application
   4) logout from application
 */

public class OrangeHrm {
	
	WebDriver driver;
     
	    @Test(priority=1)
	    void openapp()
	    {
		   driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   driver.manage().window().maximize();
	    }
	
		@Test(priority=2)
		void testLogo() throws InterruptedException
		{
			Thread.sleep(3000);
			boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
			System.out.println("logo displayed...."+status);
			
		}

		@Test(priority=3)
		void testLogin()
		{
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		
			
		}
		
		@Test(priority=4)
		void testLogout()
		{
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		}
		
}
