package practice1;

import java.util.Scanner;

public class Calculator2 extends Calculator1 {
	final static String MULT = "*";
	final static String DIV = "/";
	final static String Area = "AT";
	final static String RECTANGLE = "AR";
	final static String SQUARE = "S";
	final static String QUBE = "Q";
			
	 public static void mult () {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter 1st Number");
		  int  a = sc.nextInt();
		    System.out.println("Enter 2nd Number");
		   int b = sc.nextInt(); sc.nextLine();
		 int  Multiplication = a*b;
			System.out.println("Multiplication of number is  :" +Multiplication);
			
		}
	 public static void div () {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter 1st Number");
		  int  a = sc.nextInt();
		    System.out.println("Enter 2nd Number");
		   int b = sc.nextInt(); sc.nextLine();
		 int  division = a/b;
			System.out.println("division of number is  :" +division);
			
		}
	
	
}
