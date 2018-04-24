import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Board extends JButton{
	private static final int SIZE = 200;
	private boolean revealed = false;
	private int row = 0;
	private int col = 0;
	private int turns = 9;
	
	/*public boolean getIsOn() {
		return ison;
	}
	*/
	public Board (int r, int c){
		row = r;
		col = c;
		setPreferredSize(new Dimension (SIZE, SIZE));
	}
	

	public void setBackground(Color white) {
		// TODO Auto-generated method stub
	}
	/*	
	}
	public void toggle() {
		//if off, turn it to on, if on, turn it to off
		if (ison) {
			ison = false;
			setText("X");
				
		}
		else {
			ison = true;
			setText("O");
		}
		
	}	*/

	public void addActionListener(ActionListener actionListener) {
		// TODO Auto-generated method stub
		int turns = 9;
		setText("");
	//for (int i = 0; i < turns; i--) {
			if (turns %2 == 0) {
				setText("X");
			//terrain[r][c].reveal(true);

			
				turns--;
			}
			else{
				setText("O");
				turns--;
			
		}
		//}
			//terrain[GRIDSIZE][GRIDSIZE].setBackground(Color.WHITE);
			
		//setText("X");
			
		
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
					//setBackground(Color.BLACK);
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
