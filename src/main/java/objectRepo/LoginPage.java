package objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {
	
	public LoginPage(AndroidDriver<AndroidElement> driver) 
	{
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	/*
	 	@AndroidFindBy(xpath="//android.widget.TextView[ @text='Email Address']")
	public WebElement elementName ;
	 */
	@AndroidFindBy(xpath="//android.widget.EditText[ @text='Email Address' or contains(@resource-id, 'com.jobget:id/et_email_address')]")
	public WebElement email ;
	
	
	

	
	@AndroidFindBy(xpath="//android.widget.EditText[ @text='Password' or contains(@resource-id, 'com.jobget:id/et_password')]")
	public WebElement password ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/iv_back') ]")
	public WebElement backButton ;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/iv_app_logo') ]")
	public WebElement appLogo ;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/tv_welcome_back') ]")
	public WebElement getAJobText ;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@resource-id,'com.jobget:id/tv_show_hide_password') ]")
	public WebElement showHidePass ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[ @text='Log in' or contains(@resource-id, 'com.jobget:id/tv_login') ]")
	public WebElement loginButton ;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[ @text='Log in' or contains(@resource-id, 'com.jobget:id/tv_signup') ]")
	public WebElement signUpLink ;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Don't have an account?' ]")
	public WebElement doNotAccountTextInfo ;
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='' or contains(@resource-id, 'com.jobget:id/tv_forgot_password') ]")
	public WebElement forgotPassword ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
