package assignments.chap3;

import java.util.Random;
import java.util.Scanner;

public class Pe317 {

	
	public static void main(String[] args) {
		int comp;
		double user;
		
		System.out.println("Scissor (0), Rock (1), Paper (2)");
		
		Scanner s = new Scanner(System.in);
		
		user = s.nextDouble();
		
		Random rand = new Random();
		
		comp = rand.nextInt(3);
		
		
		if (user == 0 && comp == 1.0){
			System.out.println("The computer is rock, you are scissors, you lost :(");
			
		} else if(user == 0 && comp == 2.0){
			System.out.println("The computer is paper, you are scissors, you won :)");
			
		} else if(user == 1 && comp == 0.0){
			System.out.println("The computer is scissors, you are rock, you won :)");
			
		} else if(user == 1 && comp == 2.0){
			System.out.println("The computer is paper, you are rock, you lost :(");
			
		} else if(user == 2 && comp == 0.0){
			System.out.println("The computer is sciccors, you are paper, you lost :(");
			
		} else if(user == 2 && comp == 1.0){
			System.out.println("The computer is rock, you are paper, you won :)");
		
		} else{
			System.out.println("You both had the same pick, its a tie. :/");
			
			
			
					
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
