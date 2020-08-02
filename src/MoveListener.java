import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
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
		
		board.updateNewPositions(button);
		
		board.getSquareBoard().setAllButtonsToUnable();
		
		

		//board.movePlayerPosition(button, messageTextArea);
		
	
		
		//board.getSquareBoard().setAllButtonsToUnable();
	
		

	    int currentPlayer = board.getCurrentPlayer();
	    
	    String message = board.getPlayers().getCurrentPlayerName(currentPlayer) + ", Please roll the dice!";
	    
	    board.instructions(messageTextArea, message);
		
	}
	

	
	
	private Board board;
	private JButton button;
	private JTextArea messageTextArea;
	private JButton btnRollDice;
	private JTextField rollDiceResult;
	private JLabel rollDiceLabel;
	
}
