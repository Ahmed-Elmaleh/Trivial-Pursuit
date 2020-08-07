 

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Timer;



public class Game implements Runnable {

    public static void main(String[] args) {
   
    	EventQueue.invokeLater(new Game());
	
    }
    
    public void run() {
    	board = new Board();
    	view = new View(board);
	    	 
		//check if winner
		Timer timer = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(board.isThereAWinner()) {
					
					view.getBtnSetUpPlayers().setVisible(false);
					view.getBtnRollDice().setVisible(false);
					view.getBtnRestart().setVisible(true);
					view.getTextDiceResult().setVisible(false);
					view.getLblResult().setVisible(false);
				
		
					String message = "Game over!\n" +"Congratulations " + 
							board.getPlayersManagement().
							getCurrentPlayerName(board.getCurrentPlayer())
							+ ", You are the winner!";
					
					board.instructions(view.getMessageTextArea(), message);
					
					
					board.setHasWinner(false);
					
					view.getBtnRestart().addActionListener(new ActionListener(){
						@Override
						public void actionPerformed(ActionEvent e) {
							view.getFrmView().dispose();
							run();
						}
					});
					
				}
			}
		});
		timer.start();
    }
  
    
    private Board board;
    private View view;
	
  
}


