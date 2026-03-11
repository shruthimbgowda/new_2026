package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		String title=driver.getTitle();
		System.out.println("title of the web page is  "+  title);
		//driver.findElement(By.id("next2")).click();
	boolean displayStatus=driver.findElement(By.id("cat")).isDisplayed();
		System.out.println(displayStatus);
	List<WebElement> totalLinks=driver.findElements(By.className("a"));
		System.out.println("total number of links: "+ totalLinks.size());
		List<WebElement> totalimages=driver.findElements(By.tagName("img"));
		System.out.println("total number of links: "+ totalimages.size());
		driver.findElement(By.linkText("Sign up")).click();
	}	

}
