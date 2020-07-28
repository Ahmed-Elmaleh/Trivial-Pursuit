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
			JButton btnTop7, JButton btnTop8, JTextArea messageTextArea) {
		

		
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
		
	
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			JDialog.setDefaultLookAndFeelDecorated(true);
		    Object[] selectionValues = { "1", "2", "3", "4" };
		    String initialSelection = "1";
		    Object selection = JOptionPane.showInputDialog(null, "How many players?",
		        "", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		    board.setNumberOfPlayers(Integer.parseInt((String)selection));
		    
		    board.getPlayersName();
		    
		    board.setUpBoard(btnCenter,
					btnWedgeWhite, btnMidColumn1, btnWedgeBlue,
					btnWedgeGreen, btnMidColumn2, btnMidColumn3,
					btnMidColumn4, btnMidColumn5, btnMidColumn6,
					btnMidColumn7, btnMidColumn8, btnWedgeRed,
					btnRight8, btnRight7, btnRight6, btnRight5,
					btnRightRollAgain2, btnRight4, btnRight3,
					btnRight2, btnMidRow5, btnMidRow6, btnMidRow7,
					btnMidRow8, btnRightRollAgain1, btnRight1, btnMidRow4,
					btnMidRow3, btnMidRow2, btnMidRow1, btnLeft1, 
					btnLeft2, btnLeft3,btnLeft4, btnLeft5, btnLeft6,
					btnLeftRollAgain1,  btnLeft7, btnLeft8,  btnLeftRollAgain2,
					btnBottom1, btnBottom2, btnBottomRollAgain1, btnBottom3,
					btnBottom4, btnBottom5,btnBottomRollAgain2, btnBottom6,
					btnBottom7, btnBottom8, btnTop1, btnTop2, btnTopRollAgain1,
					btnTop3,  btnTop4, btnTop5, btnTop6, btnTopRollAgain2,
					btnTop7, btnTop8);
		    
		    board.displayPlayers(lblResult, btnRollDice, textDiceResult,
		    		btnSetUpPlayers, textPlayer1Piece1,
					textPlayer1Piece2, textPlayer1Piece3, 
					textPlayer1Piece4, textPlayer2Piece1, 
					textPlayer2Piece2, textPlayer2Piece3,
					textPlayer2Piece4, textPlayer3Piece1, 
					textPlayer3Piece2, textPlayer3Piece3,
					textPlayer3Piece4, textPlayer4Piece1,
					textPlayer4Piece2, textPlayer4Piece3,
					textPlayer4Piece4, lblPlayer1, lblPlayer2,
					lblPlayer3, lblPlayer4, lblPlaying1,
					lblPlaying2, lblPlaying3, lblPlaying4);
		    
		    board.setBoardForStart(messageTextArea);
		    
		   		    
		    
		}catch(Exception ex) {
			System.out.println("Please enter number of players!");
			//ex.printStackTrace();
		}
	    
		
		
	}
	
	private JTextArea messageTextArea;
	
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
