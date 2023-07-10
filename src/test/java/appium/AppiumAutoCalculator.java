package appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Origin;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AppiumAutoCalculator {

	public static AndroidDriver driver;
	int startx;
	int starty;
	int endx;
	int endy;

	@Test
	private void AppLaunch() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();

		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "11");
		capabilities.setCapability("udid", "fujvfulf5diz79by");
		capabilities.setCapability("deviceName", "Redmi Note8 Pro");
		capabilities.setCapability("appPackage", "com.google.android.calculator");
		capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");

		driver = new AndroidDriver(url, capabilities);
	}

	@Test
	private void calculation() {

		WebElement seven = driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
		seven.click();

		WebElement eight = driver.findElement(AppiumBy.accessibilityId("8"));
		eight.click();

		WebElement plus = driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		plus.click();

		WebElement five = driver.findElement(AppiumBy.accessibilityId("5"));
		five.click();

		WebElement equals = driver.findElement(AppiumBy.accessibilityId("equals"));
		equals.click();

	}

	private void scrollMethod() {
		PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");

		Sequence sequence = new Sequence(finger, 1);

		sequence.addAction(finger.createPointerMove(Duration.ofMillis(0), Origin.viewport(), startx, starty));
		sequence.addAction(finger.createPointerDown(0));
		sequence.addAction(finger.createPointerMove(Duration.ofMillis(500), Origin.viewport(), endx, endy));
		sequence.addAction(finger.createPointerUp(0));
		driver.perform(Arrays.asList(sequence));

	}

}
