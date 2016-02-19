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
//This program displays an animation of a unicat
//code from Steve Harper's CheapAnimation5
//help from Cordell
public class catGIF extends JFrame implements ActionListener{
	
	int color = 0;
	
	final int numberOfButtons = 3;
	final  int numberOfImages = 4;
	private static final long serialVersionUID = 1L;
	protected JButton buttonArray[] = new JButton[numberOfButtons];
	protected Icon iconArray[] = new Icon[numberOfImages];
	protected Icon blueiconArray[] = new Icon[numberOfImages];
	protected Icon pinkiconArray[] = new Icon[numberOfImages];

	protected JLabel myJLabel = new JLabel();
	protected boolean isRunning = true; //false;
	protected boolean isStopped = false;
	protected Integer cycleNum;
	protected Integer sizeX;
	
	public catGIF() {
		
		
		setNum();		//call set method
		sizeMethod();	//call set size method
		setSize(sizeX, 400);
		
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		getContentPane().setBackground(Color.white);
				
		buttonArray[0] = new JButton("Blue");			
		buttonArray[1] = new JButton("Default");			
		buttonArray[2] = new JButton("Pink");			

		for (int i=0; i < numberOfButtons; i++) {
			add(buttonArray[i]);  // add button to JFrame
			buttonArray[i].addActionListener(this);
		}

		iconArray[0] = new ImageIcon("GIFcat1.gif");
		iconArray[1] = new ImageIcon("GIFcat2.gif");
		iconArray[2] = new ImageIcon("GIFcat3.gif");
		iconArray[3] = new ImageIcon("GIFcat4.gif");
		
		blueiconArray[0] = new ImageIcon("GIFcat1BLUE.gif");
		blueiconArray[1] = new ImageIcon("GIFcat2BLUE.gif");
		blueiconArray[2] = new ImageIcon("GIFcat3BLUE.gif");
		blueiconArray[3] = new ImageIcon("GIFcat4BLUE.gif");
		
		pinkiconArray[0] = new ImageIcon("GIFcat1PINK.gif");
		pinkiconArray[1] = new ImageIcon("GIFcat2PINK.gif");
		pinkiconArray[2] = new ImageIcon("GIFcat3PINK.gif");
		pinkiconArray[3] = new ImageIcon("GIFcat4PINK.gif");
		
		//iconArray[0].getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		myJLabel = new JLabel(iconArray[0]);
		
		add(myJLabel);
		setLocationRelativeTo(null);
		setVisible(true);
		for(int j=0; j < cycleNum && !isStopped; j++){ //run 500 times
		for(int i=0; i < numberOfImages; i++) {
			try {
				if(color == 0){
				myJLabel.setIcon(iconArray[i]);

				}else if(color == 1){
					myJLabel.setIcon(blueiconArray[i]);
				}
				else{
					myJLabel.setIcon(pinkiconArray[i]);
				}
				Thread.sleep(165);
				while (!isRunning){
					Thread.sleep(165);
				}
	    	} catch (InterruptedException e) {
	    		e.printStackTrace();
	    	}	
		}

		}//end for loop
		//System.out.println("Nope. Let's do 300.");

	}//end constructor
	
	protected void setNum(){		//set method
		
		String cycles = 
	    		JOptionPane.showInputDialog("Pick a number between 1 and 20.");	
		//error checking:
		try{
			cycleNum = Integer.valueOf(cycles);//stack overflow 
			//http://stackoverflow.com/questions/5585779/converting-string-to-int-in-java
			if (cycleNum < 1||cycleNum > 20){
				System.out.println("You little rebel.");
				cycleNum = 7;
			}
		}catch(NumberFormatException elitist){
			System.out.println("How about 5.");
			cycleNum = 5;
			
			//sizeMethod();
		}//end try catch 
	}//end set method
	
	protected void sizeMethod(){
		
		String xValue = 
	    		JOptionPane.showInputDialog("Pick a number between 300 and 600.");	
		//error checking:
		try{
			sizeX = Integer.valueOf(xValue);//stack overflow 
			//http://stackoverflow.com/questions/5585779/converting-string-to-int-in-java
			if (sizeX < 300||sizeX > 600){
				System.out.println("Nope. Let's do 300");
				sizeX = 300;
			}
		}catch(NumberFormatException elitist){
			System.out.println("How about 300.");
			sizeX = 300;
		}//end try catch
		
	}//end second set method

	public void actionPerformed(ActionEvent event) {
			//JOptionPane.showMessageDialog(CheapAnimation.this, "You pressed "+ event.getActionCommand());
			if (event.getSource() == buttonArray[0]) {
			 
				color = 1;
			} else if (event.getSource() == buttonArray[1]) {
				
				color = 0;
				System.out.println("Nope. Let's do 300.");
//				catGIF_Secondary catTwo = new catGIF_Secondary();
//						catTwo.setNum();
			} else if (event.getSource() == buttonArray[2]) {
				color = 2;
			}			

	}//end action listener method
	
