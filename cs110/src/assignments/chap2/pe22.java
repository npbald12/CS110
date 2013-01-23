package assignments.chap2;

import java.util.Scanner;

public class pe22 {
	
	public static void main(String[] args) {
		double radius;
		double length;
		double pi = Math.PI;
		double area;
		double volume;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is the radius?");
		
	    radius = s.nextDouble();
	    
	    System.out.println("What is the length?");
	    
	    length = s.nextDouble();
	    
	    area = radius * radius * pi;
	    
	    volume = area * length;
	    
	    System.out.println("The volume of the cylinder is " + volume + " units");
	    
	    
		
		

	}

}
