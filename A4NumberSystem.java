package day3;
import java.util.Scanner;

//Please write a java program to print the binary, octal, hexadecimal form of a given decimal number 
//(example : for the input 10, print 1010(binary), 12 (octal), A (hexa))
public class A4NumberSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		String num = sc.next();
		Integer num1 = Integer.parseInt(num);

		System.out.println("Binary format: "+num1.toBinaryString(num1));
		System.out.println("Octal format: "+num1.toOctalString(num1));
		System.out.println("Hexadecimal format: "+num1.toHexString(num1));
	}
}
