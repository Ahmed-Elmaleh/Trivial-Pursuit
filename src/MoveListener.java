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
			JTextField rollDiceResult, JLabel rollDiceLabel) {
		this.board = board;
		this.button = button;
		this.messageTextArea = messageTextArea;
		this.btnRollDice = btnRollDice;
		this.rollDiceResult = rollDiceResult;
		this.rollDiceLabel = rollDiceLabel;
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		board.showRollDice(btnRollDice, rollDiceLabel, rollDiceResult);
		

		Color color = button.getBackground();
		
		Question question = new Question();
		
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
		
//		if(color.toString().equals("javax.swing.plaf.ColorUIResource[r=238,g=238,b=238]")) {
//			rollgain
//		}
//		
//		if( color.toString().equals("java.awt.Color[r=0,g=255,b=255]")) {
//			center
//		}
		
		System.out.println(color.toString());
		
		String questionText = question.getQuestion();
		String correctAnswer = question.getCorrectAnswer();
		
		
		JDialog.setDefaultLookAndFeelDecorated(true);
	    Object[] selectionValues = { "A. " + question.getAnswers()[0], "B. " + question.getAnswers()[1],
	    		"C. " + question.getAnswers()[2], "D. " + question.getAnswers()[3] };
	    String initialSelection = question.getAnswers()[0];
	    Object selection = JOptionPane.showInputDialog(null, questionText,
	        "", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
	    
	    if(correctAnswer.equals((String)selection)){

		
			board.resetTextForButton();
			
			board.updateNewPositions(button);

			board.updateTextForButton(button);
			
			board.getSquareBoard().setAllButtonsToUnable();
			

		    int currentPlayer = board.getCurrentPlayer();
		    
		    String message = board.getPlayers().getCurrentPlayerName(currentPlayer) + ", Please roll the dice!";
		    
		    board.instructions(messageTextArea, message);
	    	
	    }else {
	    	board.getSquareBoard().setAllButtonsToUnable();
	
		    
		    String message = "Sorry, The correct answer is: " + correctAnswer;
		    
		    board.instructions(messageTextArea, message);
	    }
		
		
	
		

	}
	

	
	
	private Board board;
	private JButton button;
	private JTextArea messageTextArea;
	private JButton btnRollDice;
	private JTextField rollDiceResult;
	private JLabel rollDiceLabel;
	
}
