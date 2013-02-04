package assignments.chap3;

import java.util.Scanner;

public class Pe321 {

	
	public static void main(String[] args) {
	
		int month;
		int year;
		int dayOfMonth;
		int century;
		int yearOfCentury;
		int day;
		
		System.out.print("Enter year:");
		
		Scanner s = new Scanner(System.in);
		
		year = s.nextInt();
		
		System.out.print("Enter month: 1-12:");
		
		month = s.nextInt();
		
		System.out.print("Enter the day of the month 1-31:");
		
		dayOfMonth = s.nextInt();
		
		century = (year/100);
		
		yearOfCentury = (year % 100);
		
		day = ( dayOfMonth + (26 * (month + 1) / 10) + yearOfCentury + (yearOfCentury / 4) + (century / 4) + (5 * century)) % 7;
		
		if(day == 0){
			System.out.println("Day of the week is Saturday");
		} else if(day == 1){
			System.out.println("Day of the week is Sunday");
		} else if(day == 2){
			System.out.println("Day of the week is Monday");
		} else if(day == 3){
			System.out.println("Day of the week is Tuesday");
		} else if(day == 4){
			System.out.println("Day of the week is Wednesday");
		} else if(day == 5){
			System.out.println("Day of the week is Thursday");
		} else{
			System.out.println("Day of the week is Friday");
			
			
		}
		
		
		
		
		
		

	}

}
