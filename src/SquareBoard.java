import javax.swing.JButton;
import javax.swing.JTextArea;

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

	//assign buttons to board[][] type Square
	public void setUpSqaureBoard(JButton btnCenter,
			JButton btnWedgeWhite, JButton btnMidColumn1, JButton btnWedgeBlue,
			JButton btnWedgeGreen, JButton btnMidColumn2, JButton btnMidColumn3,
			JButton btnMidColumn4, JButton btnMidColumn5, JButton btnMidColumn6,
			JButton btnMidColumn7, JButton btnMidColumn8, JButton btnWedgeRed,
			JButton btnRight8, JButton btnRight7, JButton btnRight6, JButton btnRight5,
			JButton btnRightRollAgain2, JButton btnRight4, JButton btnRight3,
			JButton btnRight2, JButton btnMidRow5, JButton btnMidRow6, JButton btnMidRow7,
			JButton btnMidRow8, JButton btnRightRollAgain1, JButton btnRight1, JButton btnMidRow4,
			JButton btnMidRow3, JButton btnMidRow2, JButton btnMidRow1, JButton btnLeft1, 
			JButton btnLeft2, JButton btnLeft3, JButton btnLeft4, JButton btnLeft5, JButton btnLeft6,
			JButton btnLeftRollAgain1, JButton btnLeft7, JButton btnLeft8, JButton btnLeftRollAgain2,
			JButton btnBottom1, JButton btnBottom2,JButton btnBottomRollAgain1, JButton btnBottom3,
			JButton btnBottom4, JButton btnBottom5, JButton btnBottomRollAgain2, JButton btnBottom6,
			JButton btnBottom7, JButton btnBottom8, JButton btnTop1, JButton btnTop2, JButton btnTopRollAgain1,
			JButton btnTop3, JButton btnTop4, JButton btnTop5, JButton btnTop6, JButton btnTopRollAgain2,
			JButton btnTop7, JButton btnTop8) {
		
		squareBoard[0][0].setButton(btnWedgeWhite);		
		squareBoard[0][1].setButton(btnTop1);
		squareBoard[0][2].setButton(btnTop2);
		squareBoard[0][3].setButton(btnTopRollAgain1);
		squareBoard[0][4].setButton(btnTop3);
		squareBoard[0][5].setButton(btnTop4);
		squareBoard[0][6].setButton(btnTop5);
		squareBoard[0][7].setButton(btnTop6);
		squareBoard[0][8].setButton(btnTopRollAgain2);
		squareBoard[0][9].setButton(btnTop7);
		squareBoard[0][10].setButton(btnTop8);
		squareBoard[0][11].setButton(btnWedgeRed);
		squareBoard[1][0].setButton(btnLeft1);
		squareBoard[2][0].setButton(btnLeft2);
		squareBoard[3][0].setButton(btnLeft3);
		squareBoard[4][0].setButton(btnLeft4);
		squareBoard[5][0].setButton(btnLeft5);
		squareBoard[6][0].setButton(btnLeft6);
		squareBoard[7][0].setButton(btnLeftRollAgain1);
		squareBoard[8][0].setButton(btnLeft7);
		squareBoard[9][0].setButton(btnLeft8);
		squareBoard[10][0].setButton(btnLeftRollAgain2);
		squareBoard[11][0].setButton(btnWedgeBlue);
		squareBoard[11][1].setButton(btnBottom1);
		squareBoard[11][2].setButton(btnBottom2);
		squareBoard[11][3].setButton(btnBottomRollAgain1);
		squareBoard[11][4].setButton(btnBottom3);
		squareBoard[11][5].setButton(btnBottom4);
		squareBoard[11][6].setButton(btnBottom5);
		squareBoard[11][7].setButton(btnBottomRollAgain2);
		squareBoard[11][8].setButton(btnBottom6);
		squareBoard[11][9].setButton(btnBottom7);
		squareBoard[11][10].setButton(btnBottom8);
		squareBoard[11][11].setButton(btnWedgeGreen);
		squareBoard[1][11].setButton(btnRight1);
		squareBoard[2][11].setButton(btnRightRollAgain1);
		squareBoard[3][11].setButton(btnRight2);
		squareBoard[4][11].setButton(btnRight3);
		squareBoard[5][11].setButton(btnRight4);
		squareBoard[6][11].setButton(btnRightRollAgain2);
		squareBoard[7][11].setButton(btnRight5);
		squareBoard[8][11].setButton(btnRight6);
		squareBoard[9][11].setButton(btnRight7);
		squareBoard[10][11].setButton(btnRight8);
		squareBoard[1][5].setButton(btnMidColumn1);
		squareBoard[2][5].setButton(btnMidColumn2);
		squareBoard[3][5].setButton(btnMidColumn3);
		squareBoard[4][5].setButton(btnMidColumn4);
		
		squareBoard[5][5].setButton(btnCenter);
		squareBoard[6][5].setButton(btnCenter);
		squareBoard[5][6].setButton(btnCenter);
		
		squareBoard[7][5].setButton(btnMidColumn5);
		squareBoard[8][5].setButton(btnMidColumn6);
		squareBoard[9][5].setButton(btnMidColumn7);
		squareBoard[10][5].setButton(btnMidColumn8);
		squareBoard[5][1].setButton(btnMidRow1);
		squareBoard[5][2].setButton(btnMidRow2);
		squareBoard[5][3].setButton(btnMidRow3);
		squareBoard[5][4].setButton(btnMidRow4);
		squareBoard[5][7].setButton(btnMidRow5);
		squareBoard[5][8].setButton(btnMidRow6);
		squareBoard[5][9].setButton(btnMidRow7);
		squareBoard[5][10].setButton(btnMidRow8);
			
	}
	
	
	final int BOARD_SIZE = 12;
	private Square[][] squareBoard;
}
