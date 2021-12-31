package practice1;
import java.util.Scanner;


public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a Number to check palindrome Or Not");
		   int InputValue = sc.nextInt();
		  
         int sum=0 ,temp, reminder;
         temp = InputValue;
         while(InputValue>0) {
        	 reminder = InputValue%10;
        	 sum =(sum*10)+reminder;
        	 InputValue=InputValue/10;
	}
         if(temp==sum) {
        	 System.out.println("The Number is Palindrome");  	 
	}
         else{
        	 System.out.println("The Number is Not Palindrome");  	 
	}
}
}