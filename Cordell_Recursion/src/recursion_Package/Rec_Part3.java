package recursion_Package;
import java.awt.BasicStroke;
import java.awt.Canvas; 
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;
import java.io.*;
import java.util.InputMismatchException;
import java.util.*;
import javax.swing.JOptionPane;

public class Rec_Part3 extends Canvas{	
	// fields for drawing
	  private JFrame frame;
	  private final int WINDOW_WIDTH = 1280;
	  private final int WINDOW_HEIGHT = 750;

// method for frame characteristics
//uses the numbers defined above	  
	  public Rec_Part3() {	
	    frame = new JFrame("Tree of Life");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
	    frame.setLocationRelativeTo(null);
	    frame.setResizable(true);
	    frame.add(this);
	    setBackground(Color.black);
	    frame.setVisible(true);
	  }//end method

	  public void newMaine() {
		  //does nothing, program starts from the top
	  }//end method

	  @Override
	  public void paint(Graphics g) {
	    g.setColor(Color.cyan);		//defines color of the drawing lines
	    drawFractalTree(g, WINDOW_WIDTH / 2, WINDOW_HEIGHT -265, -90, 13);	//horizontal placement(middle), vertical placement, orientation, # iterations
	    drawFractalRoots(g, WINDOW_WIDTH / 2, WINDOW_HEIGHT -265, -90, 10);	//horizontal placement(middle), vertical placement, orientation, # iterations
	  }

//method executes drawing
//takes the numbers passed to it from 	  
	  public void drawFractalTree(Graphics g, int x1, int y1, double angle, int depth) {
			 
		  if (depth == 0) {
	    } else {
	      int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 5); // *horizontal stretchyness?
	      int y2 = y1 + (int) (Math.sin(Math.toRadians(angle)) * depth * 5);	//vertical stretchyness

	      Graphics2D g2d = (Graphics2D) g;
	      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

	      g2d.setStroke(new BasicStroke(0.1f * depth));
	      g2d.drawLine(x1, y1, x2, y2);	//starting line
	      
	      try{Thread.sleep(1);}							
			 catch(Exception e){};
			 
	      drawFractalTree(g, x2, y2, angle + 20, depth - 1); //right side angle; default: +30
	      
	      try{Thread.sleep(1);}							
			 catch(Exception e){};
			 
	      drawFractalTree(g, x2, y2, angle - 20, depth - 1); //left side angle; default: -30
	      
	      try{Thread.sleep(1);}							
			 catch(Exception e){};	      
	    }

	  }// end method
	  
	  public void drawFractalRoots(Graphics g, int x1, int y1, double angle, int depth) {
	 
		  if (depth == 0) {
		    } else {
		      int x2 = x1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 5); // *horizontal stretchyness?
		      int y2 = y1 + (int) (Math.cos(Math.toRadians(angle)) * depth * 5);	//vertical stretchyness

		      Graphics2D g2d = (Graphics2D) g;
		      g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);	//improves image quality

		      g2d.setStroke(new BasicStroke(0.1f * depth));
		      g2d.drawLine(x1, y1, x2, y2);

		      drawFractalTree(g, x2, y2, angle - 200, depth - 1); //left side angle; default: -30;
		      drawFractalTree(g, x2, y2, angle + 200, depth - 1); //left side angle; default: -30
	  }
	  }//end method
	  
}//end class

//code structure from: http://stackoverflow.com/questions/15682903/smoothly-animating-a-fractal-tree
//modifications: removed one JFrame, chan