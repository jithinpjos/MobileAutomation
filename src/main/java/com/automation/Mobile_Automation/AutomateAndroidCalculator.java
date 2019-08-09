package com.automation.Mobile_Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AutomateAndroidCalculator {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,9.0);
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		 capabilities.setCapability("appPackage","com.android.calculator2");
		 capabilities.setCapability("appActivity","com.android.calculator2.Calculator");

		 URL url =new URL("http://192.168.71.43:4723/wd/hub");
		 
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,capabilities);
        Thread.sleep(5000);
        
        driver.findElementById("com.android.calculator2:id/digit_7").click();
        driver.findElementById("com.android.calculator2:id/op_add").click();
        driver.findElementById("com.android.calculator2:id/digit_3").click();
        driver.findElementById("com.android.calculator2:id/eq").click();
        Thread.sleep(3000);
        String result=driver.findElementById("com.android.calculator2:id/result").getText();
        System.out.println(result);
        driver.quit();
	}

}
