package practice1;
import java.util.Scanner;

public class AreaOfcircle extends Calculator2 {
		
	public static double areaOfCircle() {
int r = 0 ;
double pi = 3.14, Area;
Scanner s = new Scanner(System.in);
System.out.println("Enter Radius Of Circle :");
r = s.nextInt();
Area = pi*r*r;
System.out.println("Area of Circle is : " +Area);
return Area ;
	}

	 public static void rectangle () {
		 Scanner s = new Scanner(System.in);
			System.out.println("Enter Length :");
			int l = s.nextInt();
			System.out.println("Enter Bridth :");
		   int b = s.nextInt();
			double AreaOfRectanglr = l*b;
			System.out.println("AreaOfRectanglr is  :" +AreaOfRectanglr);
			
		}
	 
	 public static void square () {
		 Scanner s = new Scanner(System.in);
		 
			System.out.println("Enter number :");
		   int b = s.nextInt();
			double Square = b*b;
			System.out.println("square of number is  :" +Square);
			
		}
	 public static void qube () {
		 Scanner s = new Scanner(System.in);
		 
			System.out.println("Enter number :");
		   int b = s.nextInt();
			double Qube = b*b*b;
			System.out.println("square of number is  :" +Qube);
			
		}
}
