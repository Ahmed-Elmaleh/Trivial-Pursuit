
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Board{
	private boolean hasAWinner;
	private PlayersManagement playersManagement;
	private int currentPlayer;
	private int numberOfPlayers;
	private Dice dice;
	private SquareBoard squareBoard;

	private QuestionBank placesQuestionBank;
	private QuestionBank peopleQuestionBank;
	private QuestionBank eventsQuestionBank;
	private QuestionBank independenceDayQuestionBank;

	public Board() {
		this.hasAWinner = false;
		this.playersManagement = new PlayersManagement();
		this.currentPlayer = 0;
		this.dice = new Dice();
		this.squareBoard = new SquareBoard();
		
		
		this.placesQuestionBank = new QuestionBank("src/Question_Set/places.csv");
		this.peopleQuestionBank = new QuestionBank("src/Question_Set/places.csv");
		this.eventsQuestionBank = new QuestionBank("src/Question_Set/events.csv");
		this.independenceDayQuestionBank = new QuestionBank("src/Question_Set/places.csv");

	}
	
	public PlayersManagement getPlayersManagement() {
		return playersManagement;
	}

	public void setPlayersManagement(PlayersManagement playersManagement) {
		this.playersManagement = playersManagement;
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
		
		playersManagement.getPlayers().get(currentPlayer - 1).updateToken(color);
		
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
	
	
	

	//update current new location
	public void updateNewPositions(JButton button) {
		
		int newPos_x = squareBoard.searchButtonPos_x(button.getName());
		int newPos_y = squareBoard.searchButtonPos_y(button.getName());
		
		if(newPos_x == 6 && newPos_y == 5)
			newPos_x -= 1;
		if(newPos_y == 6 && newPos_x == 5)
			newPos_y -=1;
		
		playersManagement.setNewPositionX(currentPlayer, newPos_x);
		playersManagement.setNewPositionY(currentPlayer, newPos_y);
		
	}
	
	//update text button
	public void updateTextForButton(JButton button) {
		
		String textButton = button.getText();
		if(textButton == "RAgain" || textButton == "WEDGE" ||
				textButton == "Trivial Purfuit" || textButton == "" ) {
			textButton = Integer.toString(currentPlayer);

		}else {
			textButton += Integer.toString(currentPlayer);
		}
		
		button.setText(textButton);
		
		
	}
	
	//reset text for button
	public void resetTextForButton() {
		
		
		int pos_x = playersManagement.getCurrentPositionX(currentPlayer);
		int pos_y =  playersManagement.getCurrentPositionY(currentPlayer);
		
		String buttonName = squareBoard.getButtonName(pos_x, pos_y);
		String buttonText = squareBoard.getButtonText(pos_x, pos_y);
		
		
	
		if(buttonText.equals("1")|| buttonText.equals("2")|| buttonText.equals("3") || buttonText.equals("4") ) {
			if(buttonName == "RAgainTop1" || buttonName == "RAgainTop2" || buttonName == "RAgainLeft1" ||
					buttonName == "RAgainLeft2" || buttonName == "RAgainRight1" || buttonName == "RAgainRight2" ||
					buttonName == "RAgainBottom1" || buttonName == "RAgainBottom2") {
				
				squareBoard.setButtonText(pos_x, pos_y, "RAgain");
				
			}else if(buttonName == "wedgeWhite" || buttonName == "wedgeRed" || buttonName == "wedgeBlue"
					||buttonName == "wedgeGreen") {
				squareBoard.setButtonText(pos_x, pos_y, "WEDGE");
				
			}else if(buttonName == "CENTER"){
				
				squareBoard.setButtonText(pos_x, pos_y, "Trivial Purfuit");
			}
			else
			{
				
				squareBoard.setButtonText(pos_x, pos_y, "");
				
			}
	
		}else {
			buttonText = buttonText.replaceAll(Integer.toString(currentPlayer), "");
			squareBoard.setButtonText(pos_x, pos_y, buttonText);
		}
	}
	
	
	//move player position
	public void setPossibleMovePositions() {
		
		
		int pos_x = playersManagement.getCurrentPositionX(currentPlayer);
		int pos_y = playersManagement.getCurrentPositionY(currentPlayer);
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
	
	private void setUpDefaultPositionsOfAllPlayers() {
//		int pos_x = squareBoard.searchButtonPos_x("CENTER");
//		int pos_y = squareBoard.searchButtonPos_y("CENTER");
		
		playersManagement.setDefaultPositionForPlayers(5, 5);
			
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

	
	
	//show roll dice
	public void showRollDice(JButton rollDice, JLabel JLabelResult, 
			JTextField textResult) {
		
		rollDice.setEnabled(true);
		rollDice.setVisible(true);
		JLabelResult.setVisible(true);
		textResult.setVisible(true);
		textResult.setText("");
		
	}

	//get Dice value
	public int getDiceValue() {
		return (dice.getDiceValue());
	}
	//roll dice
	public void rollDice() {
		dice.rollDice();
	}
	
	//roll dice, set up dice, and show result on board
	public void excuteDice(JTextField textDiceResult) {
		dice.rollDice();
		int diceValue = dice.getDiceValue();
		textDiceResult.setText(Integer.toString(diceValue));
	}
	
	//get the players' names
	public void getAndStorePlayersName() {

		
		for(int i = 0; i < numberOfPlayers; i++) {
			try {
				JDialog.setDefaultLookAndFeelDecorated(true);
			    Object selection = JOptionPane.showInputDialog(null, "What is the player " + (i + 1) + " name?",
			        "", JOptionPane.QUESTION_MESSAGE, null, null, null);
			    String name = (String)selection;
			    Player player = new Player();
			    player.setName(name);
			    playersManagement.addPlayer(player);;
 
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		
		
	}
	


	//Display players on the board
	public void displayPlayers(JLabel lblResult, JButton btnRollDice,
			JTextField textDiceResult, JButton btnSetUpPlayers,
			JTextField textPlayer1Piece1, JTextField textPlayer1Piece2,
			JTextField textPlayer1Piece3, JTextField textPlayer1Piece4,
			JTextField textPlayer2Piece1, JTextField textPlayer2Piece2,
			JTextField textPlayer2Piece3,
			JTextField textPlayer2Piece4, JTextField textPlayer3Piece1, 
			JTextField textPlayer3Piece2,  JTextField textPlayer3Piece3,
			JTextField textPlayer3Piece4, JTextField textPlayer4Piece1,
			JTextField textPlayer4Piece2, JTextField textPlayer4Piece3,
			JTextField textPlayer4Piece4, JLabel lblPlayer1, JLabel lblPlayer2,
			JLabel lblPlayer3, JLabel lblPlayer4, JLabel lblPlaying1,
			JLabel lblPlaying2, JLabel lblPlaying3, JLabel lblPlaying4, 
			JButton btnCenter, JLabel lblPlayer1Name, JLabel lblPlayer2Name, 
			JLabel lblPlayer3Name, JLabel lblPlayer4Name) {

	
	
	    btnSetUpPlayers.setVisible(false);
	    
	    lblResult.setVisible(true);
	    btnRollDice.setVisible(true);
	    btnRollDice.setEnabled(true);
	    textDiceResult.setVisible(true);
	    

	    final int ONE_PLAYER = 1;
		final int TWO_PLAYERS = 2;
		final int THREE_PLAYERS = 3;
		final int FOUR_PLAYERS = 4;
		
		
		switch (numberOfPlayers) {
			case ONE_PLAYER:
			{
				textPlayer1Piece1.setVisible(true);
				textPlayer1Piece2.setVisible(true);
				textPlayer1Piece3.setVisible(true);
				textPlayer1Piece4.setVisible(true);

				
				lblPlayer1Name.setText(playersManagement.getPlayers().get(ONE_PLAYER - 1).getName());
				lblPlayer1Name.setVisible(true);
				lblPlayer1.setVisible(true);
		
				break;
			}
			case TWO_PLAYERS:
			{
				textPlayer1Piece1.setVisible(true);
				textPlayer1Piece2.setVisible(true);
				textPlayer1Piece3.setVisible(true);
				textPlayer1Piece4.setVisible(true);
				
				textPlayer2Piece1.setVisible(true);
				textPlayer2Piece2.setVisible(true);
				textPlayer2Piece3.setVisible(true);
				textPlayer2Piece4.setVisible(true);
				
				lblPlayer1Name.setText(playersManagement.getPlayers().get(ONE_PLAYER - 1).getName());
				lblPlayer2Name.setText(playersManagement.getPlayers().get(TWO_PLAYERS - 1).getName());
				
				lblPlayer1Name.setVisible(true);
				lblPlayer2Name.setVisible(true);
				lblPlayer1.setVisible(true);
				lblPlayer2.setVisible(true);
	
				break;
			}
			case THREE_PLAYERS:
			{
				textPlayer1Piece1.setVisible(true);
				textPlayer1Piece2.setVisible(true);
				textPlayer1Piece3.setVisible(true);
				textPlayer1Piece4.setVisible(true);
				
				textPlayer2Piece1.setVisible(true);
				textPlayer2Piece2.setVisible(true);
				textPlayer2Piece3.setVisible(true);
				textPlayer2Piece4.setVisible(true);
				
				textPlayer3Piece1.setVisible(true);
				textPlayer3Piece2.setVisible(true);
				textPlayer3Piece3.setVisible(true);
				textPlayer3Piece4.setVisible(true);
				
				lblPlayer1Name.setText(playersManagement.getPlayers().get(ONE_PLAYER - 1).getName());
				lblPlayer2Name.setText(playersManagement.getPlayers().get(TWO_PLAYERS - 1).getName());
				lblPlayer3Name.setText(playersManagement.getPlayers().get(THREE_PLAYERS - 1).getName());
				
				lblPlayer1Name.setVisible(true);
				lblPlayer2Name.setVisible(true);
				lblPlayer3Name.setVisible(true);
				lblPlayer1.setVisible(true);
				lblPlayer2.setVisible(true);
				lblPlayer3.setVisible(true);
				
				
				break;
			}
			case FOUR_PLAYERS:
			{
				textPlayer1Piece1.setVisible(true);
				textPlayer1Piece2.setVisible(true);
				textPlayer1Piece3.setVisible(true);
				textPlayer1Piece4.setVisible(true);
				
				textPlayer2Piece1.setVisible(true);
				textPlayer2Piece2.setVisible(true);
				textPlayer2Piece3.setVisible(true);
				textPlayer2Piece4.setVisible(true);
				
				textPlayer3Piece1.setVisible(true);
				textPlayer3Piece2.setVisible(true);
				textPlayer3Piece3.setVisible(true);
				textPlayer3Piece4.setVisible(true);
				
				textPlayer4Piece1.setVisible(true);
				textPlayer4Piece2.setVisible(true);
				textPlayer4Piece3.setVisible(true);
				textPlayer4Piece4.setVisible(true);
				
				
				lblPlayer1Name.setText(playersManagement.getPlayers().get(ONE_PLAYER - 1).getName());
				lblPlayer2Name.setText(playersManagement.getPlayers().get(TWO_PLAYERS - 1).getName());
				lblPlayer3Name.setText(playersManagement.getPlayers().get(THREE_PLAYERS - 1).getName());
				lblPlayer4Name.setText(playersManagement.getPlayers().get(FOUR_PLAYERS - 1).getName());
				
				
				lblPlayer1Name.setVisible(true);
				lblPlayer2Name.setVisible(true);
				lblPlayer3Name.setVisible(true);
				lblPlayer4Name.setVisible(true);
				lblPlayer1.setVisible(true);
				lblPlayer2.setVisible(true);
				lblPlayer3.setVisible(true);
				lblPlayer4.setVisible(true);
				
				break;
			}
		}
		randomPickPlayerToPlayerFisrt();
		indicateWhoPlaying(lblPlaying1, lblPlaying2, lblPlaying3, lblPlaying4);
		setUpDefaultPositionsOfAllPlayers();
		showAllPlayerAtStart(btnCenter);
	}
	

	
	//instruction for player
	public void instructions(JTextArea messageTextArea, String message) {
		
		messageTextArea.setText(message);
		messageTextArea.setVisible(true);
			
	}
	
	
	//Display players on hub
	private void showAllPlayerAtStart(JButton btnCenter) {
		
		playersManagement.displayPlayersOnHub(btnCenter);
		
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
	
	//show who is playing
	public void indicateWhoPlaying(JLabel lblPlaying1, JLabel lblPlaying2, 
			JLabel lblPlaying3, JLabel lblPlaying4) {
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
}	

