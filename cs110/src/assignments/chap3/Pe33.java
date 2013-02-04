package assignments.chap3;

import java.util.Scanner;

public class Pe33 {

	
	public static void main(String[] args) {
		double a,b,c,d,e,f;
		double zero;
		double x;
		double y;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a");
		
		a = s.nextDouble();
		
		System.out.println("Enter b");
		
		b = s.nextDouble();
		
		System.out.println("Enter c");
		
		c = s.nextDouble();
		
		System.out.println("Enter d");
		
		d = s.nextDouble();
		
		System.out.println("e");
		
		e = s.nextDouble();
		
		System.out.println("Enter f");
		
		f = s.nextDouble();
		
		if ((a*d) - (b*c) == 0){
			System.out.println("There is no solution");
			
		} else{ 
			x = ((e*d) - (b*f)) / ((a*d) - (b*c));
			y = ((a*f) - (e*c)) / ((a*d) - (b*c));
			
			System.out.println("X is " + x + "\nY is " + y);
			
		}
		
		

	}

}
