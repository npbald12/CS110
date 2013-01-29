package assignments.chap2;

import java.util.Scanner;

public class Pe225 {

	
	public static void main(String[] args) {
		
		double hours;
		double payRate;
		double federal;
		double state;
		double gross;
		double totalded;
		double netPay;
		
		
		
		Scanner s = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
				
		System.out.println("Name:");
		
		String name = input.next();
				
		
		System.out.println("Enter how many hours you work a week");
		
		
		hours = s.nextDouble();
		
		System.out.println("Enter your hourly pay rate");
		
		payRate = s.nextDouble();
		
		System.out.println("Enter federal tax witholding rate (as a decimal)");
		
		federal = s.nextDouble();
		
		System.out.println("Enter state tax withholding rate (as a decimal)");
		
		state = s.nextDouble();
		
		gross = hours * payRate;
		
		federal = federal * gross;
		
		state = state * gross;
		
		totalded = state + federal;
		
		netPay = gross - totalded;
				
		
		System.out.println("Employee name: " + name);
		System.out.println("Hours worked: " + hours);
		System.out.println("Hourly pay: $" + payRate);
		System.out.println("Gross pay: $" + gross);
		System.out.println("deductions:");
		System.out.println("\t Federal Witholding: $" + federal);
		System.out.println("\t State witholding: $" + state);
		System.out.println("\t Total deduction: $" + totalded);		
		System.out.println("Net Pay: $" + netPay);
		
		
	
		
		
		
		
		
		
		

	}

}
