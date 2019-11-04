package com.monefy.enums;

public enum IncomeCategory {
	
	DEPOSITS("Deposits"), 
	SALARY("Salary"),
	SAVINGS("Savings");
	
	private String value;

	IncomeCategory(String value){
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
