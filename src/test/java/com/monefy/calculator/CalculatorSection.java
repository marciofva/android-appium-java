package com.monefy.calculator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalculatorSection {
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard1")
	protected MobileElement buttonKeyboard1;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard2")
	protected MobileElement buttonKeyboard2;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard3")
	protected MobileElement buttonKeyboard3;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard4")
	protected MobileElement buttonKeyboard4;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard5")
	protected MobileElement buttonKeyboard5;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard6")
	protected MobileElement buttonKeyboard6;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard7")
	protected MobileElement buttonKeyboard7;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard8")
	protected MobileElement buttonKeyboard8;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard9")
	protected MobileElement buttonKeyboard9;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboard0")
	protected MobileElement buttonKeyboard0;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/buttonKeyboardDot")
	protected MobileElement buttonKeyboardDot;
	
	
	public void pressCalculatorKey(String amountValue) {
		
		char[] chars = amountValue.toCharArray();

		for (char ch : chars) {
			pressKey(ch);
		}
	}
	

	public void pressKey(char key) {
		
		switch (key) {
			case '1':
				buttonKeyboard1.click();
				break;
			case '2':
				buttonKeyboard2.click();
				break;
			case '3':
				buttonKeyboard3.click();
				break;
			case '4':
				buttonKeyboard4.click();
				break;
			case '5':
				buttonKeyboard5.click();
				break;
			case '6':
				buttonKeyboard6.click();
				break;
			case '7':
				buttonKeyboard7.click();
				break;
			case '8':
				buttonKeyboard8.click();
				break;
			case '9':
				buttonKeyboard9.click();
				break;
			case '0':
				buttonKeyboard0.click();
				break;
			case '.':
				buttonKeyboardDot.click();
				break;
		}
	}
}
