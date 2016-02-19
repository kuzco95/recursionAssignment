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
	
	protected Icon rediconArray[] = new Icon[numberOfImages];
	protected Icon blueiconArray[] = new Icon[numberOfImages];
	protected Icon yellowiconArray[] = new Icon[numberOfImages];

	private JLabel myJLabel = new JLabel();
	
	Interface newInt = new Interface();
	
	//int cycleNum = newInt.cycleNum;		//renames cycleNum as cycleNum
	
	
	protected void setNum(){
		String cycles = 
	    		JOptionPane.showInputDialog("Primary: Pick a number between 1 and 10");	
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
	
	public void catGIFPrimary() {		
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
		} //end for loop
		
		myJLabel = new JLabel(iconArray[0]);
				
		add(myJLabel);
		setLocationRelativeTo(null);
		setVisible(true);
		for(int j=0; j < 500 && !isStopped; j++){ //run 500 times
		for(int i=0; i < numberOfImages; i++) {
			try {
				if(color == 0){
				myJLabel.setIcon(iconArray[i]);
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
	
	protected void redCat(){
		iconArray[0] = new ImageIcon("GIFcatRED1.gif");
		iconArray[1] = new ImageIcon("GIFcatRED2.gif");
		iconArray[2] = new ImageIcon("GIFcatRED3.gif");
		iconArray[3] = new ImageIcon("GIFcatRED4.gif");
		
	}//end redCat
	
	protected void blueCat(){
		iconArray[0] = new ImageIcon("GIFcatBLUE1.gif");
		iconArray[1] = new ImageIcon("GIFcatBLUE2.gif");
		iconArray[2] = new ImageIcon("GIFcatBLUE3.gif");
		iconArray[3] = new ImageIcon("GIFcatBLUE4.gif");
		
	}//end blueCat
	
	protected void yellowCat(){
		iconArray[0] = new ImageIcon("GIFcatYEL1.gif");
		iconArray[1] = new ImageIcon("GIFcatYEL2.gif");
		iconArray[2] = new ImageIcon("GIFcatYEL3.gif");
		iconArray[3] = new ImageIcon("GIFcatYEL4.gif");
		
	}//end redCat
	
//excerpt 1	
	public void actionPerformed(ActionEvent event) {
			if (event.getSource() == buttonArray[0]) {
				//isRunning = false;
				//catBlue(); 
				//color = 1;
				blueCat();
				
			} else if (event.getSource() == buttonArray[1]) {
				//isRunning = false;
				color = 0;
				//buttonArray[0].setText("Resume");
			} else if (event.getSource() == buttonArray[2]) {
//				isStopped = true;
				color = 2;
			}
					
	}//end action listener method


}//end class