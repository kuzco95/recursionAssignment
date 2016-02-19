package gifAnimation;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.*;

public class Interface {
	
	//public static Object main;
	protected Integer cycleNum;
   
    protected void middleMan(){
    	String colorType = 
    			JOptionPane.showInputDialog("Greetings! Select a set of colors: \n"
    					+ "A. Primary \n"
    					+ "B. Secondary \n"
    					+ "C. Default");	
    	
    	//error checking
    	if(colorType == null){		//from Cordell
    		System.exit(0);
    	}
    	if(colorType.equals("A")){
    		catGIF_Primary catPrime = new catGIF_Primary();			//primary color class
    		//catPrime(); //.catGIF_Primary();
    	}else{
    	if(colorType.equals("B")){
    		catGIF_Secondary catTwo = new catGIF_Secondary();		//secondary color class
    	}else{
    	if(colorType.equals("C")){
    		catGIF defCat = new catGIF();							//superclass
    	}else{
    		System.out.println("Default it is!");
    	}
    	}
    	}//end else
    	
    	String cycles = 
	    		JOptionPane.showInputDialog("Pick a number between 1 and 10");	
		//error checking:
		try{
			cycleNum = Integer.valueOf(cycles);//stack overflow 
			//http://stackoverflow.com/questions/5585779/converting-string-to-int-in-java
			if (cycleNum<= 1||cycleNum>=10){
				System.out.println("You little rebel.");
				cycleNum = 5;
			}
		}catch(NumberFormatException elitist){
			System.out.println("Stuff");
			cycleNum = 5;
		}//end try catch
    }//end middleMan
    protected Interface(){
    	middleMan(); 
    	
    }//end constructor

}//end class