    public static void main( String args[]) throws InterruptedException{
//		Interface newInterface = new Interface();
//		newInterface.middleMan();		//call interface method   	
    	catGIF myCheapAnimation = new catGIF();		//renames constructor and goes to it
    }//end main
}//end class

//package gifAnimation;
//
//import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.Image;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
//import java.util.*;
//
////This program displays an animation of a unicat
////code from Steve Harper's CheapAnimation5
////help from Cordell
//
//public class catGIF extends JFrame implements ActionListener{
//	
////	String cycles = 
////    		JOptionPane.showInputDialog("Greetings! Pick a number between 1 and 10");
////	Integer cycleNum = Integer.valueOf(cycles);	//stack overflow 
////	//http://stackoverflow.com/questions/5585779/converting-string-to-int-in-java
////	try{
////		Integer cycleNum = Integer.valueOf(cycles);
////	}catch()	
//	int color = 0;
//	
//	final int numberOfButtons = 0;
//	final  int numberOfImages = 4;
//	protected static final long serialVersionUID = 1L;
//	protected JButton buttonArray[] = new JButton[numberOfButtons];
//	protected Icon iconArray[] = new Icon[numberOfImages];
//	//private Icon blueiconArray[] = new Icon[numberOfImages];
//	//private Icon pinkiconArray[] = new Icon[numberOfImages];
//
//	protected JLabel myJLabel = new JLabel();
//	protected boolean isRunning = true; //false;
//	protected boolean isStopped = false;
//	
//	public catGIF classArray[] = new catGIF[3];
//	//classArray[1] = catGIF_Primary
//	
//	public catGIF() {		//constructor method
//		
////		classArray[0] = new catGIF();
////		classArray[1] = new catGIF_Primary();
////		classArray[2] = new catGIF_Secondary();
//	
//		 Interface newInt = new Interface();
//		int x = newInt.cycleNum;
//
//		setSize(575, 400);
//		setLayout(new FlowLayout());
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
//		getContentPane().setBackground(Color.white);
//							
//
//		for (int i=0; i < numberOfButtons; i++) { //goes through the button array
//			add(buttonArray[i]);  				// add button to JFrame
//			buttonArray[i].addActionListener(this);
//		}
//
//		iconArray[0] = new ImageIcon("GIFcat1.gif");
//		iconArray[1] = new ImageIcon("GIFcat2.gif");
//		iconArray[2] = new ImageIcon("GIFcat3.gif");
//		iconArray[3] = new ImageIcon("GIFcat4.gif");
//		
////		blueiconArray[0] = new ImageIcon("GIFcat1BLUE.gif");
////		blueiconArray[1] = new ImageIcon("GIFcat2BLUE.gif");
////		blueiconArray[2] = new ImageIcon("GIFcat3BLUE.gif");
////		blueiconArray[3] = new ImageIcon("GIFcat4BLUE.gif");
////		
////		pinkiconArray[0] = new ImageIcon("GIFcat1PINK.gif");
////		pinkiconArray[1] = new ImageIcon("GIFcat2PINK.gif");
////		pinkiconArray[2] = new ImageIcon("GIFcat3PINK.gif");
////		pinkiconArray[3] = new ImageIcon("GIFcat4PINK.gif");
////		
//		//iconArray[0].getScaledInstance(300, 300, Image.SCALE_DEFAULT);
//		myJLabel = new JLabel(iconArray[0]);
//				
//		add(myJLabel);
//		setLocationRelativeTo(null);		//centers the JFrame
//		setVisible(true);
//		int cycleNum = 5;
//		for(int j=0; j < cycleNum && !isStopped; j++){ 
//		for(int i=0; i < numberOfImages; i++) {
//			try {
//				if(color == 0){
//				myJLabel.setIcon(iconArray[i]);
//				}				
//				Thread.sleep(175);
//				while (!isRunning){
//					Thread.sleep(175);
//				}
//	    	} catch (InterruptedException e) {
//	    		e.printStackTrace();
//	    	}	
//		}
//		
//		}//end for loop
//	}//end constructor
//
//	public void actionPerformed(ActionEvent event) {
//			if (event.getSource() == buttonArray[0]) {
//				//isRunning = false;
//				//catBlue(); 
//				color = 1;
//			} else if (event.getSource() == buttonArray[1]) {
//				//isRunning = false;
//				color = 0;
//			} else if (event.getSource() == buttonArray[2]) {
//				isStopped = true;
//				color = 2;
//			}
//					
//	}//end action listener method
//	
//    public static void main( String args[]) throws InterruptedException{
//    	catGIF myCheapAnimation = new catGIF();
//    	Interface newInt = new Interface();
//		
//		int x = newInt.cycleNum;
//    	//Interface.middleMan();
//    	
//    }//end main
//}//end class

