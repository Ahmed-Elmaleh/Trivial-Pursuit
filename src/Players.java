import java.util.ArrayList;

import javax.swing.JButton;

public class Players {

	public Players() {
		players = new ArrayList<Player>();

	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public boolean isAllSlotsInTokenFilled(int currentPlayer) {
		
		return (players.get(currentPlayer - 1).isAllSlotsInTokenFilled());
	}
	//get number of paleyr
	public String getNumPlayer(int currentPlayer) {
		return Integer.toString(currentPlayer);
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
	
	//set default position for players
	public void setDefaultPositionForPlayers(int pos_x, int pos_y) {
		for(int i = 0; i < players.size(); i++) {
			players.get(i).setPos_x(pos_x);
			players.get(i).setPos_y(pos_y);
		}
	}
	
	//Display players on hub
	public void displayPlayersOnHub(JButton btnCenter) {
		
		String text = "";
		
		for(int i = 0; i < players.size(); i++) {
			text += Integer.toString(i + 1) + "";
		}
		
		btnCenter.setText(text);
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
