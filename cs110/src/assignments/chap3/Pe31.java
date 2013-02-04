package assignments.chap3;

import java.util.Scanner;

public class Pe31 {

	
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		double disc;
		double finalDisc;
		double posFinal;
		double negFinal;
		double zero;
		
		
		
		
		System.out.println("What is your A value?");
		 
		Scanner s = new Scanner(System.in);
		
		a = s.nextDouble();
		
		System.out.println("What is your B value?");
		
		b = s.nextDouble();
		
		System.out.println("What is your C value?");
		
		c = s.nextDouble();
		
		disc = (b*b) - (4*a*c);
		
		if (disc > 0){
			finalDisc = Math.pow(disc, 0.5);
			
			posFinal = (-b + finalDisc)/ (2*a);
			negFinal = (-b - finalDisc)/ (2*a);
			
			System.out.println("The roots are " + posFinal + " " + negFinal);
			
		} else if(disc == 0){
				zero = (-b)/ (2*a);
				
				System.out.println("The root is " + zero);
				
				
			} else{
				System.out.print("There are no real roots.");
				
				
				
							
			
			
				
								
			
			
						
		}
		
		
		
		
		
		
		
		

	}

}
