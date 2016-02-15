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
//This program displays an animation of a unicat
//code from Steve Harper's CheapAnimation5
//help from Cordell
public class catGIF extends JFrame implements ActionListener{

	int color = 0;
	
	final int numberOfButtons = 3;
	final  int numberOfImages = 4;
	private static final long serialVersionUID = 1L;
	private JButton buttonArray[] = new JButton[numberOfButtons];
	private Icon iconArray[] = new Icon[numberOfImages];
	private Icon blueiconArray[] = new Icon[numberOfImages];
	private Icon pinkiconArray[] = new Icon[numberOfImages];

	private JLabel myJLabel = new JLabel();
	private boolean isRunning = true; //false;
	private boolean isStopped = false;
	
	public catGIF() {
		setSize(575, 400);
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
		//setLocation(null);
		setVisible(true);
		for(int j=0; j < 500 && !isStopped; j++){ //run 500 times
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
				Thread.sleep(175);
				while (!isRunning){
					Thread.sleep(175);
				}
	    	} catch (InterruptedException e) {
	    		e.printStackTrace();
	    	}	
		}
		
		}//end for loop
	}//end constructor
//excerpt 1	
	public void actionPerformed(ActionEvent event) {
			//JOptionPane.showMessageDialog(CheapAnimation.this, "You pressed "+ event.getActionCommand());
			if (event.getSource() == buttonArray[0]) {
				//isRunning = false;
				//catBlue(); 
				color = 1;
			} else if (event.getSource() == buttonArray[1]) {
				//isRunning = false;
				color = 0;
				//buttonArray[0].setText("Resume");
			} else if (event.getSource() == buttonArray[2]) {
//				isStopped = true;
//				buttonArray[0].setText("Bye");
//				buttonArray[1].setText("Bye");
				color = 2;
			}
					
	}//end action listener method
	
    public static void main( String args[]) throws InterruptedException{
    	catGIF myCheapAnimation = new catGIF();
    }//end main
}//end class
//excerpt 1
//private void catBlue(){
//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
////
////blueiconArray[0] = new ImageIcon("GIFcat1BLUE.gif");
////blueiconArray[1] = new ImageIcon("GIFcat2BLUE.gif");
////blueiconArray[2] = new ImageIcon("GIFcat3BLUE.gif");
////blueiconArray[3] = new ImageIcon("GIFcat4BLUE.gif");
//myJLabel = new JLabel(blueiconArray[0]);
//
//for(int j=0; j < 500 && !isStopped; j++){ //run 500 times
//	for(int i=0; i < numberOfImages; i++) {
//		try {
//			myJLabel.setIcon(blueiconArray[i]);
//			Thread.sleep(175);
//			while (!isRunning){
//				Thread.sleep(175);
//			}
//    	} catch (InterruptedException e) {
//    		e.printStackTrace();
//    	}	
//	}
//	
//	}//end for loop
//
//}//end catBlue method
