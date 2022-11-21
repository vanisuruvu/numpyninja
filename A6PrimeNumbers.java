package day3;
import java.util.Scanner;

public class A6PrimeNumbers {
	
	public boolean isPrime(int n) {
		boolean isAPrime = true;
		
		for(int j=2; j<=n/2; j++) {
			if(n%j ==0) {
				isAPrime = false;
			}
		}
		return isAPrime;		
	}

	public static void main(String[] args) {
		
		A6PrimeNumbers obj = new A6PrimeNumbers();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number to print prime numbers below: ");
		int num = sc.nextInt();
		for(int i=2; i<=num; i++) {
			if(obj.isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
