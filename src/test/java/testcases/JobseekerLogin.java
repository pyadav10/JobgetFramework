package testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import net.bytebuddy.asm.Advice.OffsetMapping;
import objectRepo.HomePage;
import objectRepo.JobListingScreen;
import objectRepo.LandingScreen;
import objectRepo.LoginPage;
import utils.Base;

public class JobseekerLogin extends Base {
	
	
	public static void main (String[]  args) throws MalformedURLException, InterruptedException
	{
		
		
		AndroidDriver<AndroidElement> tc = capabilities();

		LandingScreen act = new LandingScreen(tc);
		JobListingScreen act1 = new JobListingScreen(tc);
		LoginPage act2 = new LoginPage(tc);
		HomePage hm = new HomePage(tc);
		
	    tc.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
		act.getAJob.click();
		act1.loginButton.click();
		
		System.out.println("Testcase starts");
		//act2.email.click();
		act2.email.sendKeys("test31march@yopmail.com	");
		act2.password.sendKeys("123456");
		act2.loginButton.click();
		
		
		Thread.sleep(10000);

		hm.profileButtonInNavBar.click();	
		hm.CoachmarkOKButton.click();
		//hm.jobButtonInNavBar.click();
		tc.navigate().back();
	
		Thread.sleep(3000);
		//tc.scrollTo
		
		
		
		 TouchAction swipe = new TouchAction(tc)
	              .press(PointOption.point(540,1824))
	              .waitAction(waitOptions(ofMillis(800)))
	              .moveTo(PointOption.point(540,672))
	              .release()
	              .perform();
		
		 
		 System.out.println("Test ends");
	}
	

}
