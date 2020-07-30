import java.util.ArrayList;

import javax.swing.JButton;

public class Players {

	public Players() {
		players = new ArrayList<Player>();

	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public boolean isThisPlayerReadyToGoToCenter(int currentPlayer) {
		
		return (players.get(currentPlayer - 1).isAllSlotsInTokenFilled());
	}
	
	//get current position x
	public int getCurrentPositionX(int currentPlayer) {
		return (players.get(currentPlayer - 1).getPos_x());
	}
	
	//get current position x
	public int getCurrentPositionY(int currentPlayer) {
		return (players.get(currentPlayer - 1).getPos_y());
	}
	
	//get current position x
	public void setNewPositionX(int currentPlayer, int newPos_x) {
		players.get(currentPlayer - 1).setPos_x(newPos_x);
	}
	
	//get current position x
	public void setNewPositionY(int currentPlayer, int newPos_y) {
		players.get(currentPlayer - 1).setPos_y(newPos_y);
	}
	
	//get current player name
	public String getCurrentPlayerName(int currentPlayer) {
		return (players.get(currentPlayer - 1).getName());
	}
	
	
	//set Player new position
	public void storePlayerNewPostion(SquareBoard squareBoard, JButton button, int currentPlayer){
		
		for(int i = 0; i < squareBoard.BOARD_SIZE; i++) {
			for(int j = 0; j < squareBoard.BOARD_SIZE; j++ ) {
				
				if(button.getText() == squareBoard.getButtonName(i, j)){
					
					setNewPositionX(currentPlayer - 1, i);
					setNewPositionY(currentPlayer - 1, j);
					
					
				}
				
				
			}
		}
			
	}
		
	
	
	
	
	public ArrayList<Player> getPlayers() {
		return players;
	}


	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}


	private ArrayList<Player> players;
}
