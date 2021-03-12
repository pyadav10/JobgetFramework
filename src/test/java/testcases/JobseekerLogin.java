package testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import objectRepo.JobListingScreen;
import objectRepo.LandingScreen;
import objectRepo.LoginPage;
import utils.Base;

public class JobseekerLogin extends Base {
	
	
	public static void main (String[]  args) throws MalformedURLException
	{
		
		
		AndroidDriver<AndroidElement> tc = capabilities();

		LandingScreen act = new LandingScreen(tc);
		JobListingScreen act1 = new JobListingScreen(tc);
		LoginPage act2 = new LoginPage(tc);
		
	    tc.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		act.getAJob.click();
		act1.loginButton.click();
		
		System.out.println("Testcase starts");
		//act2.email.click();
		act2.email.sendKeys("normaltest@yopmail.com	");
		act2.password.sendKeys("Test@123");
		
		
		
		
		
		tc.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		
		
		
	}
	

}
