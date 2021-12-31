package practice1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Number to Reverse");
		   int InputValue = sc.nextInt();
		 int  reverse =0;
		int Remainder;
		while(InputValue!=0) {
			Remainder=InputValue%10;
			reverse=reverse*10+Remainder;	
			InputValue=InputValue/10;
	}
		System.out.println("The Reverse of Number Is : " +reverse);
	}

}
