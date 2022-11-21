package day3;
import java.util.Scanner;

//Please write a java program to calculate sum & average of given 4 marks via constructor, 
//if three or two marks only passed from main method, then keep the missing value(s) as 35) - 
//Hint - multiple parameterized constructor

public class A5StudentMarks {

	//properties of class -- variables
	//behavior of class / actions on the class -- methods
//	int rollNo;  //camel case
//	String name;
//	char grade;
//	char gender;
//	String address;
//	String course;
//	String dateOfBirth;
//	long contact;
	float mark1,mark2,mark3, mark4,sum, average; 
	//default value is 0.0f | int=0 | char ='' | boolean = false
	// global variables - instance variable - class level variable - access specifier
	// local variable - method level variables
	
	//constructor is a method in Java - it's used to assign value to global variables
	//constructor will be always public
	//constructor will have the same name of the class
	//constructor will not have return type
	//there can be any number of constructors in a class
	//constructor is purely optional
	
	public A5StudentMarks (float m1, float m2, float m3, float m4) {
		
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
		mark4 = m4;
	}
	
	public A5StudentMarks (float m1) {
		
		mark1 = m1;
		mark2 = 35;
		mark3 = 35;
		mark4 = 35;
	}

	public A5StudentMarks (float m1, float m2) {
		
		mark1 = m1;
		mark2 = m2;
		mark3 = 35;
		mark4 = 35;
	}

	public A5StudentMarks (float m1, float m2, float m3) {
	
		mark1 = m1;
		mark2 = m2;
		mark3 = m3;
		mark4 = 35;
	}
		
	public A5StudentMarks () {
		
		mark1 = 35;
		mark2 = 35;
		mark3 = 35;
		mark4 = 35;
	}
	
	public float calculateSum () {
		
		//float sum;	
		sum = this.mark1+this.mark2+this.mark3+this.mark4;
		return sum;
	}
	
	public float calculateAvg() {
		
		average = (mark1+mark2+mark3+mark4)/4;
		return average;
	}
	
	public static void main(String[] args) {
		
		A5StudentMarks s1 = new A5StudentMarks(76.5f,87.5f,90.3f,77.8f);

		float avg = s1.calculateAvg();
		float sum = s1.calculateSum();
		
		System.out.println("Sum of the marks by student-1 : "+sum);
		System.out.println("Avg of the marks by student-1 : "+avg);
		
		System.out.println("=======================");
		
		A5StudentMarks s2 = new A5StudentMarks(76.5f,87.5f);

		float avg2 = s2.calculateAvg();
		float sum2 = s2.calculateSum();
		
		System.out.println("Sum of the marks by student-2 : "+sum2);
		System.out.println("Avg of the marks by student-2 : "+avg2);
		
		System.out.println("=======================");

		
		A5StudentMarks s3 = new A5StudentMarks(76.5f,87.5f, 78.5f);
		

		float avg3 = s3.calculateAvg();
		float sum3 = s3.calculateSum();
		
		System.out.println("Sum of the marks by student-3 : "+sum3);
		System.out.println("Avg of the marks by student-3 : "+avg3);
		
		System.out.println("=======================");

		
		A5StudentMarks s4 = new A5StudentMarks(76.5f);
		
		float avg4 = s4.calculateAvg();
		float sum4 = s4.calculateSum();
		
		System.out.println("Sum of the marks by student-4 : "+sum4);
		System.out.println("Avg of the marks by student-4 : "+avg4);
		
		System.out.println("=======================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter name for student-5: ");
		String name = sc.next();
		System.out.println("please enter mark-1 for "+name);
		float m1 = sc.nextFloat();
		System.out.println("please enter mark-2 for "+name);
		float m2 = sc.nextFloat();
		System.out.println("please enter mark-3 for "+name);
		float m3 = sc.nextFloat();
		System.out.println("please enter mark-4 for "+name);
		float m4 = sc.nextFloat();

		A5StudentMarks s5 = new A5StudentMarks(m1,m2,m3,m4);
		
		float avg6 = s5.calculateAvg();
		float sum6 = s5.calculateSum();
		
		System.out.println("Sum of the marks by "+name+" : "+sum6);
		System.out.println("Avg of the marks by "+name+" : "+avg6);
		
		System.out.println("please enter name for student-6: ");
		name = sc.next();
		System.out.println("please enter mark-1 for "+name);
		m1 = sc.nextFloat();
		System.out.println("please enter mark-2 for "+name);
		m2 = sc.nextFloat();
		System.out.println("please enter mark-3 for "+name);
		m3 = sc.nextFloat();
		System.out.println("please enter mark-4 for "+name);
		m4 = sc.nextFloat();

		A5StudentMarks s6 = new A5StudentMarks(m1,m2,m3,m4);
		
		float avg7 = s6.calculateAvg();
		float sum7 = s6.calculateSum();
		
		System.out.println("Sum of the marks by "+name+" : "+sum7);
		System.out.println("Avg of the marks by "+name+" : "+avg7);

	}
}

