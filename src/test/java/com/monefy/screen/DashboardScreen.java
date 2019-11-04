package com.monefy.screen;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class DashboardScreen extends BaseScreen{

	public DashboardScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ImageView")
	private MobileElement expenseImageIcon;
	
	@AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.TextView")
	private MobileElement expensePercentageText;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/income_amount_text")
	private MobileElement incomeAmountText;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/expense_amount_text")
	private MobileElement expenseAmountText;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/expense_button")
	private MobileElement expenseBtn;
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/income_button")
	private MobileElement incomeBtn;
	
	public CalculationScreen goToExpenseScreen() {
		clickOn(expenseBtn);
		return new CalculationScreen(driver);
	}
	
	public CalculationScreen goToIncomeScreen() {
		clickOn(incomeBtn);
		return new CalculationScreen(driver);
	}
	
	public double getIncomeValueFromCircle() {
		String incomeValue = waitForElementVisibility(incomeAmountText).getText();
		return convertValueToDouble(incomeValue);
	}
	
	public double getExpenseValueFromCircle() {
		String expenseValue = waitForElementVisibility(expenseAmountText).getText();
		return convertValueToDouble(expenseValue);
	}
	
	public double convertValueToDouble(String value) {
		String formatValue = value.substring(1, value.length());
		return Double.valueOf(formatValue.replaceAll(",", ""));
	}
}
