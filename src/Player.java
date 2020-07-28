import java.util.Random;

import javax.swing.JButton;

public class Player {

	public Player() {
		this.isItFistStart = true;
		this.active = false;
		this.name = "";
		this.token = new Token();
		this.pos_x = -1;
		this.pos_y = -1;
	}
	
	public boolean isItFistStart() {
		return isItFistStart;
	}

	public void setItFistStart(boolean isItFistStart) {
		this.isItFistStart = isItFistStart;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Token getToken() {
		return token;
	}
	public void setToken(Token token) {
		this.token = token;
	}
	public Square getSquare() {
		return square;
	}
	public void setSquare(Square square) {
		this.square = square;
	}
	
	public int getPos_x() {
		return pos_x;
	}
	public void setPos_x(int pos_x) {
		this.pos_x = pos_x;
	}
	public int getPos_y() {
		return pos_y;
	}
	public void setPos_y(int pos_y) {
		this.pos_y = pos_y;
	}
	

	
	
	final int BOARD_SIZE = 12;
	
	private boolean active;
	private boolean isItFistStart;



	private String name;
	private Token token;
	private Square square;
	
	
	private int pos_x;
	private int pos_y;
	


	
		
	
	
}
