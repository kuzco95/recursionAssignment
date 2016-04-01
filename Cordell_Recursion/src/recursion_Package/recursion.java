package recursion_Package;
import java.io.*;
import java.util.InputMismatchException;
import java.util.*;
import javax.swing.JOptionPane;

public class recursion {
		   
	int fact(int n) 
	{
	int result;

	if (n == 1) return 1;

	result = fact (n-1)*n;

	return result;
	}
		   
//new method rTest		     
		   public void rTest (){

		 recursion f = new recursion();

		 System.out.println("Factorial of 3 is " + f.fact(3)); //calls method fact to perform operation 3!		          
		 try{Thread.sleep(1000);}							  //1 s. time delay					
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
		  JOptionPane.showInputDialog("Your turn! Enter a positive integer between 1 and 20.");   
		  		
//error checking          
		   try
		   {			      		
		    urResult = Integer.parseInt(input);	//converts input into an int
		    		
		    }
		    catch(NumberFormatException e)
		    {
		    System.out.println("\nDrink bleach.");	//prompts user to drink bleach   	  
	         System.exit(0);						//close program				        	
		    }
		      	
//error checking for numbers outside specified range
			if(!(urResult < 21) | !(urResult > 0))
			{
						          
			System.out.println("\n \n well... you're a jerk.");
			System.exit(0);				//close program				        	

		input = 
		JOptionPane.showInputDialog("Enter a positive integer between 1 and 10.");   
				  		          
		urResult = Integer.parseInt(input);
			 } //end if
		         
			 urFact(urResult); //sent urResult to method urFact
		          
		    System.out.println("Factorial of " + urResult + " is " + f.urFact(urResult)); //asks for urResult from urFact
		    
		    try{Thread.sleep(1250);}							
			 catch(Exception e){};
		    System.out.println("Let's do something else...");
		    
		    try{Thread.sleep(800);}							
			 catch(Exception e){};
		    reversed();
		     }//end method
		     		     
//new method urFact			 
		     int urFact(int u)
			 {
				 int urResult;	 
				   
				  if (u == 1) return 1;				   
				  urResult = fact (u-1) * u;	//performs factorial operation

				  return urResult;	
			 } //end method
		     
//new method 	
		     
		     protected void reversed()
		     {
				 String str = 
		    	 JOptionPane.showInputDialog("Type something below");   
				 Other(str);
				 
		    	 System.out.println("\nHere you go: \n" + Other(str)); 
		    	 
		    	 try{Thread.sleep(2000);}			    	 
				 catch(Exception e){};
				 
		    	 System.out.println("That was fun. Now, on to the cool part!"); 

		    	 try{Thread.sleep(2500);}			    	 
				 catch(Exception e){};
				 
		    	 
//		    	 System.out.println("Well, that was fun. Goodbye.");
				 Rec_Part3 newRec = new Rec_Part3();
				 newRec.newMaine();

		     }
//new method		     
		     protected String Other(String str)	//from stackoverflow 
		     {		    	 		    	 		    				 
				 
			        if ((null == str) || (str.length()  <= 1)) {
			        			    	 
			            return str;
			            
			        }
			        String reversed = Other(str.substring(1)) + str.charAt(0);	//takes input and reverses character order

			        return reversed;
			        
//		         System.exit(0);						//close program				        	
		     }// end other
		     
		     
			
		} //end class

//Math recursion link: http://www.java-samples.com/showtutorial.php?tutorialid=151
//String recursion link: http://stackoverflow.com/questions/9723912/reversing-a-string-with-recursion-in-java