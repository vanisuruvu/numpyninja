package day3;

import java.util.Scanner;

//Please write a java program to print the day of the week when number is given 
//(example : 1 means Sunday should be printed) - Hint : Switch case
public class A1DayOfWeek {
		
	int weekNumber;
	
	public A1DayOfWeek(int num) {
		this.weekNumber = num;
	}
	
	public String getDayOfWeek() {
		String dayOfWeek = "";
		
		switch (weekNumber){
			case 1:  dayOfWeek = "Sunday";  break;
			case 2:  dayOfWeek = "Monday";  break; 
			case 3:  dayOfWeek = "Tuesday";   break;
			case 4:  dayOfWeek = "Wednesday";   break;
			case 5:  dayOfWeek = "Thursday";   break;
			case 6:  dayOfWeek = "Friday";   break;
			case 7:  dayOfWeek = "Saturday";   break;
		}
		return dayOfWeek;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter day of the week number: ");
		int weekNumber = sc.nextInt();

		A1DayOfWeek day = new A1DayOfWeek(weekNumber);
		System.out.println("Name of Day in week: "+ day.getDayOfWeek());

				
		
	}
	
}
