import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Board extends JButton{
	private static final int SIZE = 600;
	private boolean revealed = false;
	private int row = 0;
	private int col = 0;
	//private int turns = 9;

	public void setBackground(Color white) {
		// TODO Auto-generated method stub
		
		
	}
	

	public void addActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		
	}
	
	
	 /*@Override
	    public void paintComponent(Graphics g){
	        //draw the background
	        g.setColor(Color.BLACK);
	        g.fillRect(0, 0, SIZE, SIZE);
	        g.setColor(Color.MAGENTA);
	        
	        g.setColor(Color.cyan);
	        g.drawLine(0, 0, SIZE - 1/4, SIZE);
	        g.drawLine(SIZE - 1/4, SIZE, 0, 0);
	 }*/
	 
	 public void reveal(boolean reveal, int turns) {
			revealed = reveal;
			if (revealed = true) {
				if (turns%2 == 1 ) {
					setBackground(Color.BLACK);
					setText("X"); 
					}
				
			
				else {
					setBackground(null);
					setText("O");
				}
			}
		setFocusPainted(false); //i don't know whether it does the thing it's supposed to do
			//} check your brackets if you have problems
	}
	public void reset() {
		//ison = false;
		setText("");
		setBackground(null);
	}
	
	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}



}
