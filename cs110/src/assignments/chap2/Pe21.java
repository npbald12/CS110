package assignments.chap2;

import java.util.Scanner;

public class Pe21 {
	public static void main(String[] args) {
		double farh;
		double celsius; 		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("What is the temprature? ");
		celsius = scanner.nextDouble();
					
		farh = (9.0/5) * celsius + 32.0;
		
		System.out.println(celsius + " degrees celsius is " + farh + " degrees farhenheit");
		
		
	}
	

}
