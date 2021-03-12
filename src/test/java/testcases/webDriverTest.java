package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webDriverTest {

	public static void main(String[] args) throws InterruptedException {
		
		String url ="https://candidatepreprod.jobget.com/jobs/search?w=Noida,%20Uttar%20Pradesh,%20India";
		System.setProperty("webdriver.chrome.driver", "//home//appinventiv//Software//Drivers//chromedriver");
		WebDriver rajat =new ChromeDriver();  
		
		rajat.navigate().to(url);
		
		
		
		
		
		
		//teardown
		Thread.sleep(1000);
		rajat.close();
	}

}
