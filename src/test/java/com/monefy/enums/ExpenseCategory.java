package com.monefy.enums;

public enum ExpenseCategory {
	
	BILL("Bills"), 
	CAR("Car"),
	CLOTHES("Clothes"),
	COMMUNICATION("Communications"),
	EATING_OUT("Eating out"),
	ENTERTAINMENT("Entertainment"),
	FOOD("Food"),
	GIFTS("Gifts"),
	HEALTH("Health"),
	HOUSE("House"),
	PETS("Pets"),
	SPORTS("Sports"),
	TAXI("Taxi"),
	TOILETRY("Toiletry"),
	TRANSPORT("Transport");
	
	private String value;

	ExpenseCategory(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
