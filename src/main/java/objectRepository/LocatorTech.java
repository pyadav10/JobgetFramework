package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTech {

	public static void main(String[] args) {
		
		//I am only here to tell the path of the chromedriver and can be googled easily
		System.setProperty("webdriver.chrome.driver", "E:\\browserDrivers\\chromedriver.exe");
		
		WebDriver rajat = new ChromeDriver(); 
		// I invoke chromeDriver and pass object reference to Rajat(Instance name) You'll learn later about me
	  
		// Program starts from here
		rajat.get("https://hirepreprod.jobget.com/hire/signup");
	
	    rajat.close();

	}

}
