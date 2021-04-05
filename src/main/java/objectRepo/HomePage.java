package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	public HomePage(AndroidDriver<AndroidElement> driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Jobs' and contains(@resource-id,'com.jobget:id/largeLabel')]")
	public AndroidElement jobButtonInNavBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Community' and contains(@resource-id,'com.jobget:id/smallLabel')]")
	public AndroidElement communityButtonInNavBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Extra Income' and contains(@resource-id,'com.jobget:id/smallLabel1')]")
	public AndroidElement extraIncomeButtonInNavBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Messages' and contains(@resource-id,'com.jobget:id/smallLabel')]")
	public AndroidElement messagesButtonInNavBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Profile' and contains(@resource-id,'com.jobget:id/smallLabel')]")
	public AndroidElement profileButtonInNavBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Profile' and contains(@resource-id,'com.jobget:id/smallLabel')]")
	public AndroidElement jobSearch ;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.jobget:id/tv_search_tutorial_ok']")
	public AndroidElement CoachmarkOKButton ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(text(), 'Test') and contains(text(), 'job') and contains(text(), '123124')]")
	public AndroidElement findJob ;
	
	@AndroidFindBy(xpath="//android.widget.ImageView[@resource-id='com.jobget:id/iv_cross_home']")
	public AndroidElement crossButtonProfileNavTour ;
	
	
	
	
	
	
	
	
	
	
	
	

}
