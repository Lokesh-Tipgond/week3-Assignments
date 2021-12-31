package practice1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter  Number to get Sum of natural numbers ");
		   int InputValue = sc.nextInt();
		   int a,sum=0;
		   
		   for(a=1; a<=InputValue; a++) {
			   sum=sum+a;
	}
		   System.out.println("The sum of the natural number is : " +sum);
	}
}
