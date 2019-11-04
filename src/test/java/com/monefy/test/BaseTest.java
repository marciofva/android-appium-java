package com.monefy.test;

import java.text.DecimalFormat;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import com.monefy.factory.DriverFactory;
import com.monefy.screen.DashboardScreen;
import com.monefy.screen.CalculationScreen;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class BaseTest {
	
	public static AppiumDriver<MobileElement> driver;
	protected DashboardScreen dashboard;
	protected CalculationScreen expense;
	public DecimalFormat df = new DecimalFormat("#0.0");
	
	@BeforeMethod(alwaysRun = true)
	@Parameters({ "platform", "device" })
	public void setup(String platform, String device) {

		driver = DriverFactory.getInstance(platform, device);
		dashboard = new DashboardScreen(driver);
	}
	
	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}
}
