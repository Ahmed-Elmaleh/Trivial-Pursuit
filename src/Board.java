
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.SystemColor;


public class Board{

	

	/**
	 * Create the application.
	 */
	public void CreateBoard() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Board window = new Board();
					window.frmBoard.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		

	}

	/**
	 * Create the application.
	 */
	public Board() {
		
	
		initialize();
	}
	
	private void initialize() {
		frmBoard = new JFrame();
		frmBoard.getContentPane().setBackground(SystemColor.window);
		frmBoard.setTitle("Trivial Purfuit");
		frmBoard.setBounds(100, 100, 1102, 845);
		frmBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBoard.getContentPane().setLayout(null);
		
		welcome();
	}
	
	private void welcome() {
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setText("Welcome to Trivial Purfuit! To start the game, "
				+ "click the \"START GAME\" button. You will be asked to "
				+ "prived the number of players. To start your move, click"
				+ " on \"ROLL DICE\" button. Then decide where you would like "
				+ "to move by clicking your choice on the board, either "
				+ "clockwise or counter-clockwise. Answer the question. then"
				+ " click \"OK\" button. If you land on a wedge tile, you have "
				+ "opportunity to play for a wedge. To get a wedge, you have to "
				+ "asnwer the wedge question correctly. The first player to go"
				+ " around the board and get all the wedges will be allowed to "
				+ "go to the middle of the board. The first player to answer a"
				+ " question from the center of the board wins the game.\n\nGood luck!");
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Dialog", Font.ITALIC, 16));
		textArea.setBackground(SystemColor.window);
		textArea.setBounds(147, 196, 848, 199);
		frmBoard.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("START GAME");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmBoard.getContentPane().removeAll();
				frmBoard.repaint();
				
				gameBoard();
			}
		});
		
		btnNewButton.setBounds(465, 462, 225, 93);
		frmBoard.getContentPane().add(btnNewButton);
	}

	/**
	 * Create game board
	 */
	private void gameBoard() {

		
		
		JButton btnNewButton_1 = new JButton("Trivial Purfuit");
		btnNewButton_1.setBounds(295, 310, 180, 176);
		frmBoard.getContentPane().add(btnNewButton_1);
		
		JButton btnWedge = new JButton("WEDGE");
		btnWedge.setBackground(Color.WHITE);
		btnWedge.setBounds(12, 24, 84, 84);
		frmBoard.getContentPane().add(btnWedge);
		
		JButton btnRagain = new JButton("");
		btnRagain.setBackground(Color.GREEN);
		btnRagain.setToolTipText("");
		btnRagain.setHorizontalAlignment(SwingConstants.LEFT);
		btnRagain.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRagain.setBounds(354, 81, 58, 58);
		frmBoard.getContentPane().add(btnRagain);
		
		JButton button_10 = new JButton("WEDGE");
		button_10.setBackground(Color.BLUE);
		button_10.setBounds(12, 688, 84, 84);
		frmBoard.getContentPane().add(button_10);
		
		JButton button_20 = new JButton("WEDGE");
		button_20.setBackground(Color.GREEN);
		button_20.setBounds(674, 688, 84, 84);
		frmBoard.getContentPane().add(button_20);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(Color.BLUE);
		button_1.setToolTipText("");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_1.setBounds(354, 137, 58, 58);
		frmBoard.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(Color.RED);
		button_2.setToolTipText("");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_2.setBounds(354, 195, 58, 58);
		frmBoard.getContentPane().add(button_2);
		
		JButton button_6 = new JButton("");
		button_6.setBackground(Color.WHITE);
		button_6.setToolTipText("");
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_6.setBounds(354, 252, 58, 58);
		frmBoard.getContentPane().add(button_6);
		
		JButton button = new JButton("");
		button.setBackground(Color.RED);
		button.setToolTipText("");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setFont(new Font("Dialog", Font.PLAIN, 7));
		button.setBounds(360, 486, 58, 58);
		frmBoard.getContentPane().add(button);
		
		JButton button_3 = new JButton("");
		button_3.setBackground(Color.GREEN);
		button_3.setToolTipText("");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_3.setBounds(360, 543, 58, 58);
		frmBoard.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(Color.BLUE);
		button_4.setToolTipText("");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_4.setBounds(360, 598, 58, 58);
		frmBoard.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBackground(Color.WHITE);
		button_5.setToolTipText("");
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_5.setBounds(360, 656, 58, 58);
		frmBoard.getContentPane().add(button_5);
		
		JButton btnPlayer_2 = new JButton("WEDGE");
		btnPlayer_2.setBackground(Color.RED);
		btnPlayer_2.setBounds(674, 24, 84, 84);
		frmBoard.getContentPane().add(btnPlayer_2);
		
		JButton button_8 = new JButton("");
		button_8.setBackground(Color.BLUE);
		button_8.setToolTipText("");
		button_8.setHorizontalAlignment(SwingConstants.LEFT);
		button_8.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_8.setBounds(700, 628, 58, 60);
		frmBoard.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBackground(Color.RED);
		button_9.setToolTipText("");
		button_9.setHorizontalAlignment(SwingConstants.LEFT);
		button_9.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_9.setBounds(700, 572, 58, 59);
		frmBoard.getContentPane().add(button_9);
		
		JButton button_11 = new JButton("");
		button_11.setBackground(Color.GREEN);
		button_11.setToolTipText("");
		button_11.setHorizontalAlignment(SwingConstants.LEFT);
		button_11.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_11.setBounds(700, 513, 58, 60);
		frmBoard.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBackground(Color.WHITE);
		button_12.setToolTipText("");
		button_12.setHorizontalAlignment(SwingConstants.LEFT);
		button_12.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_12.setBounds(700, 454, 58, 60);
		frmBoard.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("RAgain");
		button_13.setToolTipText("");
		button_13.setHorizontalAlignment(SwingConstants.LEFT);
		button_13.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_13.setBounds(700, 395, 58, 60);
		frmBoard.getContentPane().add(button_13);
		
		JButton btnPl = new JButton("PL2");
		btnPl.setForeground(Color.YELLOW);
		btnPl.setBackground(Color.WHITE);
		btnPl.setToolTipText("");
		btnPl.setHorizontalAlignment(SwingConstants.LEFT);
		btnPl.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnPl.setBounds(700, 336, 58, 60);
		frmBoard.getContentPane().add(btnPl);
		
		JButton button_15 = new JButton("");
		button_15.setBackground(Color.RED);
		button_15.setToolTipText("");
		button_15.setHorizontalAlignment(SwingConstants.LEFT);
		button_15.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_15.setBounds(700, 277, 58, 60);
		frmBoard.getContentPane().add(button_15);
		
		JButton btnPlayer_1 = new JButton("");
		btnPlayer_1.setForeground(Color.YELLOW);
		btnPlayer_1.setBackground(Color.BLUE);
		btnPlayer_1.setToolTipText("");
		btnPlayer_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlayer_1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnPlayer_1.setBounds(700, 218, 58, 60);
		frmBoard.getContentPane().add(btnPlayer_1);
		
		JButton button_38 = new JButton("");
		button_38.setBackground(Color.BLUE);
		button_38.setToolTipText("");
		button_38.setHorizontalAlignment(SwingConstants.LEFT);
		button_38.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_38.setBounds(472, 368, 58, 58);
		frmBoard.getContentPane().add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setBackground(Color.GREEN);
		button_39.setToolTipText("");
		button_39.setHorizontalAlignment(SwingConstants.LEFT);
		button_39.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_39.setBounds(528, 368, 58, 58);
		frmBoard.getContentPane().add(button_39);
		
		JButton button_40 = new JButton("");
		button_40.setBackground(Color.RED);
		button_40.setToolTipText("");
		button_40.setHorizontalAlignment(SwingConstants.LEFT);
		button_40.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_40.setBounds(585, 368, 58, 58);
		frmBoard.getContentPane().add(button_40);
		
		JButton button_41 = new JButton("");
		button_41.setBackground(Color.WHITE);
		button_41.setToolTipText("");
		button_41.setHorizontalAlignment(SwingConstants.LEFT);
		button_41.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_41.setBounds(642, 368, 58, 58);
		frmBoard.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("RAgain");
		button_42.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_42.setToolTipText("");
		button_42.setHorizontalAlignment(SwingConstants.LEFT);
		button_42.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_42.setBounds(700, 162, 58, 58);
		frmBoard.getContentPane().add(button_42);
		
		JButton button_43 = new JButton("");
		button_43.setBackground(Color.GREEN);
		button_43.setToolTipText("");
		button_43.setHorizontalAlignment(SwingConstants.LEFT);
		button_43.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_43.setBounds(700, 108, 58, 58);
		frmBoard.getContentPane().add(button_43);
		
		JButton button_44 = new JButton("");
		button_44.setBackground(Color.GREEN);
		button_44.setToolTipText("");
		button_44.setHorizontalAlignment(SwingConstants.LEFT);
		button_44.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_44.setBounds(239, 361, 58, 58);
		frmBoard.getContentPane().add(button_44);
		
		JButton button_45 = new JButton("");
		button_45.setBackground(Color.WHITE);
		button_45.setToolTipText("");
		button_45.setHorizontalAlignment(SwingConstants.LEFT);
		button_45.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_45.setBounds(183, 361, 58, 58);
		frmBoard.getContentPane().add(button_45);
		
		JButton button_46 = new JButton("");
		button_46.setBackground(Color.BLUE);
		button_46.setToolTipText("");
		button_46.setHorizontalAlignment(SwingConstants.LEFT);
		button_46.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_46.setBounds(126, 361, 58, 58);
		frmBoard.getContentPane().add(button_46);
		
		JButton button_47 = new JButton("");
		button_47.setBackground(Color.RED);
		button_47.setToolTipText("");
		button_47.setHorizontalAlignment(SwingConstants.LEFT);
		button_47.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_47.setBounds(69, 361, 58, 58);
		frmBoard.getContentPane().add(button_47);
		
		JButton button_17 = new JButton("");
		button_17.setBackground(Color.BLUE);
		button_17.setToolTipText("");
		button_17.setHorizontalAlignment(SwingConstants.LEFT);
		button_17.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_17.setBounds(12, 104, 58, 60);
		frmBoard.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBackground(Color.RED);
		button_18.setToolTipText("");
		button_18.setHorizontalAlignment(SwingConstants.LEFT);
		button_18.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_18.setBounds(12, 163, 58, 59);
		frmBoard.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBackground(Color.GREEN);
		button_19.setToolTipText("");
		button_19.setHorizontalAlignment(SwingConstants.LEFT);
		button_19.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_19.setBounds(12, 218, 58, 60);
		frmBoard.getContentPane().add(button_19);
		
		JButton button_21 = new JButton("");
		button_21.setBackground(Color.WHITE);
		button_21.setToolTipText("");
		button_21.setHorizontalAlignment(SwingConstants.LEFT);
		button_21.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_21.setBounds(12, 277, 58, 60);
		frmBoard.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBackground(Color.RED);
		button_22.setToolTipText("");
		button_22.setHorizontalAlignment(SwingConstants.LEFT);
		button_22.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_22.setBounds(12, 334, 58, 61);
		frmBoard.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBackground(Color.BLUE);
		button_23.setToolTipText("");
		button_23.setHorizontalAlignment(SwingConstants.LEFT);
		button_23.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_23.setBounds(12, 394, 58, 61);
		frmBoard.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("RAgain");
		button_24.setToolTipText("");
		button_24.setHorizontalAlignment(SwingConstants.LEFT);
		button_24.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_24.setBounds(12, 451, 58, 61);
		frmBoard.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBackground(Color.WHITE);
		button_25.setToolTipText("");
		button_25.setHorizontalAlignment(SwingConstants.LEFT);
		button_25.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_25.setBounds(12, 511, 58, 60);
		frmBoard.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBackground(Color.GREEN);
		button_26.setToolTipText("");
		button_26.setHorizontalAlignment(SwingConstants.LEFT);
		button_26.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_26.setBounds(12, 570, 58, 60);
		frmBoard.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("RAgain");
		button_27.setToolTipText("");
		button_27.setHorizontalAlignment(SwingConstants.LEFT);
		button_27.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_27.setBounds(12, 628, 58, 60);
		frmBoard.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setBackground(Color.GREEN);
		button_28.setToolTipText("");
		button_28.setHorizontalAlignment(SwingConstants.LEFT);
		button_28.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_28.setBounds(96, 714, 60, 58);
		frmBoard.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBackground(Color.BLUE);
		button_29.setToolTipText("");
		button_29.setHorizontalAlignment(SwingConstants.LEFT);
		button_29.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_29.setBounds(155, 714, 60, 58);
		frmBoard.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("RAgain");
		button_30.setToolTipText("");
		button_30.setHorizontalAlignment(SwingConstants.LEFT);
		button_30.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_30.setBounds(214, 714, 60, 58);
		frmBoard.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("");
		button_31.setBackground(Color.WHITE);
		button_31.setToolTipText("");
		button_31.setHorizontalAlignment(SwingConstants.LEFT);
		button_31.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_31.setBounds(272, 714, 60, 58);
		frmBoard.getContentPane().add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setBackground(Color.RED);
		button_32.setToolTipText("");
		button_32.setHorizontalAlignment(SwingConstants.LEFT);
		button_32.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_32.setBounds(330, 714, 60, 58);
		frmBoard.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.setBackground(Color.GREEN);
		button_33.setToolTipText("");
		button_33.setHorizontalAlignment(SwingConstants.LEFT);
		button_33.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_33.setBounds(389, 714, 60, 58);
		frmBoard.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("RAgain");
		button_34.setToolTipText("");
		button_34.setHorizontalAlignment(SwingConstants.LEFT);
		button_34.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_34.setBounds(447, 714, 60, 58);
		frmBoard.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setBackground(Color.RED);
		button_35.setToolTipText("");
		button_35.setHorizontalAlignment(SwingConstants.LEFT);
		button_35.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_35.setBounds(505, 714, 60, 58);
		frmBoard.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.setBackground(Color.BLUE);
		button_36.setToolTipText("");
		button_36.setHorizontalAlignment(SwingConstants.LEFT);
		button_36.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_36.setBounds(562, 714, 60, 58);
		frmBoard.getContentPane().add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setBackground(Color.WHITE);
		button_37.setToolTipText("");
		button_37.setHorizontalAlignment(SwingConstants.LEFT);
		button_37.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_37.setBounds(616, 714, 60, 58);
		frmBoard.getContentPane().add(button_37);
		
		JButton button_48 = new JButton("");
		button_48.setBackground(Color.RED);
		button_48.setToolTipText("");
		button_48.setHorizontalAlignment(SwingConstants.LEFT);
		button_48.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_48.setBounds(95, 24, 60, 58);
		frmBoard.getContentPane().add(button_48);
		
		JButton button_49 = new JButton("");
		button_49.setBackground(Color.BLUE);
		button_49.setToolTipText("");
		button_49.setHorizontalAlignment(SwingConstants.LEFT);
		button_49.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_49.setBounds(153, 24, 60, 58);
		frmBoard.getContentPane().add(button_49);
		
		JButton button_50 = new JButton("RAgain");
		button_50.setToolTipText("");
		button_50.setHorizontalAlignment(SwingConstants.LEFT);
		button_50.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_50.setBounds(212, 24, 60, 58);
		frmBoard.getContentPane().add(button_50);
		
		JButton button_51 = new JButton("");
		button_51.setBackground(Color.RED);
		button_51.setToolTipText("");
		button_51.setHorizontalAlignment(SwingConstants.LEFT);
		button_51.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_51.setBounds(270, 24, 60, 58);
		frmBoard.getContentPane().add(button_51);
		
		JButton btnRa = new JButton("");
		btnRa.setBackground(Color.WHITE);
		btnRa.setToolTipText("");
		btnRa.setHorizontalAlignment(SwingConstants.LEFT);
		btnRa.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRa.setBounds(328, 24, 58, 58);
		frmBoard.getContentPane().add(btnRa);
		
		JButton button_53 = new JButton("");
		button_53.setBackground(Color.GREEN);
		button_53.setToolTipText("");
		button_53.setHorizontalAlignment(SwingConstants.LEFT);
		button_53.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_53.setBounds(385, 24, 58, 58);
		frmBoard.getContentPane().add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setBackground(Color.BLUE);
		button_54.setToolTipText("");
		button_54.setHorizontalAlignment(SwingConstants.LEFT);
		button_54.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_54.setBounds(442, 24, 58, 58);
		frmBoard.getContentPane().add(button_54);
		
		JButton button_55 = new JButton("RAgain");
		button_55.setToolTipText("");
		button_55.setHorizontalAlignment(SwingConstants.LEFT);
		button_55.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_55.setBounds(499, 24, 58, 58);
		frmBoard.getContentPane().add(button_55);
		
		JButton btnPlayer = new JButton("");
		btnPlayer.setForeground(Color.YELLOW);
		btnPlayer.setBackground(Color.GREEN);
		btnPlayer.setToolTipText("");
		btnPlayer.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlayer.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnPlayer.setBounds(556, 24, 60, 58);
		frmBoard.getContentPane().add(btnPlayer);
		
		JButton button_57 = new JButton("");
		button_57.setBackground(Color.WHITE);
		button_57.setToolTipText("");
		button_57.setHorizontalAlignment(SwingConstants.LEFT);
		button_57.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_57.setBounds(615, 24, 60, 58);
		frmBoard.getContentPane().add(button_57);
		
		
		JButton btnExitGame = new JButton("EXIT GAME");
		btnExitGame.setBackground(Color.RED);
		btnExitGame.setBounds(806, 714, 135, 58);
		frmBoard.getContentPane().add(btnExitGame);
		
	
		
	
		
	}
	private JFrame frmBoard;
}

