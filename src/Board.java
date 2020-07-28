import java.awt.TextField;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Board{
	
	public Board() {
		this.hasWinner = false;
		this.players = new ArrayList<Player>();
		this.currentPlayer = 0;
		this.dice = new Dice();
		this.board = new Square[BOARD_SIZE][BOARD_SIZE];
		initialBoard();
		
	}
	
	public ArrayList<Player>  getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player>  players) {
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
	

	public Square[][] getBoard() {
		return board;
	}

	public void setBoard(Square[][] board) {
		this.board = board;
	}
	
	
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	//set player positions
	public void movePlayerPosition(JButton button, JTextArea messageTextArea) {
		
		
		
		if(players.get(currentPlayer - 1).isItFistStart()) {
			
			
			setBoardForStart(messageTextArea);	
			players.get(currentPlayer - 1).setItFistStart(false);
			
		}else {		
			
			int pos_x = players.get(currentPlayer - 1).getPos_x();
			int pos_y =  players.get(currentPlayer - 1).getPos_y();
			
			
			if(board[pos_x][pos_y].getButton().getName() == "RAgain") {
				
				board[pos_x][pos_y].getButton().setText("RAgain");
				
			}else if(board[pos_x][pos_y].getButton().getName() == "WEDGE") {
				board[pos_x][pos_y].getButton().setText("WEDGE");
			}else if(board[pos_x][pos_y].getButton().getName() == "CENTER") {
				board[pos_x][pos_y].getButton().setText("Trivial Purfuit");
			}else
			{
				board[pos_x][pos_y].getButton().setText("");
			}
			
			
			
		}
		
	
		button.setText(players.get(currentPlayer - 1).getName());
		
	
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++ ) {
				
				if(button.getText() == board[i][j].getButton().getText()){
					
					players.get(currentPlayer - 1).setPos_x(i);
					players.get(currentPlayer - 1).setPos_y(j);
					
					
				}
				
				
			}
		}
			
		
		
		
	}
	
	//move player position
	public void setPossipleMovePosition() {
		
		if(!players.get(currentPlayer - 1).getToken().isAllSlotsFilled()) {
		
			int pos_x = players.get(currentPlayer - 1).getPos_x();
			int pos_y = players.get(currentPlayer - 1).getPos_y();
			
			
			int diceValue = dice.getDiceValue();
			
//			//This needs to be implemented. Will get out of bounds
//			board[pos_x + diceValue][pos_y].getButton().setEnabled(true);
//			board[pos_x][pos_y + diceValue].getButton().setEnabled(true);
//		
	
		}else {
			
			
			System.out.println("Someone got all token");
		}
	}
	
	//roll dice
	public void showRollDice(JButton rollDice, JLabel JLabelResult, 
			JTextField textResult) {
		
		rollDice.setEnabled(true);
		rollDice.setVisible(true);
		JLabelResult.setVisible(true);
		textResult.setVisible(true);
		
		
		
	}
	
	//set boad to unable
	public void setBoardToUnable() {
		
			
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++ ) {
				
				board[i][j].getButton().setEnabled(false);

				
			}
		}
				
	}
	

	
	//Player play fist time
	public void setBoardForStart(JTextArea messageTextArea) {
		
		messageTextArea.setText(players.get(currentPlayer - 1).getName() + ", Please select start position!");
		messageTextArea.setVisible(true);
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++ ) {
				
				if(i == 0 || i == 11 || j == 0 || j == 11) {
					
					board[i][j].getButton().setEnabled(true);
				}
				
				
			}
		}
			
			
		
					
	}
	
	//Check winner
	public boolean checkIfAnyOneWin() {
	
	
		return hasWinner;
		
	}
	
	
	//get the players' names
	public void getPlayersName() {

		
		for(int i = 0; i < numberOfPlayers; i++) {
			try {
				JDialog.setDefaultLookAndFeelDecorated(true);
			    Object selection = JOptionPane.showInputDialog(null, "What is the player " + (i + 1) + " name?",
			        "", JOptionPane.QUESTION_MESSAGE, null, null, null);
			    String name = (String)selection;
			    Player player = new Player();
			    player.setName(name);
			    players.add(player);
			   
			   
			    
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
				
		
				
				lblPlayer1.setText(players.get(ONE_PLAYER - 1).getName() + ":");
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
				
				lblPlayer1.setText(players.get(ONE_PLAYER - 1).getName() + ":");
				lblPlayer2.setText(players.get(TWO_PLAYERS - 1).getName() + ":");
				
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
				
				lblPlayer1.setText(players.get(ONE_PLAYER - 1).getName() + ":");
				lblPlayer2.setText(players.get(TWO_PLAYERS - 1).getName() + ":");
				lblPlayer3.setText(players.get(THREE_PLAYERS - 1).getName() + ":");
				
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
				
				
				lblPlayer1.setText(players.get(ONE_PLAYER - 1).getName() + ":");
				lblPlayer2.setText(players.get(TWO_PLAYERS - 1).getName() + ":");
				lblPlayer3.setText(players.get(THREE_PLAYERS - 1).getName() + ":");
				lblPlayer4.setText(players.get(FOUR_PLAYERS - 1).getName() + ":");
				
				
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
	//assign buttons to board[][] type Square
	public void setUpBoard(JButton btnCenter,
			JButton btnWedgeWhite, JButton btnMidColumn1, JButton btnWedgeBlue,
			JButton btnWedgeGreen, JButton btnMidColumn2, JButton btnMidColumn3,
			JButton btnMidColumn4, JButton btnMidColumn5, JButton btnMidColumn6,
			JButton btnMidColumn7, JButton btnMidColumn8, JButton btnWedgeRed,
			JButton btnRight8, JButton btnRight7, JButton btnRight6, JButton btnRight5,
			JButton btnRightRollAgain2, JButton btnRight4, JButton btnRight3,
			JButton btnRight2, JButton btnMidRow5, JButton btnMidRow6, JButton btnMidRow7,
			JButton btnMidRow8, JButton btnRightRollAgain1, JButton btnRight1, JButton btnMidRow4,
			JButton btnMidRow3, JButton btnMidRow2, JButton btnMidRow1, JButton btnLeft1, 
			JButton btnLeft2, JButton btnLeft3, JButton btnLeft4, JButton btnLeft5, JButton btnLeft6,
			JButton btnLeftRollAgain1, JButton btnLeft7, JButton btnLeft8, JButton btnLeftRollAgain2,
			JButton btnBottom1, JButton btnBottom2,JButton btnBottomRollAgain1, JButton btnBottom3,
			JButton btnBottom4, JButton btnBottom5, JButton btnBottomRollAgain2, JButton btnBottom6,
			JButton btnBottom7, JButton btnBottom8, JButton btnTop1, JButton btnTop2, JButton btnTopRollAgain1,
			JButton btnTop3, JButton btnTop4, JButton btnTop5, JButton btnTop6, JButton btnTopRollAgain2,
			JButton btnTop7, JButton btnTop8) {
		
		board[0][0].setButton(btnWedgeWhite);		
		board[0][1].setButton(btnTop1);
		board[0][2].setButton(btnTop2);
		board[0][3].setButton(btnTopRollAgain1);
		board[0][4].setButton(btnTop3);
		board[0][5].setButton(btnTop4);
		board[0][6].setButton(btnTop5);
		board[0][7].setButton(btnTop6);
		board[0][8].setButton(btnTopRollAgain2);
		board[0][9].setButton(btnTop7);
		board[0][10].setButton(btnTop8);
		board[0][11].setButton(btnWedgeRed);
		board[1][0].setButton(btnLeft1);
		board[2][0].setButton(btnLeft2);
		board[3][0].setButton(btnLeft3);
		board[4][0].setButton(btnLeft4);
		board[5][0].setButton(btnLeft5);
		board[6][0].setButton(btnLeft6);
		board[7][0].setButton(btnLeftRollAgain1);
		board[8][0].setButton(btnLeft7);
		board[9][0].setButton(btnLeft8);
		board[10][0].setButton(btnLeftRollAgain2);
		board[11][0].setButton(btnWedgeBlue);
		board[11][1].setButton(btnBottom1);
		board[11][2].setButton(btnBottom2);
		board[11][3].setButton(btnBottomRollAgain1);
		board[11][4].setButton(btnBottom3);
		board[11][5].setButton(btnBottom4);
		board[11][6].setButton(btnBottom5);
		board[11][7].setButton(btnBottomRollAgain2);
		board[11][8].setButton(btnBottom6);
		board[11][9].setButton(btnBottom7);
		board[11][10].setButton(btnBottom8);
		board[11][11].setButton(btnWedgeGreen);
		board[1][11].setButton(btnRight1);
		board[2][11].setButton(btnRightRollAgain1);
		board[3][11].setButton(btnRight2);
		board[4][11].setButton(btnRight3);
		board[5][11].setButton(btnRight4);
		board[6][11].setButton(btnRightRollAgain2);
		board[7][11].setButton(btnRight5);
		board[8][11].setButton(btnRight6);
		board[9][11].setButton(btnRight7);
		board[10][11].setButton(btnRight8);
		board[1][5].setButton(btnMidColumn1);
		board[2][5].setButton(btnMidColumn2);
		board[3][5].setButton(btnMidColumn3);
		board[4][2].setButton(btnMidColumn4);
		board[5][5].setButton(btnCenter);
		board[6][5].setButton(btnMidColumn5);
		board[7][5].setButton(btnMidColumn6);
		board[8][5].setButton(btnMidColumn7);
		board[9][5].setButton(btnMidColumn8);
		board[5][1].setButton(btnMidRow1);
		board[5][2].setButton(btnMidRow2);
		board[5][3].setButton(btnMidRow3);
		board[5][4].setButton(btnMidRow4);
		board[5][6].setButton(btnMidRow5);
		board[5][7].setButton(btnMidRow6);
		board[5][8].setButton(btnMidRow7);
		board[5][9].setButton(btnMidRow8);
		
		
		
		
	}
	//initial 2D array
	private void initialBoard() {
		
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++) {
				board[i][j] = new Square();
			}
		}
		
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
		
	
	final int BOARD_SIZE = 12;
	

	
	private boolean hasWinner;
	private ArrayList<Player> players;
	private int currentPlayer;
	private int numberOfPlayers;
	private Dice dice;
	private Square[][] board;
	

}	

