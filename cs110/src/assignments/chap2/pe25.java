package assignments.chap2;

import java.util.Scanner;

public class pe25 {

	
	public static void main(String[] args) {
		double bill;
		double TipRate;
		double total;
		double tip;
		
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("How much was your bill?");
		
		bill = s.nextDouble();
		
		System.out.println("What percent would you like to tip?");
		
		TipRate = s.nextDouble();
		
		tip = bill * (TipRate / 100);
		
		total = tip + bill;
		
		System.out.println("Your total including tip is " + total);
		
		
		
		
		
		
		
		
		

	}

}

