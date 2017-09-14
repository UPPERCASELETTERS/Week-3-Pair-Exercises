package com.techelevator;

public class VolunteerWorker implements Worker {

	private String firstName;
	private String lastName;
	private double weeklyPay;
	private int hoursWorked;
	
	public double calculateWeeklyPay(int hoursWorked) {
		weeklyPay= hoursWorked * 0;
		return weeklyPay;
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
