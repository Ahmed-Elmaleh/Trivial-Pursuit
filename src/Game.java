

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.Timer;



public class Game implements Runnable {

	public Game() {
		this.board = new Board();
	}
	
    public static void main(String[] args) {
   
    	EventQueue.invokeLater(new Game());
	
    }
    
    public void run() {
    	 new View(board);
    	 
    	//check if winner
 		Timer timer = new Timer(100, new ActionListener() {
 			@Override
 			public void actionPerformed(ActionEvent e) {
 				if(board.isThereAWinner()) {
 					System.out.println("The winner is " + board.getPlayers().getCurrentPlayerName(board.getCurrentPlayer()));
 					System.exit(0);
 				}
 			}
 		});
 		timer.start();
    }
  
    
    private Board board;
	
  
}


