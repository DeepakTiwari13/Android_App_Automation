package com.appium.training;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LaunchFlipkart {

	WebDriver driver;

	/* This function Runtheflipkartapkfile uses parameters platformName,deviceName,
	 * platformVersion and absolutepath to launch the Flipkart apk file
	 * Date 19-10-2015
	 *  
	 * 
	 */
	@Test
	public void Runtheflipkartapkfile() throws IOException {

		File app = new File(
				System.getProperty("user.dir")
						+ "\\src\\test\\app\\com\\appium\\android\\application\\Flipkart.apk");
		DesiredCapabilities desiredcap = new DesiredCapabilities();
		desiredcap.setCapability("platformName", "Android");
		desiredcap.setCapability("deviceName", "Google Nexus 5");
		desiredcap.setCapability("platformVersion", "5.1.0");
		desiredcap.setCapability("app", app.getAbsolutePath());
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredcap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@AfterTest
	public void Aftertestactivity() throws InterruptedException {
		Thread.sleep(5000l);
		driver.quit();

	}
}
