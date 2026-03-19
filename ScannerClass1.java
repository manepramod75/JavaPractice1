package javaprograms;

import java.util.Scanner;

public class ScannerClass1 
{

	public static void main(String[] args) {
	
	/*Scanner scanner= new Scanner (System.in);
	System.out.println("enter value 1");
	int value1 = scanner.nextInt();	
	System.out.println("enter value 2");
	int value2 = scanner.nextInt();
	int sum = value1 - value2;
	
	System.out.println();
	System.out.println(sum);
	scanner.close();
	*/
		
	Scanner s1 = new Scanner (System.in);
	System.out.println("enter 1st input");
	int value1 = s1.nextInt();
	System.out.println("enter 2nd input");
	int value2 = s1.nextInt();
	System.out.println("3rd input");
	int value3 = s1.nextInt();
	
	int count = value1 - value2 + value3;
	
	System.out.println(count);
	}

}
  