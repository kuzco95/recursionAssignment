package gifAnimation;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class catGIF_Secondary extends catGIF {	
	//int color = 0;
		
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
		
		Interface newInt = new Interface();
		
		int cycleNum = newInt.cycleNum;		//renames cycleNum as cycleNum
		
		protected void pickCyc(){
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
				System.out.println("How about 5");
				cycleNum = 5;
			}//end try catch
			
		}//end pickCyc method
		
		public catGIF_Secondary() {	//constructor
			
			
			setSize(575, 400);
			setLayout(new FlowLayout());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			getContentPane().setBackground(Color.white);
					
			buttonArray[0] = new JButton("Purple");			
			buttonArray[1] = new JButton("Orange");			
			buttonArray[2] = new JButton("Green");			

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
//					isStopped = true;
//					buttonArray[0].setText("Bye");
//					buttonArray[1].setText("Bye");
					color = 2;
				}
						
		}//end action listener method

//	public static void main( String args[]) throws InterruptedException{
//		catGIF_Primary myCheapAnimation = new catGIF_Primary();
//	}//end main

	}//end class


