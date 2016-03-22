package recursion_Package;

//driver class; only starts the program
//takes us to non-static class called recursion

public class recursionDriver {
	 protected void rTest(){
//		 System.out.println("hi");
//		 rTest();
		
		 int x = 2;
		 x++;
		 int a = x + 1;
		
		 System.out.println("hi " + a);
		 rTest();
	    }
    public static void main( String args[]) throws InterruptedException{
    //System.out.println("hi"); 

    recursion NewRec = new recursion();
    NewRec.rTest();
    
//    	rTest newT = new rTest(); //does not work
//    	newT();
    } //end main
  
   
} //end class
