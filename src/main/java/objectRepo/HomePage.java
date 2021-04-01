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
	public WebElement jobButtonInNavBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Community' and contains(@resource-id,'com.jobget:id/smallLabel')]")
	public WebElement communityButtonInNavBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Extra Income' and contains(@resource-id,'com.jobget:id/smallLabel1')]")
	public WebElement extraIncomeButtonInNavBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Messages' and contains(@resource-id,'com.jobget:id/smallLabel')]")
	public WebElement messagesButtonInNavBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Profile' and contains(@resource-id,'com.jobget:id/smallLabel')]")
	public WebElement profileButtonInNavBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Profile' and contains(@resource-id,'com.jobget:id/smallLabel')]")
	public WebElement jobSearch ;
	
	@AndroidFindBy(xpath="//*[@resource-id='com.jobget:id/tv_search_tutorial_ok']")
	public WebElement CoachmarkOKButton ;
	
	
	
	
	
	
	
	
	

}
