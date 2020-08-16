public class Player {

	public Player() {
		this.name = "";
		this.token = new Token();
		this.pos_x = -1;
		this.pos_y = -1;
		
	}
	
	
	
	public boolean isAllSlotsInTokenFilled() {
		return (token.getBlueSlot() == true && token.getGreenSlot() == true && 
    			token.getRedSlot() == true && token.getWhiteSlot() == true );
	}
	
	
	
	public void updateToken(String color) {
		if(color == "Blue") {
			token.setBlueSlot(true);
			
		}
		else if(color == "White") {
			token.setWhiteSlot(true);
			
		}
		else if(color == "Red") {
			token.setRedSlot(true);
			
		}
		else if(color == "Green") {
			token.setGreenSlot(true);		
		}
		
	}
	
	public boolean checkIfTokenAdded(String color) {
		return ((color == "White" && token.getWhiteSlot() == true) ||
    			(color == "Blue" && token.getBlueSlot() == true) ||
    			(color == "Green" && token.getGreenSlot() == true) ||
    			(color == "Red" && token.getRedSlot() == true));
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

	
	private String name;
	private Token token;
	
	
	private int pos_x;
	private int pos_y;
	

	
}
