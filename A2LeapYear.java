package day3;

//Please write a java program to print the leap years between 2000 and 2100 - 
//Hint : for loop and multiple if-else
public class A2LeapYear {
	
	public void getLeapYears(int fromYear, int toYear) {
		for(int year=fromYear; year<=toYear; year++) {
			if(year%400 == 0) { 	System.out.print(year + " " );
			}else if(year%100 == 0) { 
			}else if(year%4==0 ) {	System.out.print(year + " " );
			}
		}
	}
	
	public static void main(String[] args) {
		A2LeapYear objLeapYear = new A2LeapYear();
		objLeapYear.getLeapYears(2000,2100);
	}
}
