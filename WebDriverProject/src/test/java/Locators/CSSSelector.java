package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.nopcommerce.com/");
	driver.manage().window().maximize();
	//using tag and ID tag#ID  specifying id is not compulsory
	//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("phones");
	//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("phones");
	
	
	//using tag and class tag.classname  specifying tag is not compulsory
	//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("phones");
	//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("phones");
	
	//using tag and attribute tag.[attribute='value']we can specify either by single quote or double quote
	// but while specifying double quote we have to use backward slash \"value"\  specifying tag is not compulsory
	//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("kurthi");
	driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("kurthi");

	}

}
