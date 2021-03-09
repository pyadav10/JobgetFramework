package objectRepository;


import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.AndroidMobileCapabilityType;


public class Base {
	
	static AndroidDriver<AndroidElement>  driver;
	public static String AUTappName ="jobget_pre_prod_4_feb.apk";
	
	
	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{

	

        File appDir = new File("src");
        File app = new File(appDir,AUTappName);
	     DesiredCapabilities dc = new DesiredCapabilities();
	     
	     
	     dc.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
	        dc.setCapability(MobileCapabilityType.UDID, "b81bde2");
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.jobget");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activities.SplashActivity");
	        dc.setCapability("autoGrantPermissions", true);//appium decides which permissiosn to grant
	     
	     dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
	     dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	     dc.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,30);
	    driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), dc);
	   
	   return driver;
	}
	
	//function to take screenshot
		public static void getScreenshot(String s) throws IOException
		{
		  File scrfile=	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(scrfile,new File(System.getProperty("user.dir")+"\\"+s+".png"));
		
		}
		
		
		/*public MobileElement scrollToElement(String Parent_resource, String Child_resource)
		{
			return (MobileElement) ((FindsByAndroidUIAutomator) driver).findElementByAndroidUIAutomator(
					"new UiScrollable(new UiSelector()" + ".description(Parent_resource))"
							+ ".scrollIntoView(" + "new UiSelector().description(Child_resource));");
			
		} */

}
