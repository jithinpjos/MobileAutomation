package com.automation.Mobile_Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class VerticalScrolling {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,9.0);
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		 capabilities.setCapability("appPackage","io.appium.android.apis");
		 capabilities.setCapability("appActivity","io.appium.android.apis.ApiDemos");

		 URL url =new URL("http://192.168.71.43:4723/wd/hub");
		 
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,capabilities);
      Thread.sleep(5000);
      MobileElement element = (MobileElement) driver.findElement(
    		  MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView("
				+ "new UiSelector().description(\"Views\"));"));
      System.out.println(element.getLocation());
      element.click();
      
      MobileElement element1 = (MobileElement) driver.findElement(
    		  MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView("
				+ "new UiSelector().description(\"Switches\"));"));
      System.out.println(element1.getLocation());
      element1.click();
	}

}
