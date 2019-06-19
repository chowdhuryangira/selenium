package systemSetUp;

import java.net.MalformedURLException;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;


public class Setup {
	
	public static Properties obj = new Properties();
	
	
	public static DesiredCapabilities setCapabilities() throws MalformedURLException {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.home")+TestObject.apkFilePathText);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, TestObject.platformVersion); 
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,TestObject.devicename);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,TestObject.platformName);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,TestObject.automationName);
	 
	   //for android version < 4.2
//	   capabilities.setCapability("appPackage", "com.moengage.sampleap");
//		capabilities.setCapability("appActivity","com.moengage.sampleapp.ui.activity.SplashActivity"); // This is Launcher activity of your app (you can get it from apk info app)
	
		return capabilities;
	}
	
	
}
