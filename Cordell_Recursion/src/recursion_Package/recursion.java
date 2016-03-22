package recursion_Package;
import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class recursion {

	
	
	public void rTest(){
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
//			System.out.println("Jerk.");
//		}
//		System.out.println("The number is " + fibo(0,1,fibnum) + ".");
//		
//		scan.close();
		
		for(int x = 0; x < 11; x++){
			System.out.println(x);
		};
//		 x++;
//		 int a = x + 1;
//		 int a = x++;
//		 System.out.println(a);
		 rTest();
	} //end rTest
		 	 
		//Fibonacci method
		protected static int fibo(int a, int b, int n){
		//checks to see if we have reached the desired number yet
		if(n==1){
		return(a);
		}
		 
		//Fibonacci number computation
		int temp = a;
		a = b;
		b = temp + b;
		 
		return(fibo(a,b,n-1));		
	} //end rTest
	
		protected void stringRec(){
			String userInput = 
					JOptionPane.showInputDialog("Enter a message.");
			
		
			
		} //end stringRec method
		
} //end class
