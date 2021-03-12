package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class JobListingScreen {
	
	public JobListingScreen(AndroidDriver<AndroidElement> driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	//Elements from login screen 
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/tv_get_job') ]")
	public WebElement getAJob ;
	
	@AndroidFindBy(xpath="//*[@text='Hire staff']")
	public WebElement HireStaff ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/tv_welcome') ]")
	public WebElement welcomeText ;	
	
	// elements from listing screen
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/tv_login')  ]")
	public WebElement loginButton ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/tv_signup')  ]")
	public WebElement signUpButton ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/tv_continue_with_fb')  ]")
	public WebElement loginButtonFB ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/tv_toolbar_title')  ]")
	public WebElement searchToolBar ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/iv_back')  ]")
	public WebElement onScreenBackButton ;

	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/iv_book')  ]")
	public WebElement mapViewButton ;
	

}
