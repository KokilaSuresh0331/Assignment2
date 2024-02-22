 package assignment2;

import java.util.Scanner;

public class QuadraticEquation {
public static void main(String[] args) {
	int a,b,c;
	double x;
	Scanner sc=new Scanner(System.in);
	System.out.println("Quardratic Equtaion:ax^2+bx+c");
	System.out.println("Enter a value");
	a=sc.nextInt();
	System.out.println("Enter b value");
	b=sc.nextInt();
	System.out.println("Enter c value");
	c=sc.nextInt();
	double discriminant = b * b - 4 * a * c;
	double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
    double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	double root = -b / (2 * a);
	double imaginaryPart=Math.sqrt(-discriminant) / (2 * a);
	double realPart = -b / (2 * a);
	if(discriminant>0) {
		 
	System.out.println("Root1:"+root1);
	System.out.println("Root2:"+root2);
	}
   else if (discriminant == 0) {    
    System.out.println("Root = " + root);}
   else {
    System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
    System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
   	}
sc.close();
}
}
