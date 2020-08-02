import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class View {
	
	public View(Board board) {
		this.board = board;
		initialize();
	}
	
	public void initialize() {
		
		
		
		frmView = new JFrame();
		frmView.getContentPane().setBackground(SystemColor.window);
		frmView.setTitle("Trivial Purfuit");
		frmView.setBounds(100, 100, 1102, 845);
		frmView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmView.getContentPane().setLayout(null);
		frmView.setVisible(true);
		

		
		lblPlayer1 = new JLabel("Player 1:");
		lblPlayer1.setForeground(Color.YELLOW);
		lblPlayer1.setBounds(816, 182, 70, 15);
		lblPlayer1.setVisible(false);
		frmView.getContentPane().add(lblPlayer1);
		
		lblPlayer2 = new JLabel("Player 2:");
		lblPlayer2.setForeground(Color.CYAN);
		lblPlayer2.setBounds(816, 281, 70, 15);
		lblPlayer2.setVisible(false);
		frmView.getContentPane().add(lblPlayer2);
		
		lblPlayer3 = new JLabel("Player 3:");
		lblPlayer3.setForeground(Color.GRAY);
		lblPlayer3.setBounds(816, 391, 70, 15);
		lblPlayer3.setVisible(false);
		frmView.getContentPane().add(lblPlayer3);
		
		lblPlayer4 = new JLabel("Player 4:");
		lblPlayer4.setForeground(Color.PINK);
		lblPlayer4.setBounds(816, 499, 70, 15);
		lblPlayer4.setVisible(false);
		frmView.getContentPane().add(lblPlayer4);
		
		textPlayer1Piece1 = new JTextField();
		textPlayer1Piece1.setBounds(924, 146, 38, 38);
		textPlayer1Piece1.setColumns(10);
		textPlayer1Piece1.setVisible(false);
		frmView.getContentPane().add(textPlayer1Piece1);
	
		
		textPlayer1Piece2 = new JTextField();
		textPlayer1Piece2.setColumns(10);
		textPlayer1Piece2.setBounds(960, 146, 38, 38);
		textPlayer1Piece2.setVisible(false);
		frmView.getContentPane().add(textPlayer1Piece2);
		
		textPlayer1Piece3 = new JTextField();
		textPlayer1Piece3.setColumns(10);
		textPlayer1Piece3.setBounds(924, 182, 38, 38);
		textPlayer1Piece3.setVisible(false);
		frmView.getContentPane().add(textPlayer1Piece3);
		
		textPlayer1Piece4 = new JTextField();
		textPlayer1Piece4.setColumns(10);
		textPlayer1Piece4.setBounds(960, 182, 38, 38);
		textPlayer1Piece4.setVisible(false);
		frmView.getContentPane().add(textPlayer1Piece4);
		
		textPlayer2Piece1 = new JTextField();
		textPlayer2Piece1.setColumns(10);
		textPlayer2Piece1.setBounds(924, 252, 38, 38);
		textPlayer2Piece1.setVisible(false);
		frmView.getContentPane().add(textPlayer2Piece1);
		
		textPlayer2Piece2 = new JTextField();
		textPlayer2Piece2.setColumns(10);
		textPlayer2Piece2.setBounds(960, 252, 38, 38);
		textPlayer2Piece2.setVisible(false);
		frmView.getContentPane().add(textPlayer2Piece2);
		
		textPlayer2Piece3 = new JTextField();
		textPlayer2Piece3.setColumns(10);
		textPlayer2Piece3.setBounds(960, 288, 38, 38);
		textPlayer2Piece3.setVisible(false);
		frmView.getContentPane().add(textPlayer2Piece3);
		
		textPlayer2Piece4 = new JTextField();
		textPlayer2Piece4.setColumns(10);
		textPlayer2Piece4.setBounds(924, 288, 38, 38);
		textPlayer2Piece4.setVisible(false);
		frmView.getContentPane().add(textPlayer2Piece4);
		
		textPlayer3Piece1 = new JTextField();
		textPlayer3Piece1.setColumns(10);
		textPlayer3Piece1.setBounds(924, 368, 38, 38);
		textPlayer3Piece1.setVisible(false);
		frmView.getContentPane().add(textPlayer3Piece1);
		
		textPlayer3Piece2 = new JTextField();
		textPlayer3Piece2.setColumns(10);
		textPlayer3Piece2.setBounds(960, 368, 38, 38);
		textPlayer3Piece2.setVisible(false);
		frmView.getContentPane().add(textPlayer3Piece2);
		
		textPlayer3Piece3 = new JTextField();
		textPlayer3Piece3.setColumns(10);
		textPlayer3Piece3.setBounds(960, 404, 38, 38);
		textPlayer3Piece3.setVisible(false);
		frmView.getContentPane().add(textPlayer3Piece3);
		
		textPlayer3Piece4 = new JTextField();
		textPlayer3Piece4.setColumns(10);
		textPlayer3Piece4.setBounds(924, 404, 38, 38);
		textPlayer3Piece4.setVisible(false);
		frmView.getContentPane().add(textPlayer3Piece4);
		
		textPlayer4Piece1 = new JTextField();
		textPlayer4Piece1.setColumns(10);
		textPlayer4Piece1.setBounds(921, 475, 38, 38);
		textPlayer4Piece1.setVisible(false);
		frmView.getContentPane().add(textPlayer4Piece1);
		
		textPlayer4Piece2 = new JTextField();
		textPlayer4Piece2.setColumns(10);
		textPlayer4Piece2.setBounds(957, 475, 38, 38);
		textPlayer4Piece2.setVisible(false);
		frmView.getContentPane().add(textPlayer4Piece2);
		
		textPlayer4Piece3 = new JTextField();
		textPlayer4Piece3.setColumns(10);
		textPlayer4Piece3.setBounds(957, 511, 38, 38);
		textPlayer4Piece3.setVisible(false);
		frmView.getContentPane().add(textPlayer4Piece3);
		
		textPlayer4Piece4 = new JTextField();
		textPlayer4Piece4.setColumns(10);
		textPlayer4Piece4.setBounds(921, 511, 38, 38);
		textPlayer4Piece4.setVisible(false);
		frmView.getContentPane().add(textPlayer4Piece4);
		
		lblPlaying1 = new JLabel("Playing");
		lblPlaying1.setBounds(1008, 182, 70, 15);
		lblPlaying1.setVisible(false);
		frmView.getContentPane().add(lblPlaying1);
		
		lblPlaying2 = new JLabel("Playing");
		lblPlaying2.setBounds(1008, 281, 70, 15);
		lblPlaying2.setVisible(false);
		frmView.getContentPane().add(lblPlaying2);
		
		lblPlaying3 = new JLabel("Playing");
		lblPlaying3.setBounds(1008, 391, 70, 15);
		lblPlaying3.setVisible(false);
		frmView.getContentPane().add(lblPlaying3);
		
		lblPlaying4 = new JLabel("Playing");
		lblPlaying4.setBounds(1008, 499, 70, 15);
		lblPlaying4.setVisible(false);
		frmView.getContentPane().add(lblPlaying4);
		
	
		
		
		messageTextArea = new JTextArea("");
		messageTextArea.setSize(223, 124);
		messageTextArea.setLocation(809, 571);
		messageTextArea.setFont(new Font("Serif", Font.ITALIC, 16));
		messageTextArea.setLineWrap(true);
		messageTextArea.setWrapStyleWord(true);
		messageTextArea.setVisible(false);
		frmView.getContentPane().add(messageTextArea);
		
		
		btnExitGame = new JButton("EXIT GAME");
		btnExitGame.setBackground(Color.RED);
		btnExitGame.setBounds(806, 714, 135, 58);
		frmView.getContentPane().add(btnExitGame);
		
		lblResult = new JLabel("Result:");
		lblResult.setBounds(816, 94, 70, 15);
		lblResult.setVisible(false);
		frmView.getContentPane().add(lblResult);
		
		textDiceResult = new JTextField();
		textDiceResult.setHorizontalAlignment(SwingConstants.CENTER);
		textDiceResult.setBounds(870, 89, 125, 19);
		textDiceResult.setColumns(10);
		textDiceResult.setVisible(false);
		frmView.getContentPane().add(textDiceResult);
		

		btnRollDice = new JButton("ROLL DICE");
		btnRollDice.setFont(new Font("Dialog", Font.BOLD, 16));
		btnRollDice.setBounds(809, 24, 189, 58);
		btnRollDice.setVisible(false);
		frmView.getContentPane().add(btnRollDice);
		btnRollDice.addActionListener(new RollDiceListener(board, 
				textDiceResult, btnRollDice, messageTextArea));
		
		
		
		btnCenter = new JButton("Trivial Purfuit");
		btnCenter.setBounds(295, 310, 180, 176);
		frmView.getContentPane().add(btnCenter);
		btnCenter.setEnabled(false);
		btnCenter.setName("CENTER");
		btnCenter.addActionListener(new MoveListener(board, btnCenter,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		
		btnWedgeWhite = new JButton("WEDGE");
		btnWedgeWhite.setName("wedgeWhite");
		btnWedgeWhite.setBackground(Color.WHITE);
		btnWedgeWhite.setBounds(12, 24, 84, 84);
		frmView.getContentPane().add(btnWedgeWhite);
		btnWedgeWhite.setEnabled(false);
		btnWedgeWhite.addActionListener(new MoveListener(board, btnWedgeWhite,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidColumn1 = new JButton("");
		btnMidColumn1.setBackground(Color.GREEN);
		btnMidColumn1.setToolTipText("");
		btnMidColumn1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidColumn1.setBounds(354, 81, 58, 58);
		frmView.getContentPane().add(btnMidColumn1);
		btnMidColumn1.setEnabled(false);
		btnMidColumn1.setName("btnMidColumn1");
		btnMidColumn1.addActionListener(new MoveListener(board, btnMidColumn1,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		
		
		btnWedgeBlue = new JButton("WEDGE");
		btnWedgeBlue.setBackground(Color.BLUE);
		btnWedgeBlue.setBounds(12, 688, 84, 84);
		frmView.getContentPane().add(btnWedgeBlue);
		btnWedgeBlue.setEnabled(false);
		btnWedgeBlue.setName("wedgeBlue");
		btnWedgeBlue.addActionListener(new MoveListener(board, btnWedgeBlue,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnWedgeGreen = new JButton("WEDGE");
		btnWedgeGreen.setBackground(Color.GREEN);
		btnWedgeGreen.setBounds(674, 688, 84, 84);
		frmView.getContentPane().add(btnWedgeGreen);
		btnWedgeGreen.setEnabled(false);
		btnWedgeGreen.setName("wedgeGreen");
		btnWedgeGreen.addActionListener(new MoveListener(board, btnWedgeGreen,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidColumn2 = new JButton("");
		btnMidColumn2.setBackground(Color.BLUE);
		btnMidColumn2.setToolTipText("");
		btnMidColumn2.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidColumn2.setBounds(353, 137, 60, 58);
		frmView.getContentPane().add(btnMidColumn2);
		btnMidColumn2.setEnabled(false);
		btnMidColumn2.setName("btnMidColumn2");
		btnMidColumn2.addActionListener(new MoveListener(board, btnMidColumn2,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidColumn3 = new JButton("");
		btnMidColumn3.setBackground(Color.RED);
		btnMidColumn3.setToolTipText("");
		btnMidColumn3.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidColumn3.setBounds(354, 195, 58, 58);
		frmView.getContentPane().add(btnMidColumn3);
		btnMidColumn3.setEnabled(false);
		btnMidColumn3.setName("btnMidColumn3");
		btnMidColumn3.addActionListener(new MoveListener(board, btnMidColumn3,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidColumn4 = new JButton("");
		btnMidColumn4.setForeground(new Color(0, 0, 0));
		btnMidColumn4.setBackground(Color.WHITE);
		btnMidColumn4.setToolTipText("");
		btnMidColumn4.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidColumn4.setBounds(354, 252, 58, 58);
		frmView.getContentPane().add(btnMidColumn4);
		btnMidColumn4.setEnabled(false);
		btnMidColumn4.setName("btnMidColumn4");
		btnMidColumn4.addActionListener(new MoveListener(board, btnMidColumn4,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidColumn5 = new JButton("");
		btnMidColumn5.setBackground(Color.RED);
		btnMidColumn5.setToolTipText("");
		btnMidColumn5.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidColumn5.setBounds(360, 486, 58, 58);
		frmView.getContentPane().add(btnMidColumn5);
		btnMidColumn5.setEnabled(false);
		btnMidColumn5.setName("btnMidColumn5");
		btnMidColumn5.addActionListener(new MoveListener(board, btnMidColumn5,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidColumn6 = new JButton("");
		btnMidColumn6.setBackground(Color.GREEN);
		btnMidColumn6.setToolTipText("");
		btnMidColumn6.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidColumn6.setBounds(360, 543, 58, 58);
		frmView.getContentPane().add(btnMidColumn6);
		btnMidColumn6.setEnabled(false);
		btnMidColumn6.setName("btnMidColumn6");
		btnMidColumn6.addActionListener(new MoveListener(board, btnMidColumn6,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidColumn7 = new JButton("");
		btnMidColumn7.setBackground(Color.BLUE);
		btnMidColumn7.setToolTipText("");
		btnMidColumn7.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidColumn7.setBounds(360, 598, 58, 58);
		frmView.getContentPane().add(btnMidColumn7);
		btnMidColumn7.setEnabled(false);
		btnMidColumn7.setName("btnMidColumn7");
		btnMidColumn7.addActionListener(new MoveListener(board, btnMidColumn7,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidColumn8 = new JButton("");
		btnMidColumn8.setBackground(Color.WHITE);
		btnMidColumn8.setToolTipText("");
		btnMidColumn8.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidColumn8.setBounds(360, 656, 58, 58);
		frmView.getContentPane().add(btnMidColumn8);
		btnMidColumn8.setEnabled(false);
		btnMidColumn8.setName("btnMidColumn8");
		btnMidColumn8.addActionListener(new MoveListener(board, btnMidColumn8,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnWedgeRed = new JButton("WEDGE");
		btnWedgeRed.setBackground(Color.RED);
		btnWedgeRed.setBounds(674, 24, 84, 84);
		frmView.getContentPane().add(btnWedgeRed);
		btnWedgeRed.setEnabled(false);
		btnWedgeRed.setName("wedgeRed");
		btnWedgeRed.addActionListener(new MoveListener(board, btnWedgeRed,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnRight8 = new JButton("");
		btnRight8.setBackground(Color.BLUE);
		btnRight8.setToolTipText("");
		btnRight8.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRight8.setBounds(699, 628, 60, 60);
		frmView.getContentPane().add(btnRight8);
		btnRight8.setEnabled(false);
		btnRight8.setName("btnRight8");
		btnRight8.addActionListener(new MoveListener(board, btnRight8,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnRight7 = new JButton("");
		btnRight7.setBackground(Color.RED);
		btnRight7.setToolTipText("");
		btnRight7.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRight7.setBounds(700, 572, 58, 59);
		frmView.getContentPane().add(btnRight7);
		btnRight7.setEnabled(false);
		btnRight7.setName("btnRight7");
		btnRight7.addActionListener(new MoveListener(board, btnRight7,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnRight6 = new JButton("");
		btnRight6.setBackground(Color.GREEN);
		btnRight6.setToolTipText("");
		btnRight6.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRight6.setBounds(700, 513, 58, 60);
		frmView.getContentPane().add(btnRight6);
		btnRight6.setEnabled(false);
		btnRight6.setName("btnRight6");
		btnRight6.addActionListener(new MoveListener(board, btnRight6,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnRight5 = new JButton("");
		btnRight5.setBackground(Color.WHITE);
		btnRight5.setToolTipText("");
		btnRight5.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRight5.setBounds(700, 454, 58, 60);
		frmView.getContentPane().add(btnRight5);
		btnRight5.setEnabled(false);
		btnRight5.setName("btnRight5");
		btnRight5.addActionListener(new MoveListener(board, btnRight5,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnRightRollAgain2 = new JButton("RAgain");
		btnRightRollAgain2.setToolTipText("");
		btnRightRollAgain2.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRightRollAgain2.setBounds(700, 395, 58, 60);
		frmView.getContentPane().add(btnRightRollAgain2);
		btnRightRollAgain2.setEnabled(false);
		btnRightRollAgain2.setName("RAgainRight2");
		btnRightRollAgain2.addActionListener(new MoveListener(board, btnRightRollAgain2,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnRight4 = new JButton("");
		btnRight4.setForeground(Color.YELLOW);
		btnRight4.setBackground(Color.WHITE);
		btnRight4.setToolTipText("");
		btnRight4.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRight4.setBounds(700, 336, 58, 60);
		frmView.getContentPane().add(btnRight4);
		btnRight4.setEnabled(false);
		btnRight4.setName("btnRight4");
		btnRight4.addActionListener(new MoveListener(board, btnRight4,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnRight3 = new JButton("");
		btnRight3.setBackground(Color.RED);
		btnRight3.setToolTipText("");
		btnRight3.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRight3.setBounds(700, 277, 58, 60);
		frmView.getContentPane().add(btnRight3);
		btnRight3.setEnabled(false);
		btnRight3.setName("btnRight3");
		btnRight3.addActionListener(new MoveListener(board, btnRight3,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnRight2 = new JButton("");
		btnRight2.setForeground(Color.YELLOW);
		btnRight2.setBackground(Color.BLUE);
		btnRight2.setToolTipText("");
		btnRight2.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRight2.setBounds(699, 218, 60, 60);
		frmView.getContentPane().add(btnRight2);
		btnRight2.setEnabled(false);
		btnRight2.setName("btnRight2");
		btnRight2.addActionListener(new MoveListener(board, btnRight2,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidRow5 = new JButton("");
		btnMidRow5.setBackground(Color.BLUE);
		btnMidRow5.setToolTipText("");
		btnMidRow5.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidRow5.setBounds(472, 368, 58, 58);
		frmView.getContentPane().add(btnMidRow5);
		btnMidRow5.setEnabled(false);
		btnMidRow5.setName("btnMidRow5");
		btnMidRow5.addActionListener(new MoveListener(board, btnMidRow5,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidRow6 = new JButton("");
		btnMidRow6.setBackground(Color.GREEN);
		btnMidRow6.setToolTipText("");
		btnMidRow6.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidRow6.setBounds(528, 368, 58, 58);
		frmView.getContentPane().add(btnMidRow6);
		btnMidRow6.setEnabled(false);
		btnMidRow6.setName("btnMidRow6");
		btnMidRow6.addActionListener(new MoveListener(board, btnMidRow6,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidRow7 = new JButton("");
		btnMidRow7.setBackground(Color.RED);
		btnMidRow7.setToolTipText("");
		btnMidRow7.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidRow7.setBounds(585, 368, 58, 58);
		frmView.getContentPane().add(btnMidRow7);
		btnMidRow7.setEnabled(false);
		btnMidRow7.setName("btnMidRow7");
		btnMidRow7.addActionListener(new MoveListener(board, btnMidRow7,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidRow8 = new JButton("");
		btnMidRow8.setBackground(Color.WHITE);
		btnMidRow8.setToolTipText("");
		btnMidRow8.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidRow8.setBounds(642, 368, 58, 58);
		frmView.getContentPane().add(btnMidRow8);
		btnMidRow8.setEnabled(false);
		btnMidRow8.setName("btnMidRow8");
		
		btnMidRow8.addActionListener(new MoveListener(board, btnMidRow8,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnRightRollAgain1 = new JButton("RAgain");
		btnRightRollAgain1.setToolTipText("");
		btnRightRollAgain1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRightRollAgain1.setBounds(700, 162, 58, 58);
		frmView.getContentPane().add(btnRightRollAgain1);
		btnRightRollAgain1.setEnabled(false);
		btnRightRollAgain1.setName("RAgainRight1");
		btnRightRollAgain1.addActionListener(new MoveListener(board, btnRightRollAgain1,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnRight1 = new JButton("");
		btnRight1.setBackground(Color.GREEN);
		btnRight1.setToolTipText("");
		btnRight1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRight1.setBounds(700, 108, 58, 58);
		frmView.getContentPane().add(btnRight1);
		btnRight1.setEnabled(false);
		btnRight1.setName("btnRight1");
		btnRight1.addActionListener(new MoveListener(board, btnRight1,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidRow4 = new JButton("");
		btnMidRow4.setBackground(Color.GREEN);
		btnMidRow4.setToolTipText("");
		btnMidRow4.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidRow4.setBounds(239, 361, 58, 58);
		frmView.getContentPane().add(btnMidRow4);
		btnMidRow4.setEnabled(false);
		btnMidRow4.setName("btnMidRow4");
		btnMidRow4.addActionListener(new MoveListener(board, btnMidRow4,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidRow3 = new JButton("");
		btnMidRow3.setBackground(Color.WHITE);
		btnMidRow3.setToolTipText("");
		btnMidRow3.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidRow3.setBounds(183, 361, 58, 58);
		frmView.getContentPane().add(btnMidRow3);
		btnMidRow3.setEnabled(false);
		btnMidRow3.setName("btnMidRow3");
		btnMidRow3.addActionListener(new MoveListener(board, btnMidRow3,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidRow2 = new JButton("");
		btnMidRow2.setBackground(Color.BLUE);
		btnMidRow2.setToolTipText("");
		btnMidRow2.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidRow2.setBounds(126, 361, 58, 58);
		frmView.getContentPane().add(btnMidRow2);
		btnMidRow2.setEnabled(false);
		btnMidRow2.setName("btnMidRow2");
		btnMidRow2.addActionListener(new MoveListener(board, btnMidRow2,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnMidRow1 = new JButton("");
		btnMidRow1.setBackground(Color.RED);
		btnMidRow1.setToolTipText("");
		btnMidRow1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnMidRow1.setBounds(69, 361, 58, 58);
		frmView.getContentPane().add(btnMidRow1);
		btnMidRow1.setEnabled(false);
		btnMidRow1.setName("btnMidRow1");
		btnMidRow1.addActionListener(new MoveListener(board, btnMidRow1,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnLeft1 = new JButton("");
		btnLeft1.setBackground(Color.BLUE);
		btnLeft1.setToolTipText("");
		btnLeft1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnLeft1.setBounds(12, 104, 58, 60);
		frmView.getContentPane().add(btnLeft1);
		btnLeft1.setEnabled(false);
		btnLeft1.setName("btnLeft1");
		btnLeft1.addActionListener(new MoveListener(board, btnLeft1,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		
		btnLeft2 = new JButton("");
		btnLeft2.setBackground(Color.RED);
		btnLeft2.setToolTipText("");
		btnLeft2.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnLeft2.setBounds(12, 163, 58, 59);
		frmView.getContentPane().add(btnLeft2);
		btnLeft2.setEnabled(false);
		btnLeft2.setName("btnLeft2");
		btnLeft2.addActionListener(new MoveListener(board, btnLeft2,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnLeft3 = new JButton("");
		btnLeft3.setBackground(Color.GREEN);
		btnLeft3.setToolTipText("");
		btnLeft3.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnLeft3.setBounds(12, 218, 58, 60);
		frmView.getContentPane().add(btnLeft3);
		btnLeft3.setEnabled(false);
		btnLeft3.setName("btnLeft3");
		btnLeft3.addActionListener(new MoveListener(board, btnLeft3,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnLeft4 = new JButton("");
		btnLeft4.setBackground(Color.WHITE);
		btnLeft4.setToolTipText("");
		btnLeft4.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnLeft4.setBounds(12, 277, 58, 60);
		frmView.getContentPane().add(btnLeft4);
		btnLeft4.setEnabled(false);
		btnLeft4.setName("btnLeft4");
		btnLeft4.addActionListener(new MoveListener(board, btnLeft4,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		
		btnLeft5 = new JButton("");
		btnLeft5.setBackground(Color.RED);
		btnLeft5.setToolTipText("");
		btnLeft5.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnLeft5.setBounds(12, 334, 58, 61);
		frmView.getContentPane().add(btnLeft5);
		btnLeft5.setEnabled(false);
		btnLeft5.setName("btnLeft5");
		btnLeft5.addActionListener(new MoveListener(board, btnLeft5,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnLeft6 = new JButton("");
		btnLeft6.setBackground(Color.BLUE);
		btnLeft6.setToolTipText("");
		btnLeft6.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnLeft6.setBounds(12, 394, 58, 61);
		frmView.getContentPane().add(btnLeft6);
		btnLeft6.setEnabled(false);
		btnLeft6.setName("btnLeft6");
		btnLeft6.addActionListener(new MoveListener(board, btnLeft6,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnLeftRollAgain1 = new JButton("RAgain");
		btnLeftRollAgain1.setToolTipText("");
		btnLeftRollAgain1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnLeftRollAgain1.setBounds(12, 451, 58, 61);
		frmView.getContentPane().add(btnLeftRollAgain1);
		btnLeftRollAgain1.setEnabled(false);
		btnLeftRollAgain1.setName("RAgainLeft1");
		btnLeftRollAgain1.addActionListener(new MoveListener(board, btnLeftRollAgain1,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnLeft7 = new JButton("");
		btnLeft7.setBackground(Color.WHITE);
		btnLeft7.setToolTipText("");
		btnLeft7.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnLeft7.setBounds(12, 511, 58, 60);
		frmView.getContentPane().add(btnLeft7);
		btnLeft7.setEnabled(false);
		btnLeft7.setName("btnLeft7");
		btnLeft7.addActionListener(new MoveListener(board, btnLeft7,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnLeft8 = new JButton("");
		btnLeft8.setBackground(Color.GREEN);
		btnLeft8.setToolTipText("");
		btnLeft8.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnLeft8.setBounds(12, 570, 58, 60);
		frmView.getContentPane().add(btnLeft8);
		btnLeft8.setEnabled(false);
		btnLeft8.setName("btnLeft8");
		btnLeft8.addActionListener(new MoveListener(board, btnLeft8,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnLeftRollAgain2 = new JButton("RAgain");
		btnLeftRollAgain2.setToolTipText("");
		btnLeftRollAgain2.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnLeftRollAgain2.setBounds(12, 628, 58, 60);
		frmView.getContentPane().add(btnLeftRollAgain2);
		btnLeftRollAgain2.setEnabled(false);
		btnLeftRollAgain2.setName("RAgainLeft1");
		btnLeftRollAgain2.addActionListener(new MoveListener(board, btnLeftRollAgain2,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnBottom1 = new JButton("");
		btnBottom1.setBackground(Color.GREEN);
		btnBottom1.setToolTipText("");
		btnBottom1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnBottom1.setBounds(96, 714, 60, 58);
		frmView.getContentPane().add(btnBottom1);
		btnBottom1.setEnabled(false);
		btnBottom1.setName("btnBottom1");
		btnBottom1.addActionListener(new MoveListener(board, btnBottom1,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnBottom2 = new JButton("");
		btnBottom2.setBackground(Color.BLUE);
		btnBottom2.setToolTipText("");
		btnBottom2.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnBottom2.setBounds(155, 714, 60, 58);
		frmView.getContentPane().add(btnBottom2);
		btnBottom2.setEnabled(false);
		btnBottom2.setName("btnBottom2");
		btnBottom2.addActionListener(new MoveListener(board, btnBottom2,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnBottomRollAgain1 = new JButton("RAgain");
		btnBottomRollAgain1.setToolTipText("");
		btnBottomRollAgain1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnBottomRollAgain1.setBounds(214, 714, 60, 58);
		frmView.getContentPane().add(btnBottomRollAgain1);
		btnBottomRollAgain1.setEnabled(false);
		btnBottomRollAgain1.setName("RAgainBottom1");
		btnBottomRollAgain1.addActionListener(new MoveListener(board, btnBottomRollAgain1,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnBottom3 = new JButton("");
		btnBottom3.setBackground(Color.WHITE);
		btnBottom3.setToolTipText("");
		btnBottom3.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnBottom3.setBounds(272, 714, 60, 58);
		frmView.getContentPane().add(btnBottom3);
		btnBottom3.setEnabled(false);
		btnBottom3.setName("btnBottom3");
		btnBottom3.addActionListener(new MoveListener(board, btnBottom3,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnBottom4 = new JButton("");
		btnBottom4.setBackground(Color.RED);
		btnBottom4.setToolTipText("");
		btnBottom4.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnBottom4.setBounds(330, 714, 60, 58);
		frmView.getContentPane().add(btnBottom4);
		btnBottom4.setEnabled(false);
		btnBottom4.setName("btnBottom4");
		btnBottom4.addActionListener(new MoveListener(board, btnBottom4,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnBottom5 = new JButton("");
		btnBottom5.setBackground(Color.GREEN);
		btnBottom5.setToolTipText("");
		btnBottom5.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnBottom5.setBounds(389, 714, 60, 58);
		frmView.getContentPane().add(btnBottom5);
		btnBottom5.setEnabled(false);
		btnBottom5.setName("btnBottom5");
		btnBottom5.addActionListener(new MoveListener(board, btnBottom5,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnBottomRollAgain2 = new JButton("RAgain");
		btnBottomRollAgain2.setToolTipText("");
		btnBottomRollAgain2.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnBottomRollAgain2.setBounds(447, 714, 60, 58);
		frmView.getContentPane().add(btnBottomRollAgain2);
		btnBottomRollAgain2.setEnabled(false);
		btnBottomRollAgain2.setName("RAgainBottom2");
		btnBottomRollAgain2.addActionListener(new MoveListener(board, btnBottomRollAgain2,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnBottom6 = new JButton("");
		btnBottom6.setBackground(Color.RED);
		btnBottom6.setToolTipText("");
		btnBottom6.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnBottom6.setBounds(505, 714, 60, 58);
		frmView.getContentPane().add(btnBottom6);
		btnBottom6.setEnabled(false);
		btnBottom6.setName("btnBottom6");
		btnBottom6.addActionListener(new MoveListener(board, btnBottom6,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnBottom7 = new JButton("");
		btnBottom7.setBackground(Color.BLUE);
		btnBottom7.setToolTipText("");
		btnBottom7.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnBottom7.setBounds(562, 714, 60, 58);
		frmView.getContentPane().add(btnBottom7);
		btnBottom7.setEnabled(false);
		btnBottom7.setName("btnBottom7");
		btnBottom7.addActionListener(new MoveListener(board, btnBottom7,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnBottom8 = new JButton("");
		btnBottom8.setBackground(Color.WHITE);
		btnBottom8.setToolTipText("");
		btnBottom8.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnBottom8.setBounds(616, 714, 60, 58);
		frmView.getContentPane().add(btnBottom8);
		btnBottom8.setEnabled(false);
		btnBottom8.setName("btnBottom8");
		btnBottom8.addActionListener(new MoveListener(board, btnBottom8,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnTop1 = new JButton("");
		btnTop1.setBackground(Color.RED);
		btnTop1.setToolTipText("");
		btnTop1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnTop1.setBounds(95, 24, 60, 58);
		frmView.getContentPane().add(btnTop1);
		btnTop1.setEnabled(false);
		btnTop1.setName("btnTop1");
		btnTop1.addActionListener(new MoveListener(board, btnTop1,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		
		
		btnTop2 = new JButton("");
		btnTop2.setBackground(Color.BLUE);
		btnTop2.setToolTipText("");
		btnTop2.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnTop2.setBounds(153, 24, 60, 58);
		frmView.getContentPane().add(btnTop2);
		btnTop2.setEnabled(false);
		btnTop2.setName("btnTop2");
		btnTop2.addActionListener(new MoveListener(board, btnTop2,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		
		
		btnTopRollAgain1 = new JButton("RAgain");
		btnTopRollAgain1.setToolTipText("");
		btnTopRollAgain1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnTopRollAgain1.setBounds(212, 24, 60, 58);
		frmView.getContentPane().add(btnTopRollAgain1);
		btnTopRollAgain1.setEnabled(false);
		btnTopRollAgain1.setName("RAgainTop1");
		btnTopRollAgain1.addActionListener(new MoveListener(board, btnTopRollAgain1,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		
		
		btnTop3 = new JButton("");
		btnTop3.setBackground(Color.RED);
		btnTop3.setToolTipText("");
		btnTop3.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnTop3.setBounds(270, 24, 60, 58);
		frmView.getContentPane().add(btnTop3);
		btnTop3.setEnabled(false);
		btnTop3.setName("btnTop3");
		btnTop3.addActionListener(new MoveListener(board, btnTop3,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnTop4 = new JButton("");
		btnTop4.setBackground(Color.WHITE);
		btnTop4.setToolTipText("");
		btnTop4.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnTop4.setBounds(328, 24, 58, 58);
		frmView.getContentPane().add(btnTop4);
		btnTop4.setEnabled(false);
		btnTop4.setName("btnTop4");
		btnTop4.addActionListener(new MoveListener(board, btnTop4,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnTop5 = new JButton("");
		btnTop5.setBackground(Color.GREEN);
		btnTop5.setToolTipText("");
		btnTop5.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnTop5.setBounds(385, 24, 58, 58);
		frmView.getContentPane().add(btnTop5);
		btnTop5.setEnabled(false);
		btnTop5.setName("btnTop5");
		btnTop5.addActionListener(new MoveListener(board, btnTop5,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnTop6 = new JButton("");
		btnTop6.setBackground(Color.BLUE);
		btnTop6.setToolTipText("");
		btnTop6.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnTop6.setBounds(442, 24, 58, 58);
		frmView.getContentPane().add(btnTop6);
		btnTop6.setEnabled(false);
		btnTop6.setName("btnTop6");
		btnTop6.addActionListener(new MoveListener(board, btnTop6,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnTopRollAgain2 = new JButton("RAgain");
		btnTopRollAgain2.setToolTipText("");
		btnTopRollAgain2.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnTopRollAgain2.setBounds(499, 24, 58, 58);
		frmView.getContentPane().add(btnTopRollAgain2);
		btnTopRollAgain2.setEnabled(false);
		btnTopRollAgain2.setName("RAgainTop2");
		btnTopRollAgain2.addActionListener(new MoveListener(board, btnTopRollAgain2,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnTop7 = new JButton("");
		btnTop7.setForeground(Color.YELLOW);
		btnTop7.setBackground(Color.GREEN);
		btnTop7.setToolTipText("");
		btnTop7.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnTop7.setBounds(556, 24, 60, 58);
		frmView.getContentPane().add(btnTop7);
		btnTop7.setEnabled(false);
		btnTop7.setName("btnTop7");
		btnTop7.addActionListener(new MoveListener(board, btnTop7,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		btnTop8 = new JButton("");
		btnTop8.setBackground(Color.WHITE);
		btnTop8.setToolTipText("");
		btnTop8.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnTop8.setBounds(615, 24, 60, 58);
		frmView.getContentPane().add(btnTop8);
		btnTop8.setEnabled(false);
		btnTop8.setName("btnTop8");
		btnTop8.addActionListener(new MoveListener(board, btnTop8,
				messageTextArea, btnRollDice, textDiceResult, lblResult ));
		
		lblPlayer1Name = new JLabel("New label");
		lblPlayer1Name.setBounds(816, 195, 70, 15);
		frmView.getContentPane().add(lblPlayer1Name);
		lblPlayer1Name.setVisible(false);
		
		lblPlayer2Name = new JLabel("New label");
		lblPlayer2Name.setBounds(816, 297, 70, 15);
		frmView.getContentPane().add(lblPlayer2Name);
		lblPlayer2Name.setVisible(false);
		
		lblPlayer3Name = new JLabel("New label");
		lblPlayer3Name.setBounds(816, 408, 70, 15);
		frmView.getContentPane().add(lblPlayer3Name);
		lblPlayer3Name.setVisible(false);
		
		lblPlayer4Name = new JLabel("New label");
		lblPlayer4Name.setBounds(816, 515, 70, 15);
		frmView.getContentPane().add(lblPlayer4Name);
		lblPlayer4Name.setVisible(false);
		
	
		
		
		
		btnSetUpPlayers = new JButton("SET UP PLAYERS");
		
		btnSetUpPlayers.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSetUpPlayers.setBounds(806, 24, 189, 58);
		frmView.getContentPane().add(btnSetUpPlayers);
		btnSetUpPlayers.addActionListener(new SetUpPlayersListener(board, lblResult,  btnRollDice,
				textDiceResult, btnSetUpPlayers, textPlayer1Piece1, 
				textPlayer1Piece2, textPlayer1Piece3, textPlayer1Piece4, 
				textPlayer2Piece1, textPlayer2Piece2, textPlayer2Piece3, 
				textPlayer2Piece4, textPlayer3Piece1, textPlayer3Piece2, 
				textPlayer3Piece3, textPlayer3Piece4, textPlayer4Piece1,
				textPlayer4Piece2, textPlayer4Piece3, textPlayer4Piece4, 
				lblPlayer1, lblPlayer2, lblPlayer3, lblPlayer4, lblPlaying1, 
				lblPlaying2, lblPlaying3, lblPlaying4, btnCenter, btnWedgeWhite,
				btnMidColumn1, btnWedgeBlue, btnWedgeGreen, btnMidColumn2, 
				btnMidColumn3, btnMidColumn4, btnMidColumn5, btnMidColumn6, 
				btnMidColumn7, btnMidColumn8, btnWedgeRed, btnRight8, 
				btnRight7, btnRight6, btnRight5, btnRightRollAgain2,
				btnRight4, btnRight3, btnRight2, btnMidRow5,btnMidRow6,
				btnMidRow7, btnMidRow8, btnRightRollAgain1, btnRight1,
				btnMidRow4, btnMidRow3, btnMidRow2, btnMidRow1, btnLeft1,
				btnLeft2, btnLeft3, btnLeft4, btnLeft5, btnLeft6, btnLeftRollAgain1,
				btnLeft7, btnLeft8, btnLeftRollAgain2, btnBottom1, btnBottom2,
				btnBottomRollAgain1, btnBottom3, btnBottom4, btnBottom5,
				btnBottomRollAgain2, btnBottom6, btnBottom7, btnBottom8, btnTop1,
				btnTop2, btnTopRollAgain1, btnTop3, btnTop4, btnTop5, btnTop6,
				btnTopRollAgain2, btnTop7, btnTop8, messageTextArea, 
				lblPlayer1Name, lblPlayer2Name, lblPlayer3Name, lblPlayer4Name));
		
		
		
	}
	
	
	public JLabel getLblPlayer1Name() {
		return lblPlayer1Name;
	}

	public void setLblPlayer1Name(JLabel lblPlayer1Name) {
		this.lblPlayer1Name = lblPlayer1Name;
	}

	public JLabel getLblPlayer2Name() {
		return lblPlayer2Name;
	}

	public void setLblPlayer2Name(JLabel lblPlayer2Name) {
		this.lblPlayer2Name = lblPlayer2Name;
	}

	public JLabel getLblPlayer3Name() {
		return lblPlayer3Name;
	}

	public void setLblPlayer3Name(JLabel lblPlayer3Name) {
		this.lblPlayer3Name = lblPlayer3Name;
	}

	public JLabel getLblPlayer4Name() {
		return lblPlayer4Name;
	}

	public void setLblPlayer4Name(JLabel lblPlayer4Name) {
		this.lblPlayer4Name = lblPlayer4Name;
	}


	
	public JFrame getFrmView() {
		return frmView;
	}

	public void setFrmView(JFrame frmView) {
		this.frmView = frmView;
	}

	public JButton getBtnSetUpPlayers() {
		return btnSetUpPlayers;
	}
	
	public JButton getBtnExitGame() {
		return btnExitGame;
	}

	public void setBtnExitGame(JButton btnExitGame) {
		this.btnExitGame = btnExitGame;
	}


	public void setBtnSetUpPlayers(JButton btnSetUpPlayers) {
		this.btnSetUpPlayers = btnSetUpPlayers;
	}
	
	public JButton getBtnRollDice() {
		return btnRollDice;
	}

	public void setBtnRollDice(JButton btnRollDice) {
		this.btnRollDice = btnRollDice;
	}

	public JTextArea getMessageTextArea() {
		return messageTextArea;
	}

	public void setMessageTest(JTextArea messageTextArea) {
		this.messageTextArea = messageTextArea;
	}

	
	public JTextField getTextDiceResult() {
		return textDiceResult;
	}

	public void setTextDiceResult(JTextField textDiceResult) {
		this.textDiceResult = textDiceResult;
	}

	public JTextField getTextPlayer1Piece1() {
		return textPlayer1Piece1;
	}

	public void setTextPlayer1Piece1(JTextField textPlayer1Piece1) {
		this.textPlayer1Piece1 = textPlayer1Piece1;
	}

	public JTextField getTextPlayer1Piece2() {
		return textPlayer1Piece2;
	}

	public void setTextPlayer1Piece2(JTextField textPlayer1Piece2) {
		this.textPlayer1Piece2 = textPlayer1Piece2;
	}

	public JTextField getTextPlayer1Piece3() {
		return textPlayer1Piece3;
	}

	public void setTextPlayer1Piece3(JTextField textPlayer1Piece3) {
		this.textPlayer1Piece3 = textPlayer1Piece3;
	}

	public JTextField getTextPlayer1Piece4() {
		return textPlayer1Piece4;
	}

	public void setTextPlayer1Piece4(JTextField textPlayer1Piece4) {
		this.textPlayer1Piece4 = textPlayer1Piece4;
	}

	public JTextField getTextPlayer2Piece1() {
		return textPlayer2Piece1;
	}

	public void setTextPlayer2Piece1(JTextField textPlayer2Piece1) {
		this.textPlayer2Piece1 = textPlayer2Piece1;
	}

	public JTextField getTextPlayer2Piece2() {
		return textPlayer2Piece2;
	}

	public void setTextPlayer2Piece2(JTextField textPlayer2Piece2) {
		this.textPlayer2Piece2 = textPlayer2Piece2;
	}

	public JTextField getTextPlayer2Piece3() {
		return textPlayer2Piece3;
	}

	public void setTextPlayer2Piece3(JTextField textPlayer2Piece3) {
		this.textPlayer2Piece3 = textPlayer2Piece3;
	}

	public JTextField getTextPlayer2Piece4() {
		return textPlayer2Piece4;
	}

	public void setTextPlayer2Piece4(JTextField textPlayer2Piece4) {
		this.textPlayer2Piece4 = textPlayer2Piece4;
	}

	public JTextField getTextPlayer3Piece1() {
		return textPlayer3Piece1;
	}

	public void setTextPlayer3Piece1(JTextField textPlayer3Piece1) {
		this.textPlayer3Piece1 = textPlayer3Piece1;
	}

	public JTextField getTextPlayer3Piece2() {
		return textPlayer3Piece2;
	}

	public void setTextPlayer3Piece2(JTextField textPlayer3Piece2) {
		this.textPlayer3Piece2 = textPlayer3Piece2;
	}

	public JTextField getTextPlayer3Piece3() {
		return textPlayer3Piece3;
	}

	public void setTextPlayer3Piece3(JTextField textPlayer3Piece3) {
		this.textPlayer3Piece3 = textPlayer3Piece3;
	}

	public JTextField getTextPlayer3Piece4() {
		return textPlayer3Piece4;
	}

	public void setTextPlayer3Piece4(JTextField textPlayer3Piece4) {
		this.textPlayer3Piece4 = textPlayer3Piece4;
	}

	public JTextField getTextPlayer4Piece1() {
		return textPlayer4Piece1;
	}

	public void setTextPlayer4Piece1(JTextField textPlayer4Piece1) {
		this.textPlayer4Piece1 = textPlayer4Piece1;
	}

	public JTextField getTextPlayer4Piece2() {
		return textPlayer4Piece2;
	}

	public void setTextPlayer4Piece2(JTextField textPlayer4Piece2) {
		this.textPlayer4Piece2 = textPlayer4Piece2;
	}

	public JTextField getTextPlayer4Piece3() {
		return textPlayer4Piece3;
	}

	public void setTextPlayer4Piece3(JTextField textPlayer4Piece3) {
		this.textPlayer4Piece3 = textPlayer4Piece3;
	}

	public JTextField getTextPlayer4Piece4() {
		return textPlayer4Piece4;
	}

	public void setTextPlayer4Piece4(JTextField textPlayer4Piece4) {
		this.textPlayer4Piece4 = textPlayer4Piece4;
	}

	public JLabel getLblPlayer1() {
		return lblPlayer1;
	}

	public void setLblPlayer1(JLabel lblPlayer1) {
		this.lblPlayer1 = lblPlayer1;
	}

	public JLabel getLblPlayer2() {
		return lblPlayer2;
	}

	public void setLblPlayer2(JLabel lblPlayer2) {
		this.lblPlayer2 = lblPlayer2;
	}

	public JLabel getLblPlayer3() {
		return lblPlayer3;
	}

	public void setLblPlayer3(JLabel lblPlayer3) {
		this.lblPlayer3 = lblPlayer3;
	}

	public JLabel getLblPlayer4() {
		return lblPlayer4;
	}

	public void setLblPlayer4(JLabel lblPlayer4) {
		this.lblPlayer4 = lblPlayer4;
	}
	
	public JLabel getLblPlaying1() {
		return lblPlaying1;
	}

	public void setLblPlaying1(JLabel lblPlaying1) {
		this.lblPlaying1 = lblPlaying1;
	}

	public JLabel getLblPlaying2() {
		return lblPlaying2;
	}

	public void setLblPlaying2(JLabel lblPlaying2) {
		this.lblPlaying2 = lblPlaying2;
	}

	public JLabel getLblPlaying3() {
		return lblPlaying3;
	}

	public void setLblPlaying3(JLabel lblPlaying3) {
		this.lblPlaying3 = lblPlaying3;
	}

	public JLabel getLblPlaying4() {
		return lblPlaying4;
	}

	public void setLblPlaying4(JLabel lblPlaying4) {
		this.lblPlaying4 = lblPlaying4;
	}

	public JLabel getLblResult() {
		return lblResult;
	}

	public void setLblResult(JLabel lblResult) {
		this.lblResult = lblResult;
	}
	public JButton getBtnCenter() {
		return btnCenter;
	}

	public void setBtnCenter(JButton btnCenter) {
		this.btnCenter = btnCenter;
	}

	public JButton getBtnWedgeWhite() {
		return btnWedgeWhite;
	}

	public void setBtnWedgeWhite(JButton btnWedgeWhite) {
		this.btnWedgeWhite = btnWedgeWhite;
	}

	public JButton getBtnMidColumn1() {
		return btnMidColumn1;
	}

	public void setBtnMidColumn1(JButton btnMidColumn1) {
		this.btnMidColumn1 = btnMidColumn1;
	}

	public JButton getBtnWedgeBlue() {
		return btnWedgeBlue;
	}

	public void setBtnWedgeBlue(JButton btnWedgeBlue) {
		this.btnWedgeBlue = btnWedgeBlue;
	}

	public JButton getBtnWedgeGreen() {
		return btnWedgeGreen;
	}

	public void setBtnWedgeGreen(JButton btnWedgeGreen) {
		this.btnWedgeGreen = btnWedgeGreen;
	}

	public JButton getBtnMidColumn2() {
		return btnMidColumn2;
	}

	public void setBtnMidColumn2(JButton btnMidColumn2) {
		this.btnMidColumn2 = btnMidColumn2;
	}

	public JButton getBtnMidColumn3() {
		return btnMidColumn3;
	}

	public void setBtnMidColumn3(JButton btnMidColumn3) {
		this.btnMidColumn3 = btnMidColumn3;
	}

	public JButton getBtnMidColumn4() {
		return btnMidColumn4;
	}

	public void setBtnMidColumn4(JButton btnMidColumn4) {
		this.btnMidColumn4 = btnMidColumn4;
	}

	public JButton getBtnMidColumn5() {
		return btnMidColumn5;
	}

	public void setBtnMidColumn5(JButton btnMidColumn5) {
		this.btnMidColumn5 = btnMidColumn5;
	}

	public JButton getBtnMidColumn6() {
		return btnMidColumn6;
	}

	public void setBtnMidColumn6(JButton btnMidColumn6) {
		this.btnMidColumn6 = btnMidColumn6;
	}

	public JButton getBtnMidColumn7() {
		return btnMidColumn7;
	}

	public void setBtnMidColumn7(JButton btnMidColumn7) {
		this.btnMidColumn7 = btnMidColumn7;
	}

	public JButton getBtnMidColumn8() {
		return btnMidColumn8;
	}

	public void setBtnMidColumn8(JButton btnMidColumn8) {
		this.btnMidColumn8 = btnMidColumn8;
	}

	public JButton getBtnWedgeRed() {
		return btnWedgeRed;
	}

	public void setBtnWedgeRed(JButton btnWedgeRed) {
		this.btnWedgeRed = btnWedgeRed;
	}

	public JButton getBtnRight8() {
		return btnRight8;
	}

	public void setBtnRight8(JButton btnRight8) {
		this.btnRight8 = btnRight8;
	}

	public JButton getBtnRight7() {
		return btnRight7;
	}

	public void setBtnRight7(JButton btnRight7) {
		this.btnRight7 = btnRight7;
	}

	public JButton getBtnRight6() {
		return btnRight6;
	}

	public void setBtnRight6(JButton btnRight6) {
		this.btnRight6 = btnRight6;
	}

	public JButton getBtnRight5() {
		return btnRight5;
	}

	public void setBtnRight5(JButton btnRight5) {
		this.btnRight5 = btnRight5;
	}

	public JButton getBtnRightRollAgain2() {
		return btnRightRollAgain2;
	}

	public void setBtnRightRollAgain2(JButton btnRightRollAgain2) {
		this.btnRightRollAgain2 = btnRightRollAgain2;
	}

	public JButton getBtnRight4() {
		return btnRight4;
	}

	public void setBtnRight4(JButton btnRight4) {
		this.btnRight4 = btnRight4;
	}

	public JButton getBtnRight3() {
		return btnRight3;
	}

	public void setBtnRight3(JButton btnRight3) {
		this.btnRight3 = btnRight3;
	}

	public JButton getBtnRight2() {
		return btnRight2;
	}

	public void setBtnRight2(JButton btnRight2) {
		this.btnRight2 = btnRight2;
	}

	public JButton getBtnMidRow5() {
		return btnMidRow5;
	}

	public void setBtnMidRow5(JButton btnMidRow5) {
		this.btnMidRow5 = btnMidRow5;
	}

	public JButton getBtnMidRow6() {
		return btnMidRow6;
	}

	public void setBtnMidRow6(JButton btnMidRow6) {
		this.btnMidRow6 = btnMidRow6;
	}

	public JButton getBtnMidRow7() {
		return btnMidRow7;
	}

	public void setBtnMidRow7(JButton btnMidRow7) {
		this.btnMidRow7 = btnMidRow7;
	}

	public JButton getBtnMidRow8() {
		return btnMidRow8;
	}

	public void setBtnMidRow8(JButton btnMidRow8) {
		this.btnMidRow8 = btnMidRow8;
	}

	public JButton getBtnRightRollAgain1() {
		return btnRightRollAgain1;
	}

	public void setBtnRightRollAgain1(JButton btnRightRollAgain1) {
		this.btnRightRollAgain1 = btnRightRollAgain1;
	}

	public JButton getBtnRight1() {
		return btnRight1;
	}

	public void setBtnRight1(JButton btnRight1) {
		this.btnRight1 = btnRight1;
	}

	public JButton getBtnMidRow4() {
		return btnMidRow4;
	}

	public void setBtnMidRow4(JButton btnMidRow4) {
		this.btnMidRow4 = btnMidRow4;
	}

	public JButton getBtnMidRow3() {
		return btnMidRow3;
	}

	public void setBtnMidRow3(JButton btnMidRow3) {
		this.btnMidRow3 = btnMidRow3;
	}

	public JButton getBtnMidRow2() {
		return btnMidRow2;
	}

	public void setBtnMidRow2(JButton btnMidRow2) {
		this.btnMidRow2 = btnMidRow2;
	}

	public JButton getBtnMidRow1() {
		return btnMidRow1;
	}

	public void setBtnMidRow1(JButton btnMidRow1) {
		this.btnMidRow1 = btnMidRow1;
	}

	public JButton getBtnLeft1() {
		return btnLeft1;
	}

	public void setBtnLeft1(JButton btnLeft1) {
		this.btnLeft1 = btnLeft1;
	}

	public JButton getBtnLeft2() {
		return btnLeft2;
	}

	public void setBtnLeft2(JButton btnLeft2) {
		this.btnLeft2 = btnLeft2;
	}

	public JButton getBtnLeft3() {
		return btnLeft3;
	}

	public void setBtnLeft3(JButton btnLeft3) {
		this.btnLeft3 = btnLeft3;
	}

	public JButton getBtnLeft4() {
		return btnLeft4;
	}

	public void setBtnLeft4(JButton btnLeft4) {
		this.btnLeft4 = btnLeft4;
	}

	public JButton getBtnLeft5() {
		return btnLeft5;
	}

	public void setBtnLeft5(JButton btnLeft5) {
		this.btnLeft5 = btnLeft5;
	}

	public JButton getBtnLeft6() {
		return btnLeft6;
	}

	public void setBtnLeft6(JButton btnLeft6) {
		this.btnLeft6 = btnLeft6;
	}

	public JButton getBtnLeftRollAgain1() {
		return btnLeftRollAgain1;
	}

	public void setBtnLeftRollAgain1(JButton btnLeftRollAgain1) {
		this.btnLeftRollAgain1 = btnLeftRollAgain1;
	}

	public JButton getBtnLeft7() {
		return btnLeft7;
	}

	public void setBtnLeft7(JButton btnLeft7) {
		this.btnLeft7 = btnLeft7;
	}

	public JButton getBtnLeft8() {
		return btnLeft8;
	}

	public void setBtnLeft8(JButton btnLeft8) {
		this.btnLeft8 = btnLeft8;
	}

	public JButton getBtnLeftRollAgain2() {
		return btnLeftRollAgain2;
	}

	public void setBtnLeftRollAgain2(JButton btnLeftRollAgain2) {
		this.btnLeftRollAgain2 = btnLeftRollAgain2;
	}

	public JButton getBtnBottom1() {
		return btnBottom1;
	}

	public void setBtnBottom1(JButton btnBottom1) {
		this.btnBottom1 = btnBottom1;
	}

	public JButton getBtnBottom2() {
		return btnBottom2;
	}

	public void setBtnBottom2(JButton btnBottom2) {
		this.btnBottom2 = btnBottom2;
	}

	public JButton getBtnBottomRollAgain1() {
		return btnBottomRollAgain1;
	}

	public void setBtnBottomRollAgain1(JButton btnBottomRollAgain1) {
		this.btnBottomRollAgain1 = btnBottomRollAgain1;
	}

	public JButton getBtnBottom3() {
		return btnBottom3;
	}

	public void setBtnBottom3(JButton btnBottom3) {
		this.btnBottom3 = btnBottom3;
	}

	public JButton getBtnBottom4() {
		return btnBottom4;
	}

	public void setBtnBottom4(JButton btnBottom4) {
		this.btnBottom4 = btnBottom4;
	}

	public JButton getBtnBottom5() {
		return btnBottom5;
	}

	public void setBtnBottom5(JButton btnBottom5) {
		this.btnBottom5 = btnBottom5;
	}

	public JButton getBtnBottomRollAgain2() {
		return btnBottomRollAgain2;
	}

	public void setBtnBottomRollAgain2(JButton btnBottomRollAgain2) {
		this.btnBottomRollAgain2 = btnBottomRollAgain2;
	}

	public JButton getBtnBottom6() {
		return btnBottom6;
	}

	public void setBtnBottom6(JButton btnBottom6) {
		this.btnBottom6 = btnBottom6;
	}

	public JButton getBtnBottom7() {
		return btnBottom7;
	}

	public void setBtnBottom7(JButton btnBottom7) {
		this.btnBottom7 = btnBottom7;
	}

	public JButton getBtnBottom8() {
		return btnBottom8;
	}

	public void setBtnBottom8(JButton btnBottom8) {
		this.btnBottom8 = btnBottom8;
	}

	public JButton getBtnTop1() {
		return btnTop1;
	}

	public void setBtnTop1(JButton btnTop1) {
		this.btnTop1 = btnTop1;
	}

	public JButton getBtnTop2() {
		return btnTop2;
	}

	public void setBtnTop2(JButton btnTop2) {
		this.btnTop2 = btnTop2;
	}

	public JButton getBtnTopRollAgain1() {
		return btnTopRollAgain1;
	}

	public void setBtnTopRollAgain1(JButton btnTopRollAgain1) {
		this.btnTopRollAgain1 = btnTopRollAgain1;
	}

	public JButton getBtnTop3() {
		return btnTop3;
	}

	public void setBtnTop3(JButton btnTop3) {
		this.btnTop3 = btnTop3;
	}

	public JButton getBtnTop4() {
		return btnTop4;
	}

	public void setBtnTop4(JButton btnTop4) {
		this.btnTop4 = btnTop4;
	}

	public JButton getBtnTop5() {
		return btnTop5;
	}

	public void setBtnTop5(JButton btnTop5) {
		this.btnTop5 = btnTop5;
	}

	public JButton getBtnTop6() {
		return btnTop6;
	}

	public void setBtnTop6(JButton btnTop6) {
		this.btnTop6 = btnTop6;
	}

	public JButton getBtnTopRollAgain2() {
		return btnTopRollAgain2;
	}

	public void setBtnTopRollAgain2(JButton btnTopRollAgain2) {
		this.btnTopRollAgain2 = btnTopRollAgain2;
	}

	public JButton getBtnTop7() {
		return btnTop7;
	}

	public void setBtnTop7(JButton btnTop7) {
		this.btnTop7 = btnTop7;
	}

	public JButton getBtnTop8() {
		return btnTop8;
	}

	public void setBtnTop8(JButton btnTop8) {
		this.btnTop8 = btnTop8;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}
	

	private JTextField textPlayer1Piece1;
	private JTextField textPlayer1Piece2;
	private JTextField textPlayer1Piece3;
	private JTextField textPlayer1Piece4;
	private JTextField textPlayer2Piece1;
	private JTextField textPlayer2Piece2;
	private JTextField textPlayer2Piece3;
	private JTextField textPlayer2Piece4;
	private JTextField textPlayer3Piece1;
	private JTextField textPlayer3Piece2;
	private JTextField textPlayer3Piece3;
	private JTextField textPlayer3Piece4;
	private JTextField textPlayer4Piece1;
	private JTextField textPlayer4Piece2;
	private JTextField textPlayer4Piece3;
	private JTextField textPlayer4Piece4;
	
	
	private JLabel lblPlayer1Name;
	private JLabel lblPlayer2Name;
	private JLabel lblPlayer3Name;
	private JLabel lblPlayer4Name;
	

	
	private JLabel lblPlaying1;
	private JLabel lblPlaying2;
	private JLabel lblPlaying3;
	private JLabel lblPlaying4;


	private JLabel lblPlayer1;
	private JLabel lblPlayer2;
	private JLabel lblPlayer3;
	private JLabel lblPlayer4;
	
	private JLabel lblResult;
	
	
	private JFrame frmView;
	
	
	

	private JButton btnCenter;
	private JButton btnWedgeWhite;
	private JButton btnMidColumn1;
	private JButton btnWedgeBlue;	
	private JButton btnWedgeGreen;	
	private JButton btnMidColumn2;	
	private JButton btnMidColumn3;	
	private JButton btnMidColumn4;
	private JButton btnMidColumn5;
	private JButton btnMidColumn6;
	private JButton btnMidColumn7;
	private JButton btnMidColumn8;
	private JButton btnWedgeRed;
	private JButton btnRight8;
	private JButton btnRight7;
	private JButton btnRight6;
	private JButton btnRight5;
	private JButton btnRightRollAgain2;
	private JButton btnRight4;
	private JButton btnRight3;
	private JButton btnRight2;
	private JButton btnMidRow5;
	private JButton btnMidRow6;
	private JButton btnMidRow7;
	private JButton btnMidRow8;
	private JButton btnRightRollAgain1;
	private JButton btnRight1;
	private JButton btnMidRow4;
	private JButton btnMidRow3;
	private JButton btnMidRow2;
	private JButton btnMidRow1;
	private JButton btnLeft1;
	private JButton btnLeft2;
	private JButton btnLeft3;
	private JButton btnLeft4;
	private JButton btnLeft5;
	private JButton btnLeft6;
	private JButton btnLeftRollAgain1;
	private JButton btnLeft7;
	private JButton btnLeft8;
	private JButton btnLeftRollAgain2;
	private JButton btnBottom1;
	private JButton btnBottom2;
	private JButton btnBottomRollAgain1;
	private JButton btnBottom3;
	private JButton btnBottom4;
	private JButton btnBottom5;
	private JButton btnBottomRollAgain2;
	private JButton btnBottom6;
	private JButton btnBottom7;
	private JButton btnBottom8;
	private JButton btnTop1;
	private JButton btnTop2;
	private JButton btnTopRollAgain1;
	private JButton btnTop3;
	private JButton btnTop4;
	private JButton btnTop5;
	private JButton btnTop6;
	private JButton btnTopRollAgain2;
	private JButton btnTop7;
	private JButton btnTop8;
	
	

	private JTextArea messageTextArea;
	

	private JButton btnSetUpPlayers;
	private JButton btnExitGame;
	

	private JButton btnRollDice;

	
	private JTextField textDiceResult;
	
	
	private Board board;
	
}
