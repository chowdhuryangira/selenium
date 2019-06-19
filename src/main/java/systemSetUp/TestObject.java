package systemSetUp;

import java.io.FileInputStream;
import java.util.Properties;

public class TestObject {
	
	public static Properties obj = new Properties();
	public static Properties xPath = getXpathProperties();
	public static Properties elementId = getElementIdProperties();
	public static Properties dynamicText = getDynamicTextProperties();
	
	//xpath
	public static String openNavigationDrawerPath = xPath.getProperty("openNavigationDrawerPath");
	public static String addEventPath = xPath.getProperty("addEventPath");
	
	//element Id
	public static String permissionAllowButtonId = elementId.getProperty("permissionAllowButtonId");
	public static String eventNameId = elementId.getProperty("eventNameId");
	public static String editAttributeNameId = elementId.getProperty("editAttributeNameId");
	public static String editAttributeValueId = elementId.getProperty("editAttributeValueId");
	public static String actionTrackId = elementId.getProperty("actionTrackId");
	
	//dynamic Text
	public static String apkFilePathText = dynamicText.getProperty("apkFilePathText");
	public static String platformVersion = dynamicText.getProperty("platformVersion");
	public static String devicename = dynamicText.getProperty("devicename");
	public static String platformName = dynamicText.getProperty("platformName");
	public static String automationName = dynamicText.getProperty("automationName");
	public static String serverURL = dynamicText.getProperty("serverURL");

	public static Properties getXpathProperties() {
		 
		try {
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/objectRepo/xPath.properties");
		obj.load(objfile);
	}
		catch(Exception e) {
			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		
		return obj;
	}
	
	public static Properties getElementIdProperties() {
		try {
			
			FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/objectRepo/elementId.properties");
			obj.load(objfile);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return obj;
	}
	
	public static Properties getDynamicTextProperties() {
		try {
			
			FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/objectRepo/dynamicText.properties");
			obj.load(objfile);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return obj;
	}
}
