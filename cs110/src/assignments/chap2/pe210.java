package assignments.chap2;

import java.util.Scanner;

public class pe210 {

	
	public static void main(String[] args) {
		double m;
		double startTemp;
		double finalTemp;
		double Joules;
		
		System.out.println("Enter amount of water in KG");
		
		Scanner s = new Scanner(System.in);
		
		m = s.nextDouble();
		
		System.out.println("Enter the starting temprature");
		
		startTemp = s.nextDouble();
		
		System.out.println("Enter the final temprature");
		
		finalTemp = s.nextDouble();
		
		Joules = m * (finalTemp - startTemp) * 4184;
		
		System.out.println("The amount of energy needed is " + Joules + " joules");
		
		
		
		
		
		
		
		

	}

}
