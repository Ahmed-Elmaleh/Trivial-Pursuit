import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class RollDiceListener implements ActionListener{
	
	public RollDiceListener(Board board, JTextField textDiceResult
			,JButton btnRollDice){
		this.board = board;
		this.textDiceResult = textDiceResult;
		this.btnRollDice = btnRollDice;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		try {
			
			
			Dice dice = new Dice();
			board.setDice(dice);
			
			int diceValue = board.getDice().getDiceValue();
			
			textDiceResult.setText(Integer.toString(diceValue));
			
			btnRollDice.setEnabled(false);
			board.setPossipleMovePosition();
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		
	}
	
	private Board board;
	private JTextField textDiceResult;
	private JButton btnRollDice;
	
	
}
