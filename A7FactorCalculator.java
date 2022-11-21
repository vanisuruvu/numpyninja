package day3;
import java.util.Scanner;

public class A7FactorCalculator {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to find factors: " );
		int num = sc.nextInt();
		int count =1;
		
		System.out.print ("1 ");
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("Total number of factors of "+num+" are: "+ count);
		
	}
}
