package testcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestDemo {

	public static void main(String[] args) throws MalformedURLException {
		
		File f = new File("src"); //to set path to source folder of project
		File fs = new File(f,"jobget_live_24_feb_updated.apk"); // send path till source and app name		
		
		
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());// sending the complete path
        cap.setCapability(MobileCapabilityType.UDID, "b81bde2");
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.jobget");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".activities.SplashActivity");

		   cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		   cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		   cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,30);
		AndroidDriver<AndroidElement> driver = new  AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap) ;
		
		
		
		driver.close();
		

	}

}
