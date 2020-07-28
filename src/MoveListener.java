import java.awt.TextField;
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
		this.currentPlayer = board.getCurrentPlayer();
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		board.showRollDice(btnRollDice, rollDiceLabel, rollDiceResult);
		board.movePlayerPosition(button, messageTextArea);	
		board.setBoardToUnable();
		messageTextArea.setVisible(false);
		
	}
	

	
	private int currentPlayer;
	private Board board;
	private JButton button;
	private JTextArea messageTextArea;
	private JButton btnRollDice;
	private JTextField rollDiceResult;
	private JLabel rollDiceLabel;
	
}
