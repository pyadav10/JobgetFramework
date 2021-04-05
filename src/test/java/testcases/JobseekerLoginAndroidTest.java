package testcases;

import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import objectRepo.HomePage;
import objectRepo.JobListingScreen;
import objectRepo.LandingScreen;
import objectRepo.LoginPage;
import utils.Base;

import org.testng.annotations.BeforeTest;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static java.time.Duration.ofMillis;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class JobseekerLoginAndroidTest extends Base {
	
	LandingScreen act;
	JobListingScreen act1;
	LoginPage act2 ;
	HomePage hm;
	AndroidDriver<AndroidElement> tc;
	Boolean ElementPresent =false;
	
  @Test()
  public void LoginRegUser() throws InterruptedException {
		act.getAJob.click();
		act1.loginButton.click();
		
		System.out.println("Testcase starts");
		act2.email.sendKeys("test05april@yopmail.com");
		act2.password.sendKeys("123456");
		act2.loginButton.click();
		
		
		
		Thread.sleep(10000);
		
		hm.crossButtonProfileNavTour.click();

		hm.profileButtonInNavBar.click();	
		hm.CoachmarkOKButton.click();
		//hm.jobButtonInNavBar.click();
		tc.navigate().back();
	
		Thread.sleep(3000);
		//tc.scrollTo
		
		
ElementPresent =hm.findJob.isDisplayed();
		
		
		for(int i=0;i>10;i++) {
			
			 TouchAction swipe = new TouchAction(tc)
		              .press(PointOption.point(540,1824))
		              .waitAction(waitOptions(ofMillis(800)))
		              .moveTo(PointOption.point(540,672))
		              .release()
		              .perform();
			 
			 if (ElementPresent) {
				 break;
			 }
			
			
		}
		 
		 System.out.println("Test ends");

	  
	  
	  
	  
  }


  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  
	  
		tc = capabilities();
		act = new LandingScreen(tc);
		act1 = new JobListingScreen(tc);
		act2 = new LoginPage(tc);
		hm = new HomePage(tc);
		tc.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() {
  }
  
  
  


}
