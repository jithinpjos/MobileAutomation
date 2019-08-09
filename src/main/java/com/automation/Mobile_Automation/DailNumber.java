package com.automation.Mobile_Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DailNumber {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,9.0);
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		 capabilities.setCapability("appPackage","com.google.android.dialer");
		 capabilities.setCapability("appActivity","com.google.android.dialer.DialtactsActivity");

		 URL url =new URL("http://192.168.71.43:4723/wd/hub");
		 
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,capabilities);
       Thread.sleep(5000);
       
       driver.findElementById("com.google.android.dialer:id/fab").click();
       
       driver.findElementById("com.google.android.dialer:id/nine").click();
       driver.findElementById("com.google.android.dialer:id/four").click();
       driver.findElementById("com.google.android.dialer:id/four").click();
       driver.findElementById("com.google.android.dialer:id/six").click();
       driver.findElementById("com.google.android.dialer:id/two").click();
       driver.findElementById("com.google.android.dialer:id/eight").click();
       driver.findElementById("com.google.android.dialer:id/one").click();
       driver.findElementById("com.google.android.dialer:id/eight").click();
       driver.findElementById("com.google.android.dialer:id/eight").click();
       driver.findElementById("com.google.android.dialer:id/nine").click();
       Thread.sleep(3000);
       driver.findElementById("com.google.android.dialer:id/dialpad_floating_action_button").click();
       Thread.sleep(10000);
       driver.quit();
	}

}
