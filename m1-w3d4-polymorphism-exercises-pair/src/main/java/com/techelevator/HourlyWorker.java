package com.techelevator;

public class HourlyWorker implements Worker {

	private String firstName;
	private String lastName;
	private double hourlyRate;
	private double weeklyPay;
	private int hoursWorked;
	
	public HourlyWorker (double hourlyRate) {
		this.hourlyRate = hourlyRate;
		}
	
	public double calculateHourlyPay(int hoursWorked) {
		int overTime=0;
		double pay = hourlyRate * hoursWorked;
		
		if (hoursWorked>40) {
		overTime = hoursWorked-40;
		}
		
		pay = pay + (hourlyRate * overTime * 0.5);
		weeklyPay = pay;
		return weeklyPay;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
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
