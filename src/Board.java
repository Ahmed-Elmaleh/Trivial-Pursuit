import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Board{
	private boolean hasAWinner;
	//private PlayersManagement playersManagement;
	private int currentPlayer;
	private ArrayList<Player> players;
	private int numberOfPlayers;
	private Dice dice;
	private SquareBoard squareBoard;

	private QuestionBank placesQuestionBank;
	private QuestionBank peopleQuestionBank;
	private QuestionBank eventsQuestionBank;
	private QuestionBank independenceDayQuestionBank;

	public Board() {
		this.hasAWinner = false;
		this.players = new ArrayList<Player>() ;
		this.currentPlayer = 0;
		this.dice = new Dice();
		this.squareBoard = new SquareBoard();
		
		
		this.placesQuestionBank = new QuestionBank("src/Question_Set/places.csv");
		this.peopleQuestionBank = new QuestionBank("src/Question_Set/places.csv");
		this.eventsQuestionBank = new QuestionBank("src/Question_Set/events.csv");
		this.independenceDayQuestionBank = new QuestionBank("src/Question_Set/places.csv");

	}
	

	public ArrayList<Player> getPlayers() {
		return players;
	}


	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}


	public int getCurrentPlayer() {
		return currentPlayer;
	}

	public void setCurrentPlayer(int currentPlayer) {
		this.currentPlayer = currentPlayer;
	}
	
	
	public Dice getDice() {
		return dice;
	}

	public void setDice(Dice dice) {
		this.dice = dice;
	}
	
	
	public SquareBoard getSquareBoard() {
		return squareBoard;
	}

	public void setSquareBoard(SquareBoard squareBoard) {
		this.squareBoard = squareBoard;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	
	public boolean isThereAWinner() {
		return hasAWinner;
	}

	public void setHasWinner(boolean hasAWinner) {
		this.hasAWinner = hasAWinner;
	}
	
	
	//update token
	public void updateToken(int currentPlayer, String color) {
		
		players.get(currentPlayer - 1).updateToken(color);
		
	}
	

	private QuestionBank getQuestionBank(String color) {
		if (color.equals("Blue"))
			return placesQuestionBank;
		else if(color.equals("Green"))
			return independenceDayQuestionBank;
		else if(color.equals("Red"))
			return peopleQuestionBank;
		else
			return eventsQuestionBank;
	}
	
	
	//get question
	
	public Question getQuestionForColor(String color) {
		
		return getQuestionBank(color).getQuestion();
		
	}
	
	//get random question
	public Question getRandomQuestion() {
		int randomPick = randomNumber(4);
		Question question = new Question();
		switch(randomPick) {
			case 1:
			{
				question = getQuestionForColor("Blue");
				break;
			}
			case 2:
			{
				question = getQuestionForColor("White");
				break;
			}
			case 3:
			{
				question = getQuestionForColor("Green");
				break;
			}
			case 4:
			{
				question = getQuestionForColor("Red");
				break;
			}
		}
		
		return question;
	}
	
	//switch player
	
	public void switchPlayer() {
		
		if(currentPlayer == numberOfPlayers) {
			currentPlayer = 1;
		}else {
			currentPlayer += 1;
		}
		
	}
	
	
	
	
	//move player position
	public void setPossibleMovePositions() {
		
		
		int pos_x = players.get(currentPlayer - 1).getPos_x();
		int pos_y = players.get(currentPlayer - 1).getPos_y();
		int diceValue = dice.getDiceValue();
		
		
		if(pos_x == 0) {
			
			setAllPossiblePositionsPos_xEqualZero(pos_x, pos_y, diceValue);
		}
		else if(pos_y == 0) {
			
			setAllPossiblePositionsPos_yEqualZero(pos_x, pos_y,diceValue);
		}
		else if(pos_x == 11) {
			
			setAllPossiblePositionsPos_xEqualEleven(pos_x, pos_y, diceValue);
			
		}else if(pos_y == 11) {
			
			setAllPossiblePositionsPos_yEqualEleven(pos_x, pos_y, diceValue);
			
		}else if (pos_x == 5) {
			setAllPossiblePositionsPos_xEqualFive(pos_x,pos_y, diceValue);
		}else if (pos_x != 5 && pos_y == 5) {
			 setAllPossiblePositionsPos_yEqualFive(pos_x, pos_y, diceValue);
		}
		
		
		
	}
	
	//set possible positions pos_y = 5
	private void setAllPossiblePositionsPos_yEqualFive(int pos_x, int pos_y, int diceValue) {
		int possible_Pos_x;
		int possible_Pos_y;
		
		if(pos_x + diceValue <= 9 || (pos_x >= 7 && pos_x + diceValue <= 10 )) {
			possible_Pos_x = pos_x + diceValue;
			if(pos_x <= 5 && possible_Pos_x >= 6) {
				possible_Pos_x += 1;
			}
			possible_Pos_y = pos_y;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			
		}else {
			possible_Pos_y = 5 + ((pos_x + diceValue) - 10);
			possible_Pos_x = 11;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			
			possible_Pos_y = 5 - (((pos_x + diceValue) - 10) - 1);
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			
		}
		
		if((pos_x - diceValue) >= 1) {
			if(pos_x == 7 && diceValue == 6) {
				possible_Pos_y = 5 - (diceValue - pos_x);
				possible_Pos_x = 0;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_y = 5 + ((diceValue - pos_x) + 1);
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
			
				possible_Pos_x = pos_x - diceValue;
				if(pos_x > 6 && possible_Pos_x <= 6) {
					possible_Pos_x -= 1;
				}
				possible_Pos_y = pos_y;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
		}else {
			possible_Pos_y = 5 - (diceValue - pos_x);
			possible_Pos_x = 0;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			
			possible_Pos_y = 5 + ((diceValue - pos_x) + 1);
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}

		if(pos_x < 5 && (pos_x + diceValue) >= 6){
			possible_Pos_y =  5 - ((pos_x + diceValue) - 5);
			
			if(possible_Pos_y == 0) {
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				possible_Pos_x = 6;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
				
			possible_Pos_y = 6 + ((pos_x + diceValue) - 5);
			
			if(possible_Pos_y == 11) {
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				possible_Pos_x = 6;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
				
			
			
		}
		
		if(pos_x > 6 && (pos_x - diceValue) < 6) {
			
			possible_Pos_y = (pos_x - diceValue) - 1;
			if(possible_Pos_y == 0) {
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				possible_Pos_x = 6;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
			possible_Pos_y = (11 - (pos_x - diceValue)) + 1;
			
			if(possible_Pos_y == 11) {
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				possible_Pos_x = 6;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
			
		}
	}
	
	//set up default position of all players
	
	public void setUpDefaultPositionsOfAllPlayers() {
		final int CENTER_POS_X = 5;
		final int CENTER_POS_Y = 5;

		
		for(int i = 0; i < players.size(); i++) {
			players.get(i).setPos_x(CENTER_POS_X);
			players.get(i).setPos_y(CENTER_POS_Y);
		}
			
	}
	
	
	//set possible positions pos_x = 5
	private void setAllPossiblePositionsPos_xEqualFive(int pos_x, int pos_y, int diceValue) {
		int possible_Pos_x;
		int possible_Pos_y;
		
		if(pos_y + diceValue <= 9 || (pos_y >= 7 && pos_y + diceValue <= 10 )) {
			possible_Pos_y = pos_y + diceValue;
			if(pos_y <= 5 && possible_Pos_y >= 6) {
				possible_Pos_y += 1;
			}
			possible_Pos_x = pos_x;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			
		}else {
			
			if(pos_y == 5) {
				possible_Pos_x = 5 + ( 10 - (pos_y + diceValue));
				possible_Pos_y = 11;
				
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_x = 5 - ((10 - (pos_y + diceValue)) - 1);
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
						
				
			}else {
			
				possible_Pos_x = 5 + ((pos_y + diceValue) - 10);
				possible_Pos_y = 11;
				
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_x = 5 - (((pos_y + diceValue) - 10) - 1);
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
			
			
		}
		
		
		
		if((pos_y - diceValue) >= 1) {
			
			if(pos_y == 7 && diceValue == 6) {
				possible_Pos_x = 5 - (diceValue - pos_y);
				possible_Pos_y = 0;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_x = 5 + ((diceValue - pos_y) + 1);
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
			
				possible_Pos_y = pos_y - diceValue;
				if(pos_y > 6 && possible_Pos_y <= 6) {
					possible_Pos_y -= 1;
				}
				possible_Pos_x = pos_x;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
		}else {
			
			possible_Pos_x = 5 - (diceValue - pos_y);
			possible_Pos_y = 0;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			
			possible_Pos_x = 5 + ((diceValue - pos_y) + 1);
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		
		if(pos_y == 5) {
			if(pos_x + diceValue <= 9 || (pos_x >= 7 && pos_x + diceValue <= 10 )) {
				possible_Pos_x = pos_x + diceValue;
				if(pos_x <= 5 && possible_Pos_x >= 6) {
					possible_Pos_x += 1;
				}
				possible_Pos_y = pos_y;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
			}else {
				if(pos_x == 5) {
					possible_Pos_y = 5 + ( 10 - (pos_x + diceValue));
					possible_Pos_x = 11;
					
					squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
					
					possible_Pos_y = 5 - ((10 - (pos_y + diceValue)) - 1);
					squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
							
					
				}else {
				
					possible_Pos_y = 5 + ((pos_x + diceValue) - 10);
					possible_Pos_x = 11;
					
					squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
					
					possible_Pos_y = 5 - (((pos_x + diceValue) - 10) - 1);
					squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				}
				
			}
			
			if((pos_x - diceValue) >= 1) {
				possible_Pos_x = pos_x - diceValue;
				if(pos_x > 6 && possible_Pos_x <= 6) {
					possible_Pos_x -= 1;
				}
				possible_Pos_y = pos_y;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_y = 5 - (diceValue - pos_x);
				possible_Pos_x = 0;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_y = 5 + ((diceValue - pos_x) + 1);
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
			
		}

		
		
		if(pos_y < 5 && (pos_y + diceValue) >= 6){
			possible_Pos_x =  5 - ((pos_y + diceValue) - 5);
			
			if(possible_Pos_x == 0) {
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				possible_Pos_y = 6;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
				
			possible_Pos_x = 6 + ((pos_y + diceValue) - 5);
			
			if(possible_Pos_x == 11) {
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				possible_Pos_y = 6;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
				
			
			
		}
		
		if(pos_y > 6 && (pos_y - diceValue) < 6) {
			
			possible_Pos_x = (pos_y - diceValue) - 1;
			if(possible_Pos_x == 0) {
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				possible_Pos_y = 6;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
			possible_Pos_x = (11 - (pos_y - diceValue)) + 1;
			
			if(possible_Pos_x == 11) {
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				possible_Pos_y = 6;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
			
		}
	
		
	}
	
	//set possible positions pos_y = 11
	private void setAllPossiblePositionsPos_yEqualEleven(int pos_x, int pos_y, int diceValue) {
		int possible_Pos_x;
		int possible_Pos_y;
		
	
		if((pos_x + diceValue) <= 11) {
			possible_Pos_y = pos_y;
			possible_Pos_x = pos_x + diceValue;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);

		}else {
			possible_Pos_y = 11 - (diceValue + pos_x - 11);
			possible_Pos_x = 11;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		
		
		if((pos_x - diceValue) >= 0) {
			possible_Pos_y = pos_y;
			possible_Pos_x = pos_x - diceValue;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}else {
			possible_Pos_y = 11 - (diceValue - pos_x);
			possible_Pos_x = 0;	
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		
		if(pos_x == 5 || pos_x == 6) {
			possible_Pos_y = 11 - diceValue;
			if(possible_Pos_y == 5) {
				possible_Pos_y -= 1;
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_x = 4;
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_x = 7;
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
		}
		
		if((pos_x < 5 ) && (pos_x + diceValue) > 5) {
			possible_Pos_y = 11 - ((pos_x + diceValue) - 5);
			if(possible_Pos_y == 5) {
				possible_Pos_y -= 1;
			}
			possible_Pos_x = 5;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			
		}
		
		if((pos_x > 6) && (pos_x - diceValue) <= 5) {
			possible_Pos_y = 11 - (diceValue - ((pos_x - 1) - 5));
			if(possible_Pos_y == 5) {
				possible_Pos_y -= 1;
			}
			possible_Pos_x = 5;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		
	}
	
	
	//set possible positions pos_x = 11
	private void setAllPossiblePositionsPos_xEqualEleven(int pos_x, int pos_y, int diceValue) {
		int possible_Pos_x;
		int possible_Pos_y;
		
	
		if((pos_y + diceValue) <= 11) {
			possible_Pos_x = pos_x;
			possible_Pos_y = pos_y + diceValue;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);

		}else {
			possible_Pos_x = 11 - (diceValue + pos_y - 11);
			possible_Pos_y = 11;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		
		
		if((pos_y - diceValue) >= 0) {
			possible_Pos_x = pos_x;
			possible_Pos_y = pos_y - diceValue;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}else {
			possible_Pos_x = 11 - (diceValue - pos_y);
			possible_Pos_y = 0;	
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		
		if(pos_y == 5 || pos_y == 6) {
			possible_Pos_x = 11 - diceValue;
			if(possible_Pos_x == 5) {
				possible_Pos_x -= 1;
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_y = 4;
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_y = 7;
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
			}else {
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
		}
		
		if((pos_y < 5 ) && (pos_y + diceValue) > 5) {
			possible_Pos_x = 11 - ((pos_y + diceValue) - 5);
			if(possible_Pos_x == 5) {
				possible_Pos_x -= 1;
			}
			possible_Pos_y = 5;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			
		}
		
		if((pos_y > 6) && (pos_y - diceValue) <= 5) {
			possible_Pos_x = 11 - (diceValue - ((pos_y - 1) - 5));
			if(possible_Pos_x == 5) {
				possible_Pos_x -= 1;
			}
			possible_Pos_y = 5;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
	

	}
		
	
	//set possible positions pos_y = 0
	private void setAllPossiblePositionsPos_yEqualZero(int pos_x, int pos_y, int diceValue) {
		int possible_Pos_x;
		int possible_Pos_y;
		
		if((pos_x + diceValue) <= 11 ) {
			possible_Pos_y = pos_y;
			possible_Pos_x = pos_x + diceValue;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}else {
			possible_Pos_y = (pos_x + diceValue) - 11;
			possible_Pos_x = 11;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		
		if((pos_x - diceValue) >= 0) {
			possible_Pos_y = pos_y;
			possible_Pos_x = pos_x - diceValue;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}else {
			possible_Pos_y = diceValue - pos_x;
			possible_Pos_x = 0;	
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		if(pos_x == 5 || pos_x == 6) {
			possible_Pos_y = diceValue;
			if(possible_Pos_y == 6) {
				possible_Pos_y += 1;
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_x = 4;
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_x = 7;
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
		}
		
		if((pos_x < 5 ) &&(pos_x + diceValue) > 5) {
			possible_Pos_y = (pos_x + diceValue) - 5;
			if(possible_Pos_y == 6) {
				possible_Pos_y += 1;
			}
			possible_Pos_x = 5;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			
		}
		
		if((pos_x > 6) && (pos_x - diceValue) <= 5) {
			possible_Pos_y = diceValue - ((pos_x - 1) - 5);
			if(possible_Pos_y == 6) {
				possible_Pos_y += 1;
			}
			possible_Pos_x = 5;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		
		
	}
	
	
	//all possible positions pos_x = 0
	private void setAllPossiblePositionsPos_xEqualZero(int pos_x, int pos_y, int diceValue) {
		int possible_Pos_x;
		int possible_Pos_y;
		
		if((pos_y + diceValue) <= 11) {
			possible_Pos_x = pos_x;
			possible_Pos_y = pos_y + diceValue;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);

		}else {
			possible_Pos_x = (pos_y + diceValue) - 11;
			possible_Pos_y = 11;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		
		if((pos_y - diceValue) >= 0) {
			possible_Pos_x = pos_x;
			possible_Pos_y = pos_y - diceValue;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}else {
			possible_Pos_x = diceValue - pos_y;
			possible_Pos_y = 0;	
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
		
		if(pos_y == 5 || pos_y == 6) {
			possible_Pos_x = diceValue;
			if(possible_Pos_x == 6) {
				possible_Pos_x += 1;
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_y = 4;
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
				
				possible_Pos_y = 7;
				possible_Pos_x = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}else {
				possible_Pos_y = 5;
				squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			}
		}
		
		if((pos_y < 5 ) &&(pos_y + diceValue) > 5) {
			possible_Pos_x = (pos_y + diceValue) - 5;
			if(possible_Pos_x == 6) {
				possible_Pos_x += 1;
			}
			possible_Pos_y = 5;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
			
		}
		
		if((pos_y > 6) && (pos_y - diceValue) <= 5) {
			possible_Pos_x = diceValue - ((pos_y - 1) - 5);
			if(possible_Pos_x == 6) {
				possible_Pos_x += 1;
			}
			possible_Pos_y = 5;
			squareBoard.setButtonToAble(possible_Pos_x, possible_Pos_y);
		}
	}
	
	//show who is playing
	public void indicateWhoPlaying(JLabel lblPlaying1, JLabel lblPlaying2, JLabel lblPlaying3,JLabel lblPlaying4) {
		final int PLAYER1 = 1;
		final int PLAYER2 = 2;
		final int PLAYER3 = 3;
		final int PLAYER4 = 4;
	
		switch(currentPlayer) {
			case PLAYER1:
			{
				lblPlaying1.setVisible(true);
				
				lblPlaying2.setVisible(false);
				lblPlaying3.setVisible(false);
				lblPlaying4.setVisible(false);
				break;
			}
			case PLAYER2:
			{
				lblPlaying2.setVisible(true);
				lblPlaying1.setVisible(false);
				lblPlaying3.setVisible(false);
				lblPlaying4.setVisible(false);
				break;
			}
			case PLAYER3:
			{
				lblPlaying3.setVisible(true);
				lblPlaying2.setVisible(false);
				lblPlaying1.setVisible(false);
				lblPlaying4.setVisible(false);
				break;
			}
			case PLAYER4:
			{
				lblPlaying4.setVisible(true);
				lblPlaying2.setVisible(false);
				lblPlaying3.setVisible(false);
				lblPlaying1.setVisible(false);
				break;
			}
				
		}
	}

	


	//instruction for player
	public void instructions(JTextArea messageTextArea, String message) {
		
		messageTextArea.setText(message);
		messageTextArea.setVisible(true);
			
	}
	
	

	
	//random pick who to play fist
	public void randomPickPlayerToPlayerFisrt(){
		currentPlayer = randomNumber(numberOfPlayers);
	}
	

	

	//select player to play first
	private int randomNumber(int number) {
		
		int max = number; 
	    int min = 1; 
	    int range = max - min + 1; 
	  
	       
	    return (int)(Math.random() * range) + min; 

	}
	
	
	
}	

