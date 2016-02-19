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

public class catGIF_Primary extends catGIF {
int color = 0;
	
	final int numberOfButtons = 3;
	final  int numberOfImages = 4;
	private static final long serialVersionUID = 1L;
	protected JButton buttonArray[] = new JButton[numberOfButtons];
	protected Icon rediconArray[] = new Icon[numberOfImages];
	protected Icon blueiconArray[] = new Icon[numberOfImages];
	protected Icon yellowiconArray[] = new Icon[numberOfImages];

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
			System.out.println("Stuff");
			cycleNum = 5;
		}//end try catch
		
	}//end pickCyc method	
	
	public catGIF_Primary() {		//constuctor 
		setSize(575, 400);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		getContentPane().setBackground(Color.white);
				
		buttonArray[0] = new JButton("Blue");			
		buttonArray[1] = new JButton("Red");			
		buttonArray[2] = new JButton("Yellow");			

		for (int i=0; i < numberOfButtons; i++) {
			add(buttonArray[i]);  // add button to JFrame
			buttonArray[i].addActionListener(this);
		}

		rediconArray[0] = new ImageIcon("GIFcat1RED.gif");
		rediconArray[1] = new ImageIcon("GIFcat2RED.gif");
		rediconArray[2] = new ImageIcon("GIFcat3RED.gif");
		rediconArray[3] = new ImageIcon("GIFcat4RED.gif");
		
		blueiconArray[0] = new ImageIcon("GIFcat1BLUE.gif");
		blueiconArray[1] = new ImageIcon("GIFcat2BLUE.gif");
		blueiconArray[2] = new ImageIcon("GIFcat3BLUE.gif");
		blueiconArray[3] = new ImageIcon("GIFcat4BLUE.gif");
		
		yellowiconArray[0] = new ImageIcon("GIFcat1YEL.gif");
		yellowiconArray[1] = new ImageIcon("GIFcat2YEL.gif");
		yellowiconArray[2] = new ImageIcon("GIFcat3YEL.gif");
		yellowiconArray[3] = new ImageIcon("GIFcat4YEL.gif");
		
		//iconArray[0].getScaledInstance(300, 300, Image.SCALE_DEFAULT);
		myJLabel = new JLabel(rediconArray[0]);
				
		add(myJLabel);
		setLocationRelativeTo(null);
		setVisible(true);
		for(int j=0; j < 500 && !isStopped; j++){ //run 500 times
		for(int i=0; i < numberOfImages; i++) {
			try {
				if(color == 0){
				myJLabel.setIcon(rediconArray[i]);
				}else if(color == 1){
					myJLabel.setIcon(blueiconArray[i]);
				}
				else{
					myJLabel.setIcon(yellowiconArray[i]);
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

//public static void main( String args[]) throws InterruptedException{
//	catGIF_Primary myCheapAnimation = new catGIF_Primary();
//}//end main

}
