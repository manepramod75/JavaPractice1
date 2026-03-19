package javaprograms;

import java.util.Scanner;

// Area of circle 
public class ScannerPractice1 {


	public static void main(String[] args) {
		
		Scanner s1= new Scanner(System.in);
		System.out.println("enter value ");
		
		double a= s1.nextFloat();
		//double pi=3.14;
		double area = Math.PI*a*a;
		
		System.out.println(area);
		s1.close();
		
		
		
	}

}
