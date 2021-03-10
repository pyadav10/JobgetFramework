package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LandingScreen {
	
	public LandingScreen(AndroidDriver<AndroidElement> driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/tv_get_job') ]")
	public WebElement getAJob ;
	
	@AndroidFindBy(xpath="//*[@text='Hire staff']")
	public WebElement HireStaff ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/tv_welcome') ]")
	public WebElement welcomeText ;	
	
	
	

}
