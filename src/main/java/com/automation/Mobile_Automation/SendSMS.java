package com.automation.Mobile_Automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SendSMS {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,9.0);
		 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
		 capabilities.setCapability("appPackage","com.google.android.apps.messaging");
		 capabilities.setCapability("appActivity","com.google.android.apps.messaging.ui.ConversationListActivity");

		 URL url =new URL("http://192.168.71.43:4723/wd/hub");
		 
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,capabilities);
      Thread.sleep(5000);
      
      driver.findElementById("com.google.android.apps.messaging:id/start_new_conversation_button").click();
      driver.findElementById("com.google.android.apps.messaging:id/recipient_text_view").sendKeys("9446281889"+"\n");
      Thread.sleep(3000);
      driver.findElementById("com.google.android.apps.messaging:id/compose_message_text").sendKeys("Welcome to automation");
      driver.findElementById("com.google.android.apps.messaging:id/send_message_button_container").click();
      Thread.sleep(3000);
      driver.quit();
	}

}
