package practice1;

import java.util.Scanner;

public class SumofNaturalRecursion {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter  Number to get Sum of natural numbers ");
		   int a = sc.nextInt();
		   int sum =addNumbers(a);
		   System.out.println("Sum = " +sum);

	}
	public static int addNumbers(int b) {
   
		if(b!=0)
	return b+addNumbers(b-1);
         else 
	return b ;
}
}