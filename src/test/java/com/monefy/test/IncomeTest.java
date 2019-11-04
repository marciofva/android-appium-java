package com.monefy.test;

import static org.testng.Assert.assertEquals;
import java.util.Map;
import java.util.Map.Entry;
import org.testng.annotations.Test;
import com.monefy.dataprovider.DataProviderIncome;

public class IncomeTest extends BaseTest{
	
	@Test(dataProviderClass = DataProviderIncome.class, dataProvider = "selectDeposit")
	public void addNewIncomeFromDeposit(Map<String, Double> map) {
		
		loopingAllIncomes(map);
	}
	
	
	@Test(dataProviderClass = DataProviderIncome.class, dataProvider = "AllCategories")
	public void addIncomesForAllCategories(Map<String, Double> map) {
		
		loopingAllIncomes(map);
	}
	
	
	public void loopingAllIncomes(Map<String, Double> map) {
		
		Double sumOfIncome = 0.0;
		
		for (Entry<String, Double> entry : map.entrySet()) {
    		
    		//Get the income value in the circle
			Double amonutIncome = addIncomeFlow(entry.getKey(), entry.getValue());
    		
    		//Sum of all income values
			sumOfIncome+=entry.getValue();
    		
    		assertEquals(df.format(sumOfIncome), df.format(amonutIncome));
		}
	}
	
	
	public double addIncomeFlow(String incomeKey, double unitIncome) {
		return dashboard.goToIncomeScreen()
						.goToCategoryPassingExpenseValue(String.valueOf(unitIncome))
						.chooseCategory(incomeKey)
						.getIncomeValueFromCircle();
	}
}
