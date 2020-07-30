import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Board{
	
	public Board() {
		this.hasAWinner = false;
		this.players = new Players();
		this.currentPlayer = 0;
		this.dice = new Dice();
		this.squareBoard = new SquareBoard();
		this.questionBank = new QuestionBank("fileName");
		
		
	}
	
	public Players getPlayers() {
		return players;
	}

	public void setPlayers(Players players) {
		this.players = players;
	}
	
	public int getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	
	
	public Dice getDice() {
		return dice;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	
	public SquareBoard getSquareBoard() {
		return squareBoard;
	}

	public void setSquareBoard(SquareBoard squareBoard) {
		this.squareBoard = squareBoard;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	
	public boolean isThereAWinner() {
		return hasAWinner;
	}

	public void setHasWinner(boolean hasAWinner) {
		this.hasAWinner = hasAWinner;
	}

	public QuestionBank getQuestionBank() {
		return questionBank;
	}

	public void setQuestionBank(QuestionBank questionBank) {
		this.questionBank = questionBank;
	}
	
	
	
	
	//set player positions
	public void movePlayerPosition(JButton button, JTextArea messageTextArea) {
		
		
		
		if(players.getPlayers().get(currentPlayer - 1).isItFistStart()) {
			
			
			setBoardForStart(messageTextArea);	
			players.getPlayers().get(currentPlayer - 1).setItFistStart(false);
			
		}else {		
			
			int pos_x = players.getPlayers().get(currentPlayer - 1).getPos_x();
			int pos_y =  players.getPlayers().get(currentPlayer - 1).getPos_y();
			
			
			if(squareBoard.getButtonName(pos_x, pos_y) == "RAgain") {
				
				squareBoard.setButtonName(pos_x, pos_y, "RAgain");
				
			}else if(squareBoard.getButtonName(pos_x, pos_y) == "WEDGE") {
				squareBoard.setButtonName(pos_x, pos_y, "WEDGE");
			}else if(squareBoard.getButtonName(pos_x, pos_y) == "CENTER") {
				squareBoard.setButtonName(pos_x, pos_y, "Trivial Purfuit");
				
			}else
			{
				squareBoard.setButtonName(pos_x, pos_y, "");
			}
					
			
		}	
	
		button.setText(players.getCurrentPlayerName(currentPlayer));
		
		players.storePlayerNewPostion(squareBoard, button, currentPlayer);
		
		
	}
	
	//move player position
	public void setPossipleMovePosition() {
		
		if(!players.isThisPlayerReadyToGoToCenter(currentPlayer)) {
		
			int pos_x = players.getCurrentPositionX(currentPlayer);
			int pos_y = players.getCurrentPositionY(currentPlayer);
			
			
			int diceValue = dice.getDiceValue();
			
//			//This needs to be implemented. Will get out of bounds
//			board[pos_x + diceValue][pos_y].getButton().setEnabled(true);
//			board[pos_x][pos_y + diceValue].getButton().setEnabled(true);
//		
	
		}else {
			
			
			System.out.println("Someone got all token");
		}
	}
	
	//show roll dice
	public void showRollDice(JButton rollDice, JLabel JLabelResult, 
			JTextField textResult) {
		
		rollDice.setEnabled(true);
		rollDice.setVisible(true);
		JLabelResult.setVisible(true);
		textResult.setVisible(true);
		
	}


	public int getDiceValue() {
		return (dice.getDiceValue());
	}
	
	//Player play fist time
	public void setBoardForStart(JTextArea messageTextArea) {
		
		messageTextArea.setText(players.getCurrentPlayerName(currentPlayer) + ", Please select start position!");
		messageTextArea.setVisible(true);
		squareBoard.setAllButtonsToUnable();
		
				
	}

	
	//get the players' names
	public void getAndStorePlayersName() {

		
		for(int i = 0; i < numberOfPlayers; i++) {
			try {
				JDialog.setDefaultLookAndFeelDecorated(true);
			    Object selection = JOptionPane.showInputDialog(null, "What is the player " + (i + 1) + " name?",
			        "", JOptionPane.QUESTION_MESSAGE, null, null, null);
			    String name = (String)selection;
			    Player player = new Player();
			    player.setName(name);
			    players.addPlayer(player);;
 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}


	//Display players on the board
	public void displayPlayers(JLabel lblResult, JButton btnRollDice,
			JTextField textDiceResult, JButton btnSetUpPlayers,
			JTextField textPlayer1Piece1, JTextField textPlayer1Piece2,
			JTextField textPlayer1Piece3, JTextField textPlayer1Piece4,
			JTextField textPlayer2Piece1, JTextField textPlayer2Piece2,
			JTextField textPlayer2Piece3,
			JTextField textPlayer2Piece4, JTextField textPlayer3Piece1, 
			JTextField textPlayer3Piece2,  JTextField textPlayer3Piece3,
			JTextField textPlayer3Piece4, JTextField textPlayer4Piece1,
			JTextField textPlayer4Piece2, JTextField textPlayer4Piece3,
			JTextField textPlayer4Piece4, JLabel lblPlayer1, JLabel lblPlayer2,
			JLabel lblPlayer3, JLabel lblPlayer4, JLabel lblPlaying1,
			JLabel lblPlaying2, JLabel lblPlaying3, JLabel lblPlaying4) {

	
	
	    btnSetUpPlayers.setVisible(false);
	    
	    lblResult.setVisible(true);
	    btnRollDice.setVisible(true);
	    btnRollDice.setEnabled(false);
	    textDiceResult.setVisible(true);
	    

	    final int ONE_PLAYER = 1;
		final int TWO_PLAYERS = 2;
		final int THREE_PLAYERS = 3;
		final int FOUR_PLAYERS = 4;
		
		
		switch (numberOfPlayers) {
			case ONE_PLAYER:
			{
				textPlayer1Piece1.setVisible(true);
				textPlayer1Piece2.setVisible(true);
				textPlayer1Piece3.setVisible(true);
				textPlayer1Piece4.setVisible(true);

				
				lblPlayer1.setText(players.getPlayers().get(ONE_PLAYER - 1).getName() + ":");
				lblPlayer1.setVisible(true);
		
				break;
			}
			case TWO_PLAYERS:
			{
				textPlayer1Piece1.setVisible(true);
				textPlayer1Piece2.setVisible(true);
				textPlayer1Piece3.setVisible(true);
				textPlayer1Piece4.setVisible(true);
				
				textPlayer2Piece1.setVisible(true);
				textPlayer2Piece2.setVisible(true);
				textPlayer2Piece3.setVisible(true);
				textPlayer2Piece4.setVisible(true);
				
				lblPlayer1.setText(players.getPlayers().get(ONE_PLAYER - 1).getName() + ":");
				lblPlayer2.setText(players.getPlayers().get(TWO_PLAYERS - 1).getName() + ":");
				
				lblPlayer1.setVisible(true);
				lblPlayer2.setVisible(true);
	
				break;
			}
			case THREE_PLAYERS:
			{
				textPlayer1Piece1.setVisible(true);
				textPlayer1Piece2.setVisible(true);
				textPlayer1Piece3.setVisible(true);
				textPlayer1Piece4.setVisible(true);
				
				textPlayer2Piece1.setVisible(true);
				textPlayer2Piece2.setVisible(true);
				textPlayer2Piece3.setVisible(true);
				textPlayer2Piece4.setVisible(true);
				
				textPlayer3Piece1.setVisible(true);
				textPlayer3Piece2.setVisible(true);
				textPlayer3Piece3.setVisible(true);
				textPlayer3Piece4.setVisible(true);
				
				lblPlayer1.setText(players.getPlayers().get(ONE_PLAYER - 1).getName() + ":");
				lblPlayer2.setText(players.getPlayers().get(TWO_PLAYERS - 1).getName() + ":");
				lblPlayer3.setText(players.getPlayers().get(THREE_PLAYERS - 1).getName() + ":");
				
				lblPlayer1.setVisible(true);
				lblPlayer2.setVisible(true);
				lblPlayer3.setVisible(true);
				
				
				break;
			}
			case FOUR_PLAYERS:
			{
				textPlayer1Piece1.setVisible(true);
				textPlayer1Piece2.setVisible(true);
				textPlayer1Piece3.setVisible(true);
				textPlayer1Piece4.setVisible(true);
				
				textPlayer2Piece1.setVisible(true);
				textPlayer2Piece2.setVisible(true);
				textPlayer2Piece3.setVisible(true);
				textPlayer2Piece4.setVisible(true);
				
				textPlayer3Piece1.setVisible(true);
				textPlayer3Piece2.setVisible(true);
				textPlayer3Piece3.setVisible(true);
				textPlayer3Piece4.setVisible(true);
				
				textPlayer4Piece1.setVisible(true);
				textPlayer4Piece2.setVisible(true);
				textPlayer4Piece3.setVisible(true);
				textPlayer4Piece4.setVisible(true);
				
				
				lblPlayer1.setText(players.getPlayers().get(ONE_PLAYER - 1).getName() + ":");
				lblPlayer2.setText(players.getPlayers().get(TWO_PLAYERS - 1).getName() + ":");
				lblPlayer3.setText(players.getPlayers().get(THREE_PLAYERS - 1).getName() + ":");
				lblPlayer4.setText(players.getPlayers().get(FOUR_PLAYERS - 1).getName() + ":");
				
				
				lblPlayer1.setVisible(true);
				lblPlayer2.setVisible(true);
				lblPlayer3.setVisible(true);
				lblPlayer4.setVisible(true);
				
				break;
			}
		}
		SelectPlayerToPlayFirst();
		indicateWhoPlaying(lblPlaying1, lblPlaying2, lblPlaying3, lblPlaying4);
	}
	

	

	//select player to play first
	private void SelectPlayerToPlayFirst() {
		
		int max = numberOfPlayers; 
	    int min = 1; 
	    int range = max - min + 1; 
	  
	       
	    currentPlayer = ((int)(Math.random() * range) + min); 

	}
	
	//show who is playing
	private void indicateWhoPlaying(JLabel lblPlaying1, JLabel lblPlaying2, 
			JLabel lblPlaying3, JLabel lblPlaying4) {
		final int PLAYER1 = 1;
		final int PLAYER2 = 2;
		final int PLAYER3 = 3;
		final int PLAYER4 = 4;
	
		switch(currentPlayer) {
			case PLAYER1:
			{
				lblPlaying1.setVisible(true);
				break;
			}
			case PLAYER2:
			{
				lblPlaying2.setVisible(true);
				break;
			}
			case PLAYER3:
			{
				lblPlaying3.setVisible(true);
				break;
			}
			case PLAYER4:
			{
				lblPlaying4.setVisible(true);
				break;
			}
				
		}
		
		
	}
		
	

	private boolean hasAWinner;
	private Players players;
	private int currentPlayer;
	private int numberOfPlayers;
	private Dice dice;
	private SquareBoard squareBoard;
	
	private QuestionBank questionBank;
	
	

}	

