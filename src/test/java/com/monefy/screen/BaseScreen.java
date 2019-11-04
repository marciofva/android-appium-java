package com.monefy.screen;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import com.monefy.calculator.CalculatorSection;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class BaseScreen extends CalculatorSection{
	
	private static final int POLLING_TIMEOUT = 250;
	private static final int MAX_SECONDS_TIMEOUT = 60;
	protected AppiumDriver<MobileElement> driver;
	private Wait<WebDriver> wait;
	
	public BaseScreen(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
		this.wait =  new FluentWait<WebDriver>(driver).
						withTimeout(Duration.ofSeconds(MAX_SECONDS_TIMEOUT)).
						pollingEvery(Duration.ofMillis(POLLING_TIMEOUT)).
						ignoring(NoSuchElementException.class).
						ignoring(StaleElementReferenceException.class).
						ignoring(IndexOutOfBoundsException.class);
	}
	

	protected void clickOn(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}


	protected MobileElement waitForElementVisibility(MobileElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
}
