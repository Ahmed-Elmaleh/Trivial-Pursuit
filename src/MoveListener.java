import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MoveListener implements ActionListener {
	
	public MoveListener(Board board, JButton button,
			JTextArea messageTextArea, JButton btnRollDice,
			JTextField rollDiceResult, JLabel rollDiceLabel, 
			JLabel lblPlaying1, JLabel lblPlaying2,
			JLabel lblPlaying3, JLabel lblPlaying4, 
			JTextField textPlayer1Piece1, JTextField textPlayer1Piece2, 
			JTextField textPlayer1Piece3, JTextField textPlayer1Piece4, 
			JTextField textPlayer2Piece1, JTextField textPlayer2Piece2, 
			JTextField textPlayer2Piece3, JTextField textPlayer2Piece4, 
			JTextField textPlayer3Piece1, JTextField textPlayer3Piece2, 
			JTextField textPlayer3Piece3, JTextField textPlayer3Piece4, 
			JTextField textPlayer4Piece1, JTextField textPlayer4Piece2, 
			JTextField textPlayer4Piece3, JTextField textPlayer4Piece4) {
		this.board = board;
		this.button = button;
		this.messageTextArea = messageTextArea;
		this.btnRollDice = btnRollDice;
		this.rollDiceResult = rollDiceResult;
		this.rollDiceLabel = rollDiceLabel;
		this.lblPlaying1 = lblPlaying1;
		this.lblPlaying2 = lblPlaying2;
		this.lblPlaying3 = lblPlaying3;
		this.lblPlaying4 = lblPlaying4;
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
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		board.showRollDice(btnRollDice, rollDiceLabel, rollDiceResult);
		
		String message = "";
		Color color = button.getBackground();
		int currentPlayer;
		Question question = new Question();
		
		if(color.toString().equals("javax.swing.plaf.ColorUIResource[r=238,g=238,b=238]")) {
			

			board.resetTextForButton();
			
			board.updateNewPositions(button);

			board.updateTextForButton(button);
			
			board.getSquareBoard().setAllButtonsToUnable();
			
			message = "Please roll the dice again!";
			
			
		}else {
		
			if( color.toString().equals("java.awt.Color[r=255,g=255,b=255]")) {
			
				question = board.getQuestionForColor("White");
					
			}
			
			if( color.toString().equals("java.awt.Color[r=0,g=0,b=255]")) {
			
				question = board.getQuestionForColor("Blue");
					
			}
			
			if( color.toString().equals("java.awt.Color[r=0,g=255,b=0]")) {
				
				question = board.getQuestionForColor("Green");
		
			}
			
			if( color.toString().equals("java.awt.Color[r=255,g=0,b=0]")) {
				
				question = board.getQuestionForColor("Red");		
			}
			
			
			if( color.toString().equals("java.awt.Color[r=0,g=255,b=255]")) {
				
				question = board.getRandomQuestion();
			}
			
			//System.out.println(color.toString());
			
			String questionText = question.getQuestion();
			String correctAnswer = question.getCorrectAnswer();
			
			
			JDialog.setDefaultLookAndFeelDecorated(true);
		    Object[] selectionValues = { "A. " + question.getAnswers()[0], "B. " + question.getAnswers()[1],
		    		"C. " + question.getAnswers()[2], "D. " + question.getAnswers()[3] };
		    String initialSelection = question.getAnswers()[0];
		    Object selection = JOptionPane.showInputDialog(null, questionText,
		        "", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
		    
		    String answer = (String)selection;
		    
		    if(answer != null) {
		    
			    answer = answer.substring(3);
			    
			    if(correctAnswer.equals(answer)){
		
			    	currentPlayer = board.getCurrentPlayer();
			    	
					board.resetTextForButton();
					
					board.updateNewPositions(button);
		
					board.updateTextForButton(button);
					
					board.getSquareBoard().setAllButtonsToUnable();
					
					if(button.getName() == "wedgeWhite") {
						
						if(!board.getPlayersManagement().getPlayers().get(currentPlayer -1).checkIfTokenAdded("White")) {
							board.updateToken(currentPlayer, "White");
							updateDisplayToken(currentPlayer, "White");
							
						}
						
					}
					if(button.getName() == "wedgeRed") {
						if(!board.getPlayersManagement().getPlayers().get(currentPlayer -1).checkIfTokenAdded("Red")) {
							board.updateToken(currentPlayer, "Red");
							updateDisplayToken(currentPlayer, "Red");
						}
						
					}
					if (button.getName() == "wedgeBlue") {
						if(!board.getPlayersManagement().getPlayers().get(currentPlayer -1).checkIfTokenAdded("Blue")) {
							board.updateToken(currentPlayer, "Blue");
							updateDisplayToken(currentPlayer, "Blue");
						}
						
					}
					if(button.getName() == "wedgeGreen") {
						if(!board.getPlayersManagement().getPlayers().get(currentPlayer - 1).checkIfTokenAdded("Green")) {
							board.updateToken(currentPlayer, "Green");
							updateDisplayToken(currentPlayer, "Green");
						}
						
					}	
					
					if(button.getName() == "CENTER") {
						if(board.getPlayersManagement().getPlayers().get(currentPlayer -1).isAllSlotsInTokenFilled()) {
							board.setHasWinner(true);
						}
							
					}
				   
				    message = "Correct!\n" + board.getPlayersManagement().getCurrentPlayerName(currentPlayer) + ", Please roll the dice!";
				    
				
			    	
			    }else {
			    	
			    	board.switchPlayer();
			    	board.indicateWhoPlaying(lblPlaying1, lblPlaying2, lblPlaying3, lblPlaying4);
			    	board.getSquareBoard().setAllButtonsToUnable();
			    	
			    	currentPlayer = board.getCurrentPlayer();
				    message = "Sorry, The correct answer is: " + correctAnswer + "\n"
				    + "Give other player a turn!\n\n" + board.getPlayersManagement().getCurrentPlayerName(currentPlayer)
				    + ",Please roll the dice!";
				    
				   
			    }
		    }else {
		    	btnRollDice.setEnabled(false);
		    	currentPlayer = board.getCurrentPlayer();
		    	message = board.getPlayersManagement().getCurrentPlayerName(currentPlayer) + ", Please move to a possible position!";
		    }
		    
		}
		
		 board.instructions(messageTextArea, message);

	}
	
	//helper indicate player got token
	private void updateDisplayToken(int currentPlayer, String color) {
		switch(currentPlayer) {
			case 1:
			{
				if(color == "Blue") {
					textPlayer1Piece1.setBackground(Color.BLUE);
				}else if(color == "Red") {
					textPlayer1Piece2.setBackground(Color.RED);
				}else if(color == "White") {
					textPlayer1Piece3.setBackground(Color.WHITE);
				}else if(color == "Green"){
					textPlayer1Piece4.setBackground(Color.GREEN);
				}
				break;
			}
			case 2:
			{
				if(color == "Blue") {
					textPlayer2Piece1.setBackground(Color.BLUE);
				}else if(color == "Red") {
					textPlayer2Piece2.setBackground(Color.RED);
				}else if(color == "White") {
					textPlayer2Piece3.setBackground(Color.WHITE);
				}else if(color == "Green"){
					textPlayer2Piece4.setBackground(Color.GREEN);
				}
				break;
			}
			case 3:
			{
				if(color == "Blue") {
					textPlayer3Piece1.setBackground(Color.BLUE);
				}else if(color == "Red") {
					textPlayer3Piece2.setBackground(Color.RED);
				}else if(color == "White") {
					textPlayer3Piece3.setBackground(Color.WHITE);
				}else if(color == "Green"){
					textPlayer3Piece4.setBackground(Color.GREEN);
				}
				break;
			}
			case 4:
			{
				if(color == "Blue") {
					textPlayer4Piece1.setBackground(Color.BLUE);
				}else if(color == "Red") {
					textPlayer4Piece2.setBackground(Color.RED);
				}else if(color == "White") {
					textPlayer4Piece3.setBackground(Color.WHITE);
				}else if(color == "Green"){
					textPlayer4Piece4.setBackground(Color.GREEN);
				}
				break;
			}
		}
		
	}
	
	private JTextField textPlayer1Piece1;
	private JTextField textPlayer1Piece2;
	private JTextField textPlayer1Piece4;
	private JTextField textPlayer1Piece3;
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
	

	private JLabel lblPlaying1;
	private JLabel lblPlaying2;
	private JLabel lblPlaying3;
	private JLabel lblPlaying4;
	
	private Board board;
	private JButton button;
	private JTextArea messageTextArea;
	private JButton btnRollDice;
	private JTextField rollDiceResult;
	private JLabel rollDiceLabel;
	
}
