import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SetUpPlayersListener implements ActionListener {
	
	
	
	public SetUpPlayersListener(Board board, JLabel lblResult, JButton btnRollDice,
			JTextField textDiceResult, JButton btnSetUpPlayers, 
			JTextField textPlayer1Piece1, JTextField textPlayer1Piece2,
			JTextField textPlayer1Piece3, JTextField textPlayer1Piece4,
			JTextField textPlayer2Piece1, JTextField textPlayer2Piece2, 
			JTextField textPlayer2Piece3, JTextField textPlayer2Piece4,
			JTextField textPlayer3Piece1, JTextField textPlayer3Piece2,
			JTextField textPlayer3Piece3, JTextField textPlayer3Piece4, 
			JTextField textPlayer4Piece1, JTextField textPlayer4Piece2, 
			JTextField textPlayer4Piece3, JTextField textPlayer4Piece4,
			JLabel lblPlayer1, JLabel lblPlayer2, JLabel lblPlayer3,
			JLabel lblPlayer4, JLabel lblPlaying1, JLabel lblPlaying2,
			JLabel lblPlaying3, JLabel lblPlaying4, JButton btnCenter,
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
			JButton btnTop7, JButton btnTop8, JTextArea messageTextArea, JLabel lblPlayer1Name, 
			JLabel lblPlayer2Name, JLabel lblPlayer3Name, JLabel lblPlayer4Name) {
		

		
		this.board = board;
		this.lblResult = lblResult;
		this.btnRollDice = btnRollDice;
		this.textDiceResult = textDiceResult;

		this.btnSetUpPlayers = btnSetUpPlayers;
		this.lblPlayer1 = lblPlayer1;
		this.lblPlayer2 = lblPlayer2;
		this.lblPlayer3 = lblPlayer3;
		this.lblPlayer4 = lblPlayer4;
		this.textPlayer1Piece1 = textPlayer1Piece1;
		this.textPlayer1Piece2 = textPlayer1Piece2;
		this.textPlayer1Piece3 = textPlayer1Piece3;
		this.textPlayer1Piece4 = textPlayer1Piece4;
		this.textPlayer2Piece1 = textPlayer2Piece1;
		this.textPlayer2Piece2 = textPlayer2Piece2;
		this.textPlayer2Piece3 = textPlayer2Piece3;
		this.textPlayer2Piece4 = textPlayer2Piece4;
		this.textPlayer3Piece1 = textPlayer3Piece1;
		this.textPlayer3Piece2 = textPlayer3Piece2;
		this.textPlayer3Piece3 = textPlayer3Piece3;
		this.textPlayer3Piece4 = textPlayer3Piece4;
		this.textPlayer4Piece1 = textPlayer4Piece1;
		this.textPlayer4Piece2 = textPlayer4Piece2;
		this.textPlayer4Piece3 = textPlayer4Piece3;
		this.textPlayer4Piece4 = textPlayer4Piece4;
		this.lblPlaying1 = lblPlaying1;
		this.lblPlaying2 = lblPlaying2;
		this.lblPlaying3 = lblPlaying3;
		this.lblPlaying4 = lblPlaying4;
		
		this.messageTextArea = messageTextArea;
		
		this.btnCenter = btnCenter;
		this.btnWedgeWhite = btnWedgeWhite;
		this.btnMidColumn1 = btnMidColumn1;
		this.btnWedgeBlue = btnWedgeBlue;	
		this.btnWedgeGreen = btnWedgeGreen;
		this.btnMidColumn2 = btnMidColumn2;
		this.btnMidColumn3 = btnMidColumn3;	
		this.btnMidColumn4 = btnMidColumn4;
		this.btnMidColumn5 = btnMidColumn5;
		this.btnMidColumn6 = btnMidColumn6;
		this.btnMidColumn7 = btnMidColumn7;
		this.btnMidColumn8 = btnMidColumn8;
		this.btnWedgeRed = btnWedgeRed;
		this.btnRight8 = btnRight8;
		this.btnRight7 = btnRight7;
		this.btnRight6 = btnRight6;
		this.btnRight5 = btnRight5;
		this.btnRightRollAgain2 = btnRightRollAgain2;
		this.btnRight4 = btnRight4;
		this.btnRight3 = btnRight3;
		this.btnRight2 = btnRight2;
		this.btnMidRow5 = btnMidRow5;
		this.btnMidRow6 = btnMidRow6;
		this.btnMidRow7 = btnMidRow7;
		this.btnMidRow8 = btnMidRow8;
		this.btnRightRollAgain1 = btnRightRollAgain1;
		this.btnRight1 = btnRight1;
		this.btnMidRow4 = btnMidRow4;
		this.btnMidRow3 = btnMidRow3;
		this.btnMidRow2 = btnMidRow2;
		this.btnMidRow1 = btnMidRow1;
		this.btnLeft1 = btnLeft1;
		this.btnLeft2 = btnLeft2;
		this.btnLeft3 = btnLeft3;
		this.btnLeft4 = btnLeft4;
		this.btnLeft5 = btnLeft5;
		this.btnLeft6 = btnLeft6;
		this.btnLeftRollAgain1 = btnLeftRollAgain1;
		this.btnLeft7 = btnLeft7;
		this.btnLeft8 = btnLeft8;
		this.btnLeftRollAgain2 = btnLeftRollAgain2;
		this.btnBottom1 = btnBottom1;
		this.btnBottom2 = btnBottom2;
		this.btnBottomRollAgain1 = btnBottomRollAgain1;
		this.btnBottom3 = btnBottom3;
		this.btnBottom4 = btnBottom4;
		this.btnBottom5 = btnBottom5;
		this.btnBottomRollAgain2 = btnBottomRollAgain2;
		this.btnBottom6 = btnBottom6;
		this.btnBottom7 = btnBottom7;
		this.btnBottom8 = btnBottom8;
		this.btnTop1 = btnTop1;
		this.btnTop2 = btnTop2;
		this.btnTopRollAgain1 = btnTopRollAgain1;
		this.btnTop3 = btnTop3;
		this.btnTop4 = btnTop4;
		this.btnTop5 = btnTop5;
		this.btnTop6 = btnTop6;
		this.btnTopRollAgain2 = btnTopRollAgain2;
		this.btnTop7 = btnTop7;
		this.btnTop8 = btnTop8;
		this.lblPlayer1Name = lblPlayer1Name;
		this.lblPlayer2Name = lblPlayer2Name;
		this.lblPlayer3Name = lblPlayer3Name;
		this.lblPlayer4Name = lblPlayer4Name;
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		  String message;
		
		try {
			JDialog.setDefaultLookAndFeelDecorated(true);
		    Object[] selectionValues = { "1", "2", "3", "4" };
		    String initialSelection = "1";
		    Object selection = JOptionPane.showInputDialog(null, "How many players?",
		        "", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		    board.setNumberOfPlayers(Integer.parseInt((String)selection));
		    
		    getAndStorePlayersName();
		    
		    setUpSqaureBoard();
	  
		    displayPlayers();
		    	    
		    
		    
		    message = board.getPlayers().get(board.getCurrentPlayer() - 1).getName() + ", Please roll the dice!";
		    
		    board.instructions(messageTextArea, message);
		    
		   		    
		    
		}catch(Exception ex) {
			message = "Please enter number of players!";
			board.instructions(messageTextArea, message);
		}
	    
		
		
	}
	
	//assign buttons to board[][] type Square
	private void setUpSqaureBoard() {
		
		board.getSquareBoard().setSquareButton(0, 0,btnWedgeWhite);		
		board.getSquareBoard().setSquareButton(0, 1, btnTop1);
		board.getSquareBoard().setSquareButton(0, 2, btnTop2);
		board.getSquareBoard().setSquareButton(0, 3, btnTopRollAgain1);
		board.getSquareBoard().setSquareButton(0, 4, btnTop3);
		board.getSquareBoard().setSquareButton(0, 5, btnTop4);
		board.getSquareBoard().setSquareButton(0, 6, btnTop5);
		board.getSquareBoard().setSquareButton(0, 7, btnTop6);
		board.getSquareBoard().setSquareButton(0, 8, btnTopRollAgain2);
		board.getSquareBoard().setSquareButton(0, 9, btnTop7);
		board.getSquareBoard().setSquareButton(0, 10, btnTop8);
		board.getSquareBoard().setSquareButton(0, 11, btnWedgeRed);
		board.getSquareBoard().setSquareButton(1, 0, btnLeft1);
		board.getSquareBoard().setSquareButton(2, 0, btnLeft2);
		board.getSquareBoard().setSquareButton(3, 0, btnLeft3);
		board.getSquareBoard().setSquareButton(4, 0, btnLeft4);
		board.getSquareBoard().setSquareButton(5, 0, btnLeft5);
		board.getSquareBoard().setSquareButton(6, 0, btnLeft6);
		board.getSquareBoard().setSquareButton(7, 0, btnLeftRollAgain1);
		board.getSquareBoard().setSquareButton(8, 0, btnLeft7);
		board.getSquareBoard().setSquareButton(9, 0, btnLeft8);
		board.getSquareBoard().setSquareButton(10, 0, btnLeftRollAgain2);
		board.getSquareBoard().setSquareButton(11, 0, btnWedgeBlue);
		board.getSquareBoard().setSquareButton(11, 1, btnBottom1);
		board.getSquareBoard().setSquareButton(11, 2, btnBottom2);
		board.getSquareBoard().setSquareButton(11, 3, btnBottomRollAgain1);
		board.getSquareBoard().setSquareButton(11, 4, btnBottom3);
		board.getSquareBoard().setSquareButton(11, 5, btnBottom4);
		board.getSquareBoard().setSquareButton(11, 6, btnBottom5);
		board.getSquareBoard().setSquareButton(11, 7, btnBottomRollAgain2);
		board.getSquareBoard().setSquareButton(11, 8, btnBottom6);
		board.getSquareBoard().setSquareButton(11, 9, btnBottom7);
		board.getSquareBoard().setSquareButton(11, 10, btnBottom8);
		board.getSquareBoard().setSquareButton(11, 11, btnWedgeGreen);
		board.getSquareBoard().setSquareButton(1, 11, btnRight1);
		board.getSquareBoard().setSquareButton(2, 11, btnRightRollAgain1);
		board.getSquareBoard().setSquareButton(3, 11, btnRight2);
		board.getSquareBoard().setSquareButton(4, 11, btnRight3);
		board.getSquareBoard().setSquareButton(5, 11, btnRight4);
		board.getSquareBoard().setSquareButton(6, 11, btnRightRollAgain2);
		board.getSquareBoard().setSquareButton(7, 11, btnRight5);
		board.getSquareBoard().setSquareButton(8, 11, btnRight6);
		board.getSquareBoard().setSquareButton(9, 11, btnRight7);
		board.getSquareBoard().setSquareButton(10, 11, btnRight8);
		board.getSquareBoard().setSquareButton(1, 5, btnMidColumn1);
		board.getSquareBoard().setSquareButton(2, 5, btnMidColumn2);
		board.getSquareBoard().setSquareButton(3, 5, btnMidColumn3);
		board.getSquareBoard().setSquareButton(4, 5, btnMidColumn4);
		
		board.getSquareBoard().setSquareButton(5, 5, btnCenter);
		board.getSquareBoard().setSquareButton(6, 5, btnCenter);
		board.getSquareBoard().setSquareButton(5, 6, btnCenter);
		
		board.getSquareBoard().setSquareButton(7, 5, btnMidColumn5);
		board.getSquareBoard().setSquareButton(8, 5, btnMidColumn6);
		board.getSquareBoard().setSquareButton(9, 5, btnMidColumn7);
		board.getSquareBoard().setSquareButton(10, 5, btnMidColumn8);
		
		board.getSquareBoard().setSquareButton(5, 1, btnMidRow1);
		board.getSquareBoard().setSquareButton(5, 2, btnMidRow2);
		board.getSquareBoard().setSquareButton(5, 3, btnMidRow3);
		board.getSquareBoard().setSquareButton(5, 4, btnMidRow4);
		board.getSquareBoard().setSquareButton(5, 7, btnMidRow5);
		board.getSquareBoard().setSquareButton(5, 8, btnMidRow6);
		board.getSquareBoard().setSquareButton(5, 9, btnMidRow7);
		board.getSquareBoard().setSquareButton(5, 10, btnMidRow8);
		

	}
	
	//Display players on the board
	private void displayPlayers() {

		int numberOfPlayers = board.getPlayers().size();
	
	    btnSetUpPlayers.setVisible(false);
	    
	    lblResult.setVisible(true);
	    btnRollDice.setVisible(true);
	    btnRollDice.setEnabled(true);
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

				
				lblPlayer1Name.setText(board.getPlayers().get(ONE_PLAYER - 1).getName());
				lblPlayer1Name.setVisible(true);
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
				
				lblPlayer1Name.setText(board.getPlayers().get(ONE_PLAYER - 1).getName());
				lblPlayer2Name.setText(board.getPlayers().get(TWO_PLAYERS - 1).getName());
				
				lblPlayer1Name.setVisible(true);
				lblPlayer2Name.setVisible(true);
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
				
				lblPlayer1Name.setText(board.getPlayers().get(ONE_PLAYER - 1).getName());
				lblPlayer2Name.setText(board.getPlayers().get(TWO_PLAYERS - 1).getName());
				lblPlayer3Name.setText(board.getPlayers().get(THREE_PLAYERS - 1).getName());
				
				lblPlayer1Name.setVisible(true);
				lblPlayer2Name.setVisible(true);
				lblPlayer3Name.setVisible(true);
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
				
				
				lblPlayer1Name.setText(board.getPlayers().get(ONE_PLAYER - 1).getName());
				lblPlayer2Name.setText(board.getPlayers().get(TWO_PLAYERS - 1).getName());
				lblPlayer3Name.setText(board.getPlayers().get(THREE_PLAYERS - 1).getName());
				lblPlayer4Name.setText(board.getPlayers().get(FOUR_PLAYERS - 1).getName());
				
				
				lblPlayer1Name.setVisible(true);
				lblPlayer2Name.setVisible(true);
				lblPlayer3Name.setVisible(true);
				lblPlayer4Name.setVisible(true);
				lblPlayer1.setVisible(true);
				lblPlayer2.setVisible(true);
				lblPlayer3.setVisible(true);
				lblPlayer4.setVisible(true);
				
				break;
			}
		}
		board.randomPickPlayerToPlayerFisrt();
		board.indicateWhoPlaying(lblPlaying1, lblPlaying2, lblPlaying3, lblPlaying4);
		board.setUpDefaultPositionsOfAllPlayers();
		showAllPlayerAtStart();
	}
	
	
	//Display players on hub
	private void showAllPlayerAtStart() {
		
		String text = "";
		
		for(int i = 0; i < board.getPlayers().size(); i++) {
			text += Integer.toString(i + 1) + "";
		}
		
		btnCenter.setText(text);
		
	}
	
	//get the players' names
	private void getAndStorePlayersName() {
		
		int numberOfPlayers = board.getNumberOfPlayers();
		
		for(int i = 0; i < numberOfPlayers; i++) {
			try {
				JDialog.setDefaultLookAndFeelDecorated(true);
			    Object selection = JOptionPane.showInputDialog(null, "What is the player " + (i + 1) + " name?",
			        "", JOptionPane.QUESTION_MESSAGE, null, null, null);
			    String name = (String)selection;
			    Player player = new Player();
			    player.setName(name);
			    board.getPlayers().add(player);;
 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

	
	
	private JTextArea messageTextArea;
	
	private JLabel lblPlayer1Name;
	private JLabel lblPlayer2Name;
	private JLabel lblPlayer3Name;
	private JLabel lblPlayer4Name;
	
	private JLabel lblResult;
	private JButton btnRollDice;
	private JTextField textDiceResult;

	private JButton btnSetUpPlayers;
	
	private JTextField textPlayer1Piece1;
	private JTextField textPlayer1Piece2;
	private JTextField textPlayer1Piece3;
	private JTextField textPlayer1Piece4;
	private JTextField textPlayer2Piece1;
	private JTextField textPlayer2Piece2;
	private JTextField textPlayer2Piece3;
	private JTextField textPlayer2Piece4;
	private JTextField textPlayer3Piece1;
	private JTextField textPlayer3Piece2;
	private JTextField textPlayer3Piece3;
	private JTextField textPlayer3Piece4;
	private JTextField textPlayer4Piece1;
	private JTextField textPlayer4Piece2;
	private JTextField textPlayer4Piece3;
	private JTextField textPlayer4Piece4;
	
	
	private JLabel lblPlayer1;
	private JLabel lblPlayer2;
	private JLabel lblPlayer3;
	private JLabel lblPlayer4;
	
	private JLabel lblPlaying1;
	private JLabel lblPlaying2;
	private JLabel lblPlaying3;
	private JLabel lblPlaying4;
	
	private JButton btnCenter;
	private JButton btnWedgeWhite;
	private JButton btnMidColumn1;
	private JButton btnWedgeBlue;	
	private JButton btnWedgeGreen;	
	private JButton btnMidColumn2;	
	private JButton btnMidColumn3;	
	private JButton btnMidColumn4;
	private JButton btnMidColumn5;
	private JButton btnMidColumn6;
	private JButton btnMidColumn7;
	private JButton btnMidColumn8;
	private JButton btnWedgeRed;
	private JButton btnRight8;
	private JButton btnRight7;
	private JButton btnRight6;
	private JButton btnRight5;
	private JButton btnRightRollAgain2;
	private JButton btnRight4;
	private JButton btnRight3;
	private JButton btnRight2;
	private JButton btnMidRow5;
	private JButton btnMidRow6;
	private JButton btnMidRow7;
	private JButton btnMidRow8;
	private JButton btnRightRollAgain1;
	private JButton btnRight1;
	private JButton btnMidRow4;
	private JButton btnMidRow3;
	private JButton btnMidRow2;
	private JButton btnMidRow1;
	private JButton btnLeft1;
	private JButton btnLeft2;
	private JButton btnLeft3;
	private JButton btnLeft4;
	private JButton btnLeft5;
	private JButton btnLeft6;
	private JButton btnLeftRollAgain1;
	private JButton btnLeft7;
	private JButton btnLeft8;
	private JButton btnLeftRollAgain2;
	private JButton btnBottom1;
	private JButton btnBottom2;
	private JButton btnBottomRollAgain1;
	private JButton btnBottom3;
	private JButton btnBottom4;
	private JButton btnBottom5;
	private JButton btnBottomRollAgain2;
	private JButton btnBottom6;
	private JButton btnBottom7;
	private JButton btnBottom8;
	private JButton btnTop1;
	private JButton btnTop2;
	private JButton btnTopRollAgain1;
	private JButton btnTop3;
	private JButton btnTop4;
	private JButton btnTop5;
	private JButton btnTop6;
	private JButton btnTopRollAgain2;
	private JButton btnTop7;
	private JButton btnTop8;
	
	
	private Board board;
	
}
