package practice1;

import java.util.Scanner;

public class FindLargestNumber {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter  first number ");
		   int x = sc.nextInt();
		   System.out.println("Enter  second number ");
		   int y = sc.nextInt();
		   System.out.println("Enter  Third number ");
		   int z = sc.nextInt();
if(x>=y && x>=z) {
	System.out.println( x+ " : Is Largest number ");
	}
else if(y>=x && y>=z) {
	System.out.println( y+ " : Is Largest number ");
	}
else{
	System.out.println( z+ " : Is Largest number ");
	}
	}
}
