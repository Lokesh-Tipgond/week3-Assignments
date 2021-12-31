package practice1;

import java.util.Scanner;

public class CalculatorMain extends AreaOfcircle {
	
		  public static void main(String[] args) {
			  Scanner sc = new Scanner(System.in);
			
			  String op;
			  System.out.println("Enter An Operator.... + - * / AR AT S Q");
			    op = sc.nextLine();
			  
		   
			    switch(op) {
			    case ADD:
			    	add();
			      break;
			    case SUB:
			    	 sub();
			      break;
			      
			    case MULT:
			    	 mult();
				      break;
				    case DIV:
				    	div();
				      break;
				      
				    case Area:
				    	areaOfCircle();
					      break;
					    case RECTANGLE:
					    	rectangle();
					      break;
					    case SQUARE:
					    	square();
					      break;
					    case QUBE:
					    	qube();
					      break;
			   
			  }
		    
		   
		     
		
		  }
}
