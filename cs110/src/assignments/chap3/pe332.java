package assignments.chap3;

import java.util.Scanner;

public class pe332 {

	
	public static void main(String[] args) {
		double xZero;
		double xOne;
		double xTwo;
		double yZero;
		double yOne;
		double yTwo;
		double line;
		
		System.out.print("enter your points for p0");
		
		Scanner s = new Scanner(System.in);
		
		xZero = s.nextDouble();
		yZero = s.nextDouble();
		
		System.out.print("Enter your points for p1");
		
		xOne = s.nextDouble();
		yOne = s.nextDouble();
		
		System.out.print("Enter your points for p2");
		
		xTwo = s.nextDouble();
		yTwo = s.nextDouble();
		
		line = (xOne - xZero) * (yTwo - yZero) - (xTwo - xZero)*(yOne - yZero);
		
		if(line > 0){
			System.out.println("p2 is on the left side of the line");
		} else if(line == 0){
			System.out.println("p2 is on the same line.");
		}else{
			System.out.println("p2 is on the right side of the line");
			
		}
		
		
		
		
		
		

	}

}
