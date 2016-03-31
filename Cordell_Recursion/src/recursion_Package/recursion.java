package recursion_Package;
import java.io.*;
import java.util.InputMismatchException;
import java.util.*;
import javax.swing.JOptionPane;

public class recursion {
	int N;
//	public void rTest(){
//		System.out.println("hi");
//		 rTest();
//		Scanner scan = new Scanner(System.in);
//		 
//		System.out.println("Which Fibonacci number do you want to see?");
//		
//		//attempted error checking
//		int fibnum;
//		try{ 
//			fibnum = scan.nextInt();	//name of entered digit
//		}catch(InputMismatchException e){
//			fibnum = 4;
//			//System.out.println("Jerk.");
//		}
//		System.out.println("The number is " + fibo(0,1,fibnum) + ".");
//		
//		scan.close();
		
//		for(int x = 0; x < 11; x++){
//			System.out.println(x);
//		};
//		 x++;
//		 int a = x + 1;
//		 int a = x++;
//		 System.out.println(a);
//		rTest();
//		return fibnum;
		
		
		
//	String Numb = 
//		JOptionPane.showInputDialog("Enter a positive integer between 1 and 10.");
//	
//	try{
//		N = Integer.parseInt(Numb);	//turns string into a an integer
//		
//		System.out.println(fact(N));	//prints out N from fact method
//		
//	}catch(NumberFormatException e){	
//		//JOptionPane.showInputDialog("you suck");
//		rTest();
//	}//end try catch
//	if(N < 1 || N > 10){
//		rTest();
//	}
//	} //end rTest
//	
//	protected int fact(int N){
//		//System.out.println(N);
//
//		if(N <= 1){
//			return 1;
//		}else{
//			return (N*fact (N-1));
//		} //end if... else statement
////		System.out.println(N);
//
//		
//	}//end method
//		 	 
//		//Fibonacci method
//		protected static int fibo(int a, int b, int n){
//		//checks to see if we have reached the desired number yet
//		if(n==1){
//		return(a);
//		}
//		 
//		//Fibonacci number computation
//		int temp = a;
//		a = b;
//		b = temp + b;
//		 
//		return(fibo(a,b,n-1));		
//	} //end rTest
//	
//		protected void stringRec(){
//			String userInput = 
//					JOptionPane.showInputDialog("Enter a message.");
//			
		
		   int fact(int n) {

		          int result;

		     if ( n == 1) return 1;

		     result = fact (n-1) * n;

		     return result;

		     }


		     public void rTest () {

		          recursion f = new recursion();

		          System.out.println("Factorial of 3 is " + f.fact(3));
		          
		          try{Thread.sleep(1000);}							
		  		catch(Exception e){};

		          System.out.println("Factorial of 4 is " + f.fact(4));
		          
		          try{Thread.sleep(1000);}							
		  		catch(Exception e){};

		          System.out.println("Factorial of 5 is " + f.fact(5));
		          
		          try{Thread.sleep(500);}							
		  		catch(Exception e){};
		          
		          int urResult = 0;
		          String input = "";
		          
		         
		          input = 
		  		       		JOptionPane.showInputDialog("Your turn! Enter a positive integer between 1 and 25.");   
		  		          
		      	try
		      	{			      		
		    		urResult = Integer.parseInt(input);	//converts input into an int
		    		
		    	}catch(NumberFormatException e){

		    		System.out.println("\nDrink bleach.");
		        	  
	        		  System.exit(0);				//close program				        	

		    			}
		    		
				          if(!(urResult < 25) | !(urResult > 1)){
						          
				        	  System.out.println("\n \n well... you're a jerk.");
				        		  System.exit(0);				//close program				        	

////				        	  input = 
////				  		       		JOptionPane.showInputDialog("Enter a positive integer between 1 and 10.");   
////				  		          
////				  		          urResult = Integer.parseInt(input);
				          }
		          urFact(urResult);
		          
		          System.out.println("Factorial of " + urResult + " is " + f.urFact(urResult));


		     }//end method
		     
			   int urFact(int u) {

			          int urResult;	 

			     if (u == 1) return 1;

			     urResult = fact (u-1) * u;

			     return urResult;

			     }
			
		} //end class
//end stringRec method
