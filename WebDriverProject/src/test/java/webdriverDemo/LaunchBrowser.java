package webdriverDemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

        // Open the URL
        driver.get("https://demo.nopcommerce.com/");

       String acct_title=driver.getTitle();
       if(acct_title.equals("nopCommerce demo store. Home page title"))
       //System.out.println("Page title is: " + acct_title);
       {
    	   System.out.println("test passed");
       }
       else
       {
    	   System.out.println("test failed");
       }
		//driver.close();
	}

}
