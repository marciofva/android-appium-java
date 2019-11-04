package com.monefy.screen;

import java.util.List;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CalculationScreen extends BaseScreen{

	public CalculationScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id = "com.monefy.app.lite:id/relativeLayoutChooseCategory")
	private MobileElement chooseCategoryBtn;
	
	@AndroidFindBy(xpath = "//*[@resource-id='com.monefy.app.lite:id/textCategoryName']")
	private List<MobileElement> categoryList;
	

	public CalculationScreen seeAllCategories() {
		clickOn(chooseCategoryBtn);
		return this;
	}
	

	public DashboardScreen chooseCategory(String categoryName) {
		
		for(MobileElement element : categoryList) {
			if (element.getText().equalsIgnoreCase(categoryName)) {
				clickOn(element);
				break;
			}
		}
		return new DashboardScreen(driver);
	}


	public void calculator(String amount) {
		waitForElementVisibility(chooseCategoryBtn);
		pressCalculatorKey(amount);
	}


	public CalculationScreen goToCategoryPassingExpenseValue(String amountValue) {
		calculator(amountValue);
		seeAllCategories();
		return new CalculationScreen(driver);
	}
}
