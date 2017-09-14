package com.techelevator;

public class SalaryWorker implements Worker {
	
	private String firstName;
	private String lastName;
	private double annualSalary;
	private double weeklyPay;
	private int hoursWorked;

	public SalaryWorker (double annualSalary) {
	this.annualSalary = annualSalary;
	}
	
	
	public double calculateWeeklyPay(int hoursWorked) {
		weeklyPay = annualSalary / 52.0;
		return weeklyPay;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getWeeklyPay() {
		return weeklyPay;
	}


	public int getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	
}
