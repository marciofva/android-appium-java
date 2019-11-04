package com.monefy.test;

import static org.testng.Assert.assertEquals;
import java.util.Map;
import java.util.Map.Entry;
import org.testng.annotations.Test;
import com.monefy.dataprovider.DataProviderExpenses;

public class ExpenseTest extends BaseTest{
	
	@Test(dataProviderClass = DataProviderExpenses.class, dataProvider = "selectBillCarClothes")
	public void addNewExpensesForBillCarAndClothes(Map<String, Double> map) {
		
		loopingAllExpenses(map);
	}
	
	
	@Test(dataProviderClass = DataProviderExpenses.class, dataProvider = "allCategories")
	public void addExpensesForAllCategories(Map<String, Double> map) {
		
		loopingAllExpenses(map);
	}
	
	
	public void loopingAllExpenses(Map<String, Double> map) {
		
		Double sumOfExpense = 0.0;
		
        for (Entry<String, Double> entry : map.entrySet()) {
                		
            //Get the expense value in the circle
            Double amonutExpense = addExpenseFlow(entry.getKey(), entry.getValue());
    		
            //Sum of all expense values
    		sumOfExpense+=entry.getValue();
    		
    		assertEquals(df.format(sumOfExpense), df.format(amonutExpense));
        }
	}
	
	
	public double addExpenseFlow(String expenseKey, double unitExpense) {
		return dashboard.goToExpenseScreen()
						.goToCategoryPassingExpenseValue(String.valueOf(unitExpense))
						.chooseCategory(expenseKey)
						.getExpenseValueFromCircle();
	}
}
