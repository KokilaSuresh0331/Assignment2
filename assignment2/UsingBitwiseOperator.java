package assignment2;

import java.util.Scanner;

public class UsingBitwiseOperator {
	public static void main(String[] args) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Using Bitwise Operators:");
		System.out.print("Enter a value:");
		a=sc.nextInt();
		System.out.print("Enter b value:");
		b=sc.nextInt();
        System.out.println("Bitwise AND: " + (a & b));
        System.out.println("Bitwise OR: " + (a| b));       
        System.out.println("Bitwise XOR: " +(a ^ b) );        
        System.out.println("Left Shift: " + (a << b));
        System.out.println("Right Shift: " + ( a>> b));
        sc.close();
	}

}
