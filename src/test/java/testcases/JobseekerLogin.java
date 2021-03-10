package testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import utils.Base;

public class JobseekerLogin extends Base {
	
	
	public static void main (String[]  args) throws MalformedURLException
	{
		
		
		AndroidDriver<AndroidElement> tc = capabilities();
		tc.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		tc.findElementByXPath("//*[@text='Get a job']").click();
		
	}
	

}
