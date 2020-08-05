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
			JLabel lblPlaying3, JLabel lblPlaying4) {
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
		
				
					board.resetTextForButton();
					
					board.updateNewPositions(button);
		
					board.updateTextForButton(button);
					
					board.getSquareBoard().setAllButtonsToUnable();
					
					currentPlayer = board.getCurrentPlayer();
				   
				    message = "Correct!\n" + board.getPlayers().getCurrentPlayerName(currentPlayer) + ", Please roll the dice!";
				    
				
			    	
			    }else {
			    	
			    	board.switchPlayer();
			    	board.indicateWhoPlaying(lblPlaying1, lblPlaying2, lblPlaying3, lblPlaying4);
			    	board.getSquareBoard().setAllButtonsToUnable();
			    	
			    	currentPlayer = board.getCurrentPlayer();
				    message = "Sorry, The correct answer is: " + correctAnswer + "\n"
				    + "Give other player a turn!\n\n" + board.getPlayers().getCurrentPlayerName(currentPlayer)
				    + ",Please roll the dice!";
				    
				   
			    }
		    }else {
		    	btnRollDice.setEnabled(false);
		    	currentPlayer = board.getCurrentPlayer();
		    	message = board.getPlayers().getCurrentPlayerName(currentPlayer) + ", Please move to a possible position!";
		    }
		    
		}
		
		 board.instructions(messageTextArea, message);

	}
	

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
