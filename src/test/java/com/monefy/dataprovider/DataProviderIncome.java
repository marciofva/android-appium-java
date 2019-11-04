package com.monefy.dataprovider;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.DataProvider;
import com.monefy.enums.IncomeCategory;

public class DataProviderIncome {
	
	@DataProvider(name = "selectDeposit")
	public Object[][] selectDeposit() {
		 Map<String, Double> map = new HashMap<String, Double>();
		 map.put(IncomeCategory.DEPOSITS.getValue(), 670.94);
		return new Object[][] { { map } };
	}
	
	@DataProvider(name = "AllCategories")
	public Object[][] AllCategories() {
		 Map<String, Double> map = new HashMap<String, Double>();
		 map.put(IncomeCategory.DEPOSITS.getValue(), 670.94);
		 map.put(IncomeCategory.SALARY.getValue(), 8000.62);
		 map.put(IncomeCategory.SAVINGS.getValue(), 40000.0);
		return new Object[][] { { map } };
	}
}
