package assignments.chap3;

import java.util.Scanner;

public class Pe322 {

	
	public static void main(String[] args) {
		double xOne = 0;
		double xTwo;
		double yOne = 0;
		double yTwo;
		double diffOfX;
		double diffOfY;
		double xSquared;
		double ySquared;
		double distance;
		
		
		System.out.print("Enter your X cord:");
		
		Scanner s = new Scanner(System.in);
		
		xTwo = s.nextDouble();
		
		System.out.print("Enter your Y cord:");
		
		yTwo = s.nextDouble();
		
		diffOfX = xTwo - xOne;
		diffOfY = yTwo - yOne;
		
		xSquared = diffOfX * diffOfX;
		ySquared = diffOfY * diffOfY;
		
		distance = Math.sqrt(xSquared + ySquared);
		
		
		if (distance <= 10){
			System.out.println("Point (" + xTwo + " , " + yTwo + ") is inside the circle.");
			
		} else{
			System.out.println("Point (" + xTwo + " , " + yTwo + ") is outside the circle.");
		}
		
		
		
		
		
		

	}

}
