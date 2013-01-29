package assignments.chap2;

import java.util.Scanner;

public class pe27 {

	
	public static void main(String[] args) {
		int startingMins;
		double years;
		double days;
		double hours;
		double remainingDays;
		
		System.out.println("Enter how many minutes.");
		
		Scanner s = new Scanner(System.in);
		
		startingMins = s.nextInt();
		
		hours = startingMins / 60;
		
		days = hours / 24;
				
		years = days / 365;
		
		remainingDays =  days % 365; 
		
		System.out.println("The amount of time is " + years + " years and " + remainingDays);
		
		

	}

}
