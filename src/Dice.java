
public class Dice {
	
	
	public Dice() {
		this.diceValue = -1;
	}
	
	public int getDiceValue() {
		return diceValue;
	}


	public void setDiceValue(int diceValue) {
		this.diceValue = diceValue;
	}
	
	public void rollDice() {
		diceValue = randomNumber();
	}


	private int randomNumber() {
		int max = 6; 
        int min = 1; 
        int range = max - min + 1; 
  
       
        int rand = (int)(Math.random() * range) + min; 
  
     
        return rand;
	}
	
	private int diceValue;
	
	
}
