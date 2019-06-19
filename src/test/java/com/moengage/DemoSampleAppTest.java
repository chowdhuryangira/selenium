package com.moengage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import basicFunctions.Functions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import systemSetUp.Setup;
import systemSetUp.TestObject;

public class DemoSampleAppTest {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Functions func;
	
	@BeforeClass
	public static void setUpTest() throws MalformedURLException{
		
		
		//It will launch the sampleApp App in Android Device using the configurations specified in Desired Capabilities
		driver = new AndroidDriver<MobileElement>(new URL(TestObject.serverURL), Setup.setCapabilities());
		wait = new WebDriverWait(driver, 10);
		func = new Functions(driver);
		
	}
	
	
	
	@Test
	public void testSampleApp() throws Exception {

		   //click the permission allow button.
			func.click(By.id(TestObject.permissionAllowButtonId));
			
			//open the menu
			func.click(By.xpath(TestObject.openNavigationDrawerPath));
			
			//naviagte to Add event fragment
			func.click(By.xpath(TestObject.addEventPath));
			
			//enter the event details
			func.insertText(By.id(TestObject.eventNameId), "event1");

			
			
			
			
			
			
			
			
			//track the event
			func.click(By.id(TestObject.actionTrackId));
			
			

		}
	
	

//	@AfterClass
//	public static void teardown(){
//		//close the app
//		driver.quit();
//	}

}
