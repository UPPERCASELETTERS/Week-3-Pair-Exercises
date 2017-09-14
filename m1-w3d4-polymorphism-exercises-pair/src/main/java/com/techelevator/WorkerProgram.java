package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class WorkerProgram {

	public static void main(String[] args) {
				
		List<Worker> payRoll = new ArrayList<>(); 
		
		SalaryWorker mickey = new SalaryWorker(50000.00);
		int mickeyHours = ((int) (Math.random()*100+10));
		mickey.setHoursWorked(mickeyHours);
		mickey.setFirstName("Mickey");
		mickey.setLastName("Mouse");
		mickey.calculateWeeklyPay(  mickeyHours );
		payRoll.add(mickey);
		
		HourlyWorker goofy = new HourlyWorker(8.50);
		int goofyHours = ((int) (Math.random()*100+10));
		goofy.setHoursWorked(goofyHours);
		goofy.setFirstName("George");
		goofy.setLastName("Geef");
		goofy.calculateHourlyPay( goofyHours );
		payRoll.add(goofy);
		
		VolunteerWorker daisy = new VolunteerWorker();
		int daisyHours = ((int) (Math.random()*100+10));
		daisy.setHoursWorked(daisyHours);
		daisy.setFirstName("Daisy");
		daisy.setLastName("Duck");
		daisy.calculateWeeklyPay(daisyHours);
		payRoll.add(daisy);
		
		
		System.out.println(String.format("%20s", "Name" ) + String.format("%20s","Pay") + String.format("%20s", "Hours"));
		System.out.println("====================================================================");
		
		for(Worker person : payRoll) {
			String last = person.getLastName();
			String first = person.getFirstName();
			int hour = person.getHoursWorked();
			double weekPay = person.getWeeklyPay();			
			System.out.println( String.format("%20s", last + ", " + first) + String.format("%20s", "$" + String.format("%.2f", weekPay)) + String.format("%20s", hour) );
			
		}
	}
}
