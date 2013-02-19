package assignments.chap4;

import java.util.Scanner;

public class Pe438 {

	
	public static void main(String[] args) {
		
		
		System.out.println("Enter a decimal interger");
		
		Scanner s = new Scanner(System.in);
		int startVal = s.nextInt();
		String hex = " ";
		String[] conversion = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
		
		
		
		while(startVal > 0){
			int rem = startVal % 16;
			hex = rem + hex;
			startVal = startVal / 16;
			
						
			
			
		}
		for(int i = 0; i < startVal; i ++){
			String finalHex = conversion[i];
			
			
		}
		System.out.print(hex);
		
		
	
	}
	
	

}
