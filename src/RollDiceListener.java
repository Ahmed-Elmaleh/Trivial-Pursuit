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
			
			board.excuteDice(textDiceResult);;
			btnRollDice.setEnabled(false);
			
			board.setPossibleMovePositions();
			
			int currentPlayer = board.getCurrentPlayer();
			
			String message = board.getPlayersManagement().getCurrentPlayerName(currentPlayer) 
					+ ", Please move to a possible position!";
			
			board.instructions(messageTextArea, message);
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
	
	private Board board;
	private JTextField textDiceResult;
	private JButton btnRollDice;
	private JTextArea messageTextArea;
	
	
}
