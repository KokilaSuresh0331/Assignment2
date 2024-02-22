package assignment2;

import java.util.Scanner;

public class UsingBmiFormula {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter your height:");
		float height=sc.nextFloat();
		System.out.println("Enter your weight:");
		float weight=sc.nextFloat();
		double bmiValue=weight/(height*height);
		System.out.println("Your BMI values is:"+bmiValue);
		
	}

}
