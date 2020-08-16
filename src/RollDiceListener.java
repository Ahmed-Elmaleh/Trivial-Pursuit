import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RollDiceListener implements ActionListener{
	
	public RollDiceListener(Board board, JTextField textDiceResult
			,JButton btnRollDice, JTextArea messageTextArea){
		this.board = board;
		this.textDiceResult = textDiceResult;
		this.btnRollDice = btnRollDice;
		this.messageTextArea = messageTextArea;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			excuteDice();
			btnRollDice.setEnabled(false);
			
			board.setPossibleMovePositions();
			
			String message = board.getPlayers().get(board.getCurrentPlayer() - 1).getName() 
					+ ", Please move to a possible position!";
			
			board.instructions(messageTextArea, message);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
	
	//roll dice, set up dice, and show result on board
	private void excuteDice() {
		board.getDice().rollDice();
		int diceValue = board.getDice().getDiceValue();
		textDiceResult.setText(Integer.toString(diceValue));
	}

	
	
	
	private Board board;
	private JTextField textDiceResult;
	private JButton btnRollDice;
	private JTextArea messageTextArea;
	
	
}
