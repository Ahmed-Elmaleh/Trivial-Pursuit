import javax.swing.JButton;

public class SquareBoard {

	public SquareBoard() {
		this.squareBoard = new Square[BOARD_SIZE][BOARD_SIZE];
		initialSqaureBoard();
	}
	
	//initial square board
	public void initialSqaureBoard() {

		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++) {
				squareBoard[i][j] = new Square();
			}
		}
	}
	
	//search button coordinate x using string name
	
	public int searchButtonPos_x(String buttonName) {
		
		int pos_x = -1;
		
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++) {
				if(buttonName == squareBoard[i][j].getButton().getName()){
					pos_x = i;
				}
			}
		}
		
		return pos_x;
	}
	
	//search button coordinate x using string name
	
	public int searchButtonPos_y(String buttonName) {
		
		int pos_y = -1;
		
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++) {
				if(buttonName == squareBoard[i][j].getButton().getName()){
					pos_y = j;
				}
			}
		}
		
		return pos_y;
	}
	
	//set a button to able
	public void setButtonToAble(int pos_x, int pos_y) {
		squareBoard[pos_x][pos_y].getButton().setEnabled(true);
	}
		
		
	
	
	//set all sqaure to unable
	public void setAllButtonsToUnable() {		
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++ ) {
				
				squareBoard[i][j].getButton().setEnabled(false);	
			}
		}			
	}
	
	//set all sqaure to able
	public void setAllButtonsTonable() {		
		for(int i = 0; i < BOARD_SIZE; i++) {
			for(int j = 0; j < BOARD_SIZE; j++ ) {
				
				squareBoard[i][j].getButton().setEnabled(true);	
			}
		}			
	}
		
	
	//get button name
	public String getButtonName(int pos_x, int pos_y) {
		
		return (squareBoard[pos_x][pos_y].getButtonName());
	}
	
	//public set button name
	public void setButtonName(int pos_x, int pos_y, String newName) {
		squareBoard[pos_x][pos_y].setButtonName(newName);
	}
	
	//public set button text
	public void setButtonText(int pos_x, int pos_y, String newText) {
		squareBoard[pos_x][pos_y].setButtonText(newText);
	}
	//get button text
	public String getButtonText(int pos_x, int pos_y) {
		return (squareBoard[pos_x][pos_y].getButtonText());
	}
	
	
	
	public Square[][] getSquareBoard() {
		return squareBoard;
	}

	public void setSquareBoard(Square[][] squareBoard) {
		this.squareBoard = squareBoard;
	}
	
	public void setSquareButton(int x, int y, JButton button) {
		squareBoard[x][y].setButton(button);
	}


	
	final int BOARD_SIZE = 12;
	private Square[][] squareBoard;
}
