import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;

//new
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent; 

public class TicTacToeTry extends JFrame {
	private static final int GRIDSIZE = 3;
	String message;
	
	
	
	//JButton[][] buttons = new JButton[3][3];
	private Board [][] terrain = new Board[GRIDSIZE][GRIDSIZE];
	private static final long serialVersionUID = 1L;
	JPanel titlePanel = new JPanel();
	boolean gameWon = false; //come back to this
	private int turns = 9;
	
	public TicTacToeTry(){
		intGUI();
		setTitle("Tic Tac Toe");
		setSize(500, 500); //pixels
		setResizable(false);
		pack();
		setLocationRelativeTo(null); 
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.add (centerPanel);
		
	}
	
	public void intGUI() {
		JPanel titlePanel = new JPanel();
		add(titlePanel, BorderLayout.PAGE_START);
		titlePanel.setBackground(Color.BLACK);
		JLabel titleLabel = new JLabel("TicTacToe");
		titleLabel.setBackground(Color.BLACK);
        titleLabel.setOpaque(true);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titlePanel.add(titleLabel);
		//JButton Board;
		
		titlePanel.add(titleLabel);
		titleLabel.setHorizontalAlignment(JLabel.CENTER); //left or right
		Font titlefont = new Font("Georgia", Font.BOLD, 18);
		titleLabel.setForeground(Color.WHITE);
		titleLabel.setFont(titlefont);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setBackground(Color.MAGENTA);
		centerPanel.setLayout(new GridLayout(GRIDSIZE, GRIDSIZE));
		add(centerPanel, BorderLayout.CENTER);
		add(titleLabel, BorderLayout.LINE_START);
		//centerPanel.add(centerPanel);
		//Doesn't work. Center Panel does not appear

		/*JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.BLACK);
        add(buttonPanel, BorderLayout.PAGE_END);
        JButton newMazeButton = new JButton("New Game");
        JButton newMazeButton2 = new JButton("Quit Game");
        newMazeButton.setFocusable(false);
        newMazeButton2.setFocusable(false);
        buttonPanel.add(newMazeButton, BorderLayout.CENTER);
        buttonPanel.add(newMazeButton2, BorderLayout.CENTER);
        */ //Put in later
		
		//turns
		/*private void numTurns() {
			turns--;
		}
		
		for (int i = 0; i < 9; i++) {
			if (turns%2 == 0) {
					
					
			}
			else {
					
			}
			//make separate if statements for player 1 and player 2
			//based on whether they're number is divisible by 2...?
			//if((x%2)==0)
			   // even
			//else
			   // odd
			//I NEED A FUNCTION FOR THIS, RIGHT?!
		
			//
		*/
		
	
		for (int r = 0; r < GRIDSIZE; r++) {
			for (int c = 0; c < GRIDSIZE; c++) {
				terrain[r][c] = new Board(r, c);
				terrain[r][c].setBackground(Color.WHITE);
				terrain[r][c].setText("");
				
				terrain[r][c].addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						Board button = (Board) e.getSource();
						int row = button.getRow();
						int col = button.getCol();
						System.out.println("" + row + col);
						terrain[row][col].reveal(true, turns);  
						turns--;
						
						if (turns == 0) {
							JOptionPane.showMessageDialog(null, "Game over.");
							
							promptForNewGame(message);
							
						}
						
						
						
						
					}			
										
				});
				
				centerPanel.add(terrain[r][c]);
			}
		}
	
	
			
		}
	
	private void promptForNewGame(String message) {
		
		int option = JOptionPane.showConfirmDialog(this, message, "Play Again?", JOptionPane.YES_NO_OPTION);
		if (option == JOptionPane.YES_OPTION) {
			newGame();
		}
		else {
			System.exit(0);
		}
	}
	private void newGame() {
		for (int r = 0; r < GRIDSIZE; r++) {
			for (int c = 0; c < GRIDSIZE; c++) {
				terrain[r][c].reset();
				
			}
			
		}
		//setHoles();
	}
		
	

	public static void main(String[] args) {
		char player = 'O';
		try {
            String className = UIManager.getCrossPlatformLookAndFeelClassName();
            UIManager.setLookAndFeel(className);
        } catch ( Exception e) {}
        
        EventQueue.invokeLater(new Runnable (){
            @Override
            public void run() {
                new TicTacToeTry();
                //newMaze();
            }   
        });
    }

}
