package Test1;


	import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.MobileElement;

	public class TestScript {
		
		
		static AppiumDriver<MobileElement> driver;
		
		
		public static void main(String[] args) {
			
			try {
				appiumTest1();
			} catch (Exception exp) {
				System.out.println(exp.getCause());
				System.out.println(exp.getMessage());
				exp.printStackTrace();
			}
		}
		
		public static void appiumTest1() throws Exception
		{
			DesiredCapabilities caps= new DesiredCapabilities();
			caps.setCapability("deviceName", "OnePlus 9 Pro");
			caps.setCapability("udid", "1c43c60e");
			//caps.setCapability("udid", "RZCW40WJ4ZD");
			//RZCW40WJ4ZD
			caps.setCapability("platformName", "Android");
			caps.setCapability("platformVersion", "13");
			//caps.setCapability("appPackage", "com.ubercab");
			//caps.setCapability("appActivity", "com.ubercab.presidio.app.core.root.RootActivity");
			caps.setCapability("appPackage", "com.oneplus.calculator");
			caps.setCapability("appActivity", "com.android.calculator2.Calculator");
			
			URL url=new URL("http://127.0.0.1:4723/wd/hub");
			driver= new AppiumDriver<MobileElement>(url, caps);
		
			System.out.println("Application Started.....!!!!!");
			
			MobileElement nine=driver.findElement(By.id("com.oneplus.calculator:id/digit_9"));
			nine.click();
			MobileElement add=driver.findElement(By.id("com.oneplus.calculator:id/op_add"));
			add.click();
			MobileElement five=driver.findElement(By.id("com.oneplus.calculator:id/digit_5"));
			five.click();
			MobileElement multiply=driver.findElement(By.id("com.oneplus.calculator:id/img_op_mul"));
			multiply.click();
			MobileElement four=driver.findElement(By.id("com.oneplus.calculator:id/digit_4"));
			four.click();
			MobileElement zero=driver.findElement(By.id("com.oneplus.calculator:id/digit_0"));
			zero.click();
			MobileElement divide=driver.findElement(By.id("com.oneplus.calculator:id/op_div"));
			divide.click();
			MobileElement two=driver.findElement(By.id("com.oneplus.calculator:id/digit_2"));
			two.click();
			
			MobileElement equals=driver.findElement(By.id("com.oneplus.calculator:id/img_eq"));
			equals.click();
			
			MobileElement text=driver.findElement(By.id("com.oneplus.calculator:id/result"));
			String result=text.getText();
			System.out.println("Result is = " +result);
			
			System.out.println("Completed....!!!");
					
			driver.closeApp();
		}
	}
//	Value=9+5*40/2
//	=9+5*20
//	=9+100
//	=109
