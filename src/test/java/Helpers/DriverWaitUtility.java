package Helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author smishr49
 *
 */

public class DriverWaitUtility {
	public static void waitForRequestsToComplete(WebDriver driverInstance) throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driverInstance;
		long activeRequests = 2;
		if ((Boolean) js.executeScript("return window.jQuery != undefined")) {
			while (activeRequests != 0) {
				activeRequests = (Long) js.executeScript("return jQuery.active");
				System.out.println("Active Requests: " + activeRequests);
				Thread.sleep(3000);
			}
		}
	}

	public static void waitForPageLoad(WebDriver driverInstance) throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driverInstance;
		Object documentState = 3;
		if ((Boolean) js.executeScript("return window.jQuery != undefined")) {
			while (!documentState.equals("complete")) {
				documentState = js.executeScript("return document.readyState");
				System.out.println("Active Requests: " + documentState);
				Thread.sleep(2000);
			}
		}
	}
	public static void waitForElementClickable(WebDriver driverInstance, String Xpath){
		
		WebElement Element = driverInstance.findElement(By.xpath(Xpath));
		WebDriverWait wait = new WebDriverWait(driverInstance,30);
		wait.until(ExpectedConditions.elementToBeClickable(Element));
		
	}
	 
	
}
