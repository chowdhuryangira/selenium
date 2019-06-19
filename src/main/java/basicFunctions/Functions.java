package basicFunctions;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Functions {
	
	public WebDriver driver;
	public static WebDriverWait wait;
	private Scanner scanner = new Scanner(System.in);
	
	public Functions(WebDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		
	}
	
	
	
	public void click(By by) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(by)).click();
		
	}
	
	
	
	public void insertText(By by, String input) {
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(by)).sendKeys(input);
		
	}
	
	
	
	public void scrolldown(By by) {
		
		TouchActions action = new TouchActions(driver);
		action.scroll(driver.findElement(by), 10, 100);
		action.perform();
		
	}
	
	
	
	@SuppressWarnings("resource")
	public int inputNumberOfAttributes() {
		
		int number = scanner.nextInt();
		return number;
		
	}
	
	
	

	
	}
