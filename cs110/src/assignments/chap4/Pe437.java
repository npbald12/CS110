package assignments.chap4;


	import java.util.Scanner;

	public class Pe437 {

		
		public static void main(String[] args) {
			
			
			System.out.println("Enter a decimal interger");
			
			Scanner s = new Scanner(System.in);
			int startVal = s.nextInt();
			String bin = " ";
			
			
			
			while(startVal > 0){
				int rem = startVal % 2;
				bin = rem + bin;
				startVal = startVal / 2;
							
				
				
			}
			System.out.print(bin);
			

		}

	}


