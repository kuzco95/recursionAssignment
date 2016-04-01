package recursion_Package;

//driver class; only starts the program
//takes us to non-static class called recursion

public class recursionDriver {
//	 protected static int rTest(int a){
//		 rTest();
//
//		 a = a + 1;
//		
//		 System.out.println(a);
//		 if(a <= 10){
//			 return a = 2;
//		 }
//			return rTest(a);
//		 
//	    }
    public static void main(String args[]) throws InterruptedException{
    recursion NewRec = new recursion();
    NewRec.rTest();
//    	Rec_Part3 newRec = new Rec_Part3();
//    	newRec.newMaine();
    
    	//rTest(0); //does not work
//    	newT();
    } //end main 
} //end class
