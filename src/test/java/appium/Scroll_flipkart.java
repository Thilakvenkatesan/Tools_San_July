package appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Scroll_flipkart {
	
	public static AndroidDriver driver;
	int startx;
	int starty;
	int endx;
	int endy;

	@Test(priority=1)
	private void AppLaunch() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("udid", "fujvfulf5diz79by");
		capabilities.setCapability("deviceName", "Redmi Note8 Pro");
		capabilities.setCapability("appPackage", "com.flipkart.android");
		capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AndroidDriver(url, capabilities);
	}

//	@Test(priority=1)
//	private void calculation() {
//
//		WebElement seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
//		seven.click();
//
//		WebElement eight = driver.findElement(AppiumBy.accessibilityId("8"));
//		eight.click();
//
//		WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
//		plus.click();
//
//		WebElement five = driver.findElement(AppiumBy.accessibilityId("5"));
//		five.click();
//
//		WebElement equals = driver.findElement(AppiumBy.accessibilityId("equals"));
//		equals.click();
//
//	}
//	@Test(priority=2)
//	private void flikartAutomate() {
////		WebElement allow = driver.findElement(AppiumBy.accessibilityId("com.android.permissioncontroller:id/permission_allow_button"));
////		allow.click();
//		//driver.findElement(Appium.By.id("com.android.permissioncontroller:id/permission_allow_"))	
//		driver.findElement(AppiumBy.accessibilityId("com.flipkart.android:id/header_container"));
//	}
	
@Test(priority=2)
	private void scrollMethod() throws InterruptedException {
	
	Thread.sleep(4000);
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

		Sequence sequence = new Sequence(finger, 1);

		sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), 481,2039));
		sequence.addAction(finger.createPointerDown(0));
		sequence.addAction(finger.createPointerMove(Duration.ofMillis(500), Origin.viewport(), 481,444 ));
		sequence.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(sequence));

	}


}
