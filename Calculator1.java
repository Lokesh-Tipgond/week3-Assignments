package practice1;

import java.util.Scanner;

public class Calculator1 {
	final static String ADD = "+";
	final static String SUB = "-";
	
	
	 public static void add () {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter 1st Number");
		  int  a = sc.nextInt();
		    System.out.println("Enter 2nd Number");
		   int b = sc.nextInt(); sc.nextLine();
		 int  addition = a+b;
			System.out.println("addition of number is  :" +addition);
			
		}
	 public static void sub () {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter 1st Number");
		  int  a = sc.nextInt();
		    System.out.println("Enter 2nd Number");
		   int b = sc.nextInt(); sc.nextLine();
		 int  substraction = a-b;
			System.out.println("substraction of number is  :" +substraction);
			
		}
	

}
