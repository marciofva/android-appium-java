package com.monefy.dataprovider;

import java.util.HashMap;
import java.util.Map;
import org.testng.annotations.DataProvider;
import com.monefy.enums.ExpenseCategory;

public class DataProviderExpenses {
	
	@DataProvider(name = "selectBillCarClothes")
	public Object[][] selectBillCarClothes() {
		 Map<String, Double> map = new HashMap<String, Double>();
		 map.put(ExpenseCategory.BILL.getValue(), 12.3);
		 map.put(ExpenseCategory.CAR.getValue(), 25.0);
		 map.put(ExpenseCategory.CLOTHES.getValue(), 120.7);
		return new Object[][] { { map } };
	}
	
	
	@DataProvider(name = "allCategories")
	public Object[][] allCategories() {
		 Map<String, Double> map = new HashMap<String, Double>();
		 map.put(ExpenseCategory.BILL.getValue(), 140.0);
		 map.put(ExpenseCategory.CAR.getValue(), 80.0);
		 map.put(ExpenseCategory.CLOTHES.getValue(), 60.5);
		 map.put(ExpenseCategory.COMMUNICATION.getValue(), 130.99);
		 map.put(ExpenseCategory.EATING_OUT.getValue(), 95.0);
		 map.put(ExpenseCategory.ENTERTAINMENT.getValue(), 1700.3);
		 map.put(ExpenseCategory.FOOD.getValue(), 56.0);
		 map.put(ExpenseCategory.GIFTS.getValue(), 29.9);
		 map.put(ExpenseCategory.HEALTH.getValue(), 300.0);
		 map.put(ExpenseCategory.HOUSE.getValue(), 756.35);
		 map.put(ExpenseCategory.PETS.getValue(), 90.0);
		 map.put(ExpenseCategory.SPORTS.getValue(), 130.0);
		 map.put(ExpenseCategory.TAXI.getValue(), 79.0);
		 map.put(ExpenseCategory.TOILETRY.getValue(), 120.0);
		 map.put(ExpenseCategory.TRANSPORT.getValue(), 100.51);
		return new Object[][] { { map } };
	}
}
