import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;


public class Controller {
	//View
	private View view;
		
		
	///Model
	private Player[] players;
	private int numberOfPlayers;
	
	
	//Constructor
	public Controller(View v) {
		this.view = v;	

	}
	
	
	public void runController() {
		showWelcomeMessage();
		gameSetUp();
	}
	

	
	//Set number of players and create and array with a dynamic size
	private void gameSetUp() {
		

		view.getBtnSetUpPlayers().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				numberOfPlayers = getNumberOfPlayers();
				players = new Player[numberOfPlayers];
				getUserNames();
				setUpGameBoard(); 
				
			}
		});
		
		
	   
		
	}
	
	//get players' names
	private void getUserNames() {
		
		
		for(int i = 0; i < numberOfPlayers; i++) {
			try {
				JDialog.setDefaultLookAndFeelDecorated(true);
			    Object selection = JOptionPane.showInputDialog(null, "What is the player " + (i + 1) + " name?",
			        "", JOptionPane.QUESTION_MESSAGE, null, null, null);
			    Player player = new Player((String)selection);
			    players[i] = player;
			}catch(Exception e) {
				System.out.println("Invalid name");
			}
			
		}
	}
	
	//Set up game board after player enter the number of players
	private void setUpGameBoard() {
		view.getBtnSetUpPlayers().setVisible(false);
		view.getBtnRollDice().setVisible(true);
		
		setUpNumberOfPlayerTokens();
		
	}
	
	
	//Display tokens and players' names base on the input number of players
	private void setUpNumberOfPlayerTokens() {
		
		final int ONE_PLAYER = 1;
		final int TWO_PLAYERS = 2;
		final int THREE_PLAYERS = 3;
		final int FOUR_PLAYERS = 4;
		
		switch (numberOfPlayers) {
			case ONE_PLAYER:
			{
				view.getTextPlayer2Piece1().setVisible(false);
				view.getTextPlayer2Piece2().setVisible(false);
				view.getTextPlayer2Piece3().setVisible(false);
				view.getTextPlayer2Piece4().setVisible(false);
				
				view.getTextPlayer3Piece1().setVisible(false);
				view.getTextPlayer3Piece2().setVisible(false);
				view.getTextPlayer3Piece3().setVisible(false);
				view.getTextPlayer3Piece4().setVisible(false);
				
				view.getTextPlayer4Piece1().setVisible(false);
				view.getTextPlayer4Piece2().setVisible(false);
				view.getTextPlayer4Piece3().setVisible(false);
				view.getTextPlayer4Piece4().setVisible(false);
				
				view.getLblPlayer1().setText(players[ONE_PLAYER - 1].getName() + ":");
				
				break;
			}
			case TWO_PLAYERS:
			{
				view.getTextPlayer3Piece1().setVisible(false);
				view.getTextPlayer3Piece2().setVisible(false);
				view.getTextPlayer3Piece3().setVisible(false);
				view.getTextPlayer3Piece4().setVisible(false);
				
				view.getTextPlayer4Piece1().setVisible(false);
				view.getTextPlayer4Piece2().setVisible(false);
				view.getTextPlayer4Piece3().setVisible(false);
				view.getTextPlayer4Piece4().setVisible(false);
				
				view.getLblPlayer1().setText(players[ONE_PLAYER - 1].getName() + ":");
				view.getLblPlayer2().setText(players[TWO_PLAYERS - 1].getName() + ":");
				
				break;
				
				
			}
			case THREE_PLAYERS:
			{
				view.getTextPlayer4Piece1().setVisible(false);
				view.getTextPlayer4Piece2().setVisible(false);
				view.getTextPlayer4Piece3().setVisible(false);
				view.getTextPlayer4Piece4().setVisible(false);
				
				view.getLblPlayer1().setText(players[ONE_PLAYER - 1].getName() + ":");
				view.getLblPlayer2().setText(players[TWO_PLAYERS - 1].getName() + ":");
				view.getLblPlayer3().setText(players[THREE_PLAYERS - 1].getName() + ":");
				
				break;
			}
			case FOUR_PLAYERS:
			{
				view.getLblPlayer1().setText(players[ONE_PLAYER - 1].getName() + ":");
				view.getLblPlayer2().setText(players[TWO_PLAYERS - 1].getName() + ":");
				view.getLblPlayer3().setText(players[THREE_PLAYERS - 1].getName() + ":");
				view.getLblPlayer4().setText(players[FOUR_PLAYERS - 1].getName() + ":");
				break;
			}
		}
		
	}
	
	//Show welcome message
	private void showWelcomeMessage() {
		JTextArea msg = new JTextArea("Welcome to Trivial Purfuit! To start the"  
								+ "game, click the \"SET UP PLAYERS\" button. You will" 
								+ " be asked to prived the number of players. To " 
								+ "start your move, click on \"ROLL DICE\" button."   
								+ "Then decide where you would like to move by"  
								+ " clicking your choice on the board, either clockwise "   
								+ "or counter-clockwise. Answer the question. then"
								+ "click \"OK\" button. If you land on a wedge tile, you "  
								+ "have opportunity to play for a wedge. To get a wedge," 
								+ " you have to asnwer the wedge question correctly. The "  
								+ "first player to go around the board and get all the "  
								+ "wedges will be allowed to go to the middle of the board."   
								+ "The first player to answer a question from the center of "  
								+ "the board wins the game.\n\nGood luck!");
		msg.setLineWrap(true);
		msg.setWrapStyleWord(true);
		msg.setBounds(806, 108, 250, 559);
	   
	    JOptionPane.showMessageDialog(null, msg );
	    
	    
	}
	
	//Get number of players using dialog
	private int getNumberOfPlayers() {
		
		int numberOfPlayers = 0;
		
		try {
			JDialog.setDefaultLookAndFeelDecorated(true);
		    Object[] selectionValues = { "1", "2", "3", "4" };
		    String initialSelection = "1";
		    Object selection = JOptionPane.showInputDialog(null, "How many players?",
		        "", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		    numberOfPlayers = Integer.parseInt((String)selection);
		}catch(Exception e) {
			System.out.println("Invalid input number of players");
		}
	    return numberOfPlayers;
	}
	
	


	
	
}
