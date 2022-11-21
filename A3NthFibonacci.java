package day3;
import java.util.Scanner;

//Please write a java program to print the nth fibonacci series number 
//(example : 9th fibonacci series is 34) 
//Hint : use simple if condition with recursive function call
public class A3NthFibonacci {
	public int getNthFibonacci(int num) {
		if(num==1) {return 0; 
		}else if(num==2) { return 1;
		}else {
			return getNthFibonacci(num-1)+getNthFibonacci(num-2);
		}
	}
	
	public static void main(String[] args) {
		A3NthFibonacci nth = new A3NthFibonacci();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter n for fibonnaci number: ");
		int i = sc.nextInt();
		System.out.println(i+"th Fibonacci number is "+nth.getNthFibonacci(i));
	}
}
