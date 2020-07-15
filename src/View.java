import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View {
	
	public View() {
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
		
		

	
		
		btnSetUpPlayers = new JButton("SET UP PLAYERS");
		btnSetUpPlayers.setFont(new Font("Dialog", Font.BOLD, 16));
		btnSetUpPlayers.setBounds(806, 24, 189, 58);
		frmView.getContentPane().add(btnSetUpPlayers);
		
		
		btnRollDice = new JButton("ROLL DICE");
		btnRollDice.setFont(new Font("Dialog", Font.BOLD, 16));
		btnRollDice.setBounds(809, 24, 189, 58);
		btnRollDice.setVisible(false);
		frmView.getContentPane().add(btnRollDice);
		
		
		JButton btnExitGame = new JButton("EXIT GAME");
		btnExitGame.setBackground(Color.RED);
		btnExitGame.setBounds(806, 714, 135, 58);
		frmView.getContentPane().add(btnExitGame);
		
		
		
		
		
		JButton btnNewButton_1 = new JButton("Trivial Purfuit");
		btnNewButton_1.setBounds(295, 310, 180, 176);
		frmView.getContentPane().add(btnNewButton_1);
		
		JButton btnWedge = new JButton("WEDGE");
		btnWedge.setBackground(Color.WHITE);
		btnWedge.setBounds(12, 24, 84, 84);
		frmView.getContentPane().add(btnWedge);
		
		JButton btnRagain = new JButton("");
		btnRagain.setBackground(Color.GREEN);
		btnRagain.setToolTipText("");
		btnRagain.setHorizontalAlignment(SwingConstants.LEFT);
		btnRagain.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRagain.setBounds(354, 81, 58, 58);
		frmView.getContentPane().add(btnRagain);
		
		JButton button_10 = new JButton("WEDGE");
		button_10.setBackground(Color.BLUE);
		button_10.setBounds(12, 688, 84, 84);
		frmView.getContentPane().add(button_10);
		
		JButton button_20 = new JButton("WEDGE");
		button_20.setBackground(Color.GREEN);
		button_20.setBounds(674, 688, 84, 84);
		frmView.getContentPane().add(button_20);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(Color.BLUE);
		button_1.setToolTipText("");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_1.setBounds(353, 137, 60, 58);
		frmView.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(Color.RED);
		button_2.setToolTipText("");
		button_2.setHorizontalAlignment(SwingConstants.LEFT);
		button_2.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_2.setBounds(354, 195, 58, 58);
		frmView.getContentPane().add(button_2);
		
		JButton button_6 = new JButton("");
		button_6.setBackground(Color.WHITE);
		button_6.setToolTipText("");
		button_6.setHorizontalAlignment(SwingConstants.LEFT);
		button_6.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_6.setBounds(354, 252, 58, 58);
		frmView.getContentPane().add(button_6);
		
		JButton button = new JButton("");
		button.setBackground(Color.RED);
		button.setToolTipText("");
		button.setHorizontalAlignment(SwingConstants.LEFT);
		button.setFont(new Font("Dialog", Font.PLAIN, 7));
		button.setBounds(360, 486, 58, 58);
		frmView.getContentPane().add(button);
		
		JButton button_3 = new JButton("");
		button_3.setBackground(Color.GREEN);
		button_3.setToolTipText("");
		button_3.setHorizontalAlignment(SwingConstants.LEFT);
		button_3.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_3.setBounds(360, 543, 58, 58);
		frmView.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(Color.BLUE);
		button_4.setToolTipText("");
		button_4.setHorizontalAlignment(SwingConstants.LEFT);
		button_4.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_4.setBounds(360, 598, 58, 58);
		frmView.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBackground(Color.WHITE);
		button_5.setToolTipText("");
		button_5.setHorizontalAlignment(SwingConstants.LEFT);
		button_5.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_5.setBounds(360, 656, 58, 58);
		frmView.getContentPane().add(button_5);
		
		JButton btnPlayer_2 = new JButton("WEDGE");
		btnPlayer_2.setBackground(Color.RED);
		btnPlayer_2.setBounds(674, 24, 84, 84);
		frmView.getContentPane().add(btnPlayer_2);
		
		JButton button_8 = new JButton("");
		button_8.setBackground(Color.BLUE);
		button_8.setToolTipText("");
		button_8.setHorizontalAlignment(SwingConstants.LEFT);
		button_8.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_8.setBounds(699, 628, 60, 60);
		frmView.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBackground(Color.RED);
		button_9.setToolTipText("");
		button_9.setHorizontalAlignment(SwingConstants.LEFT);
		button_9.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_9.setBounds(700, 572, 58, 59);
		frmView.getContentPane().add(button_9);
		
		JButton button_11 = new JButton("");
		button_11.setBackground(Color.GREEN);
		button_11.setToolTipText("");
		button_11.setHorizontalAlignment(SwingConstants.LEFT);
		button_11.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_11.setBounds(700, 513, 58, 60);
		frmView.getContentPane().add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBackground(Color.WHITE);
		button_12.setToolTipText("");
		button_12.setHorizontalAlignment(SwingConstants.LEFT);
		button_12.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_12.setBounds(700, 454, 58, 60);
		frmView.getContentPane().add(button_12);
		
		JButton button_13 = new JButton("RAgain");
		button_13.setToolTipText("");
		button_13.setHorizontalAlignment(SwingConstants.LEFT);
		button_13.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_13.setBounds(700, 395, 58, 60);
		frmView.getContentPane().add(button_13);
		
		JButton btnPl = new JButton("");
		btnPl.setForeground(Color.YELLOW);
		btnPl.setBackground(Color.WHITE);
		btnPl.setToolTipText("");
		btnPl.setHorizontalAlignment(SwingConstants.LEFT);
		btnPl.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnPl.setBounds(700, 336, 58, 60);
		frmView.getContentPane().add(btnPl);
		
		JButton button_15 = new JButton("");
		button_15.setBackground(Color.RED);
		button_15.setToolTipText("");
		button_15.setHorizontalAlignment(SwingConstants.LEFT);
		button_15.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_15.setBounds(700, 277, 58, 60);
		frmView.getContentPane().add(button_15);
		
		JButton btnPlayer_1 = new JButton("");
		btnPlayer_1.setForeground(Color.YELLOW);
		btnPlayer_1.setBackground(Color.BLUE);
		btnPlayer_1.setToolTipText("");
		btnPlayer_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlayer_1.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnPlayer_1.setBounds(699, 218, 60, 60);
		frmView.getContentPane().add(btnPlayer_1);
		
		JButton button_38 = new JButton("");
		button_38.setBackground(Color.BLUE);
		button_38.setToolTipText("");
		button_38.setHorizontalAlignment(SwingConstants.LEFT);
		button_38.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_38.setBounds(472, 368, 58, 58);
		frmView.getContentPane().add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setBackground(Color.GREEN);
		button_39.setToolTipText("");
		button_39.setHorizontalAlignment(SwingConstants.LEFT);
		button_39.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_39.setBounds(528, 368, 58, 58);
		frmView.getContentPane().add(button_39);
		
		JButton button_40 = new JButton("");
		button_40.setBackground(Color.RED);
		button_40.setToolTipText("");
		button_40.setHorizontalAlignment(SwingConstants.LEFT);
		button_40.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_40.setBounds(585, 368, 58, 58);
		frmView.getContentPane().add(button_40);
		
		JButton button_41 = new JButton("");
		button_41.setBackground(Color.WHITE);
		button_41.setToolTipText("");
		button_41.setHorizontalAlignment(SwingConstants.LEFT);
		button_41.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_41.setBounds(642, 368, 58, 58);
		frmView.getContentPane().add(button_41);
		
		JButton button_42 = new JButton("RAgain");
		button_42.setToolTipText("");
		button_42.setHorizontalAlignment(SwingConstants.LEFT);
		button_42.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_42.setBounds(700, 162, 58, 58);
		frmView.getContentPane().add(button_42);
		
		JButton button_43 = new JButton("");
		button_43.setBackground(Color.GREEN);
		button_43.setToolTipText("");
		button_43.setHorizontalAlignment(SwingConstants.LEFT);
		button_43.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_43.setBounds(700, 108, 58, 58);
		frmView.getContentPane().add(button_43);
		
		JButton button_44 = new JButton("");
		button_44.setBackground(Color.GREEN);
		button_44.setToolTipText("");
		button_44.setHorizontalAlignment(SwingConstants.LEFT);
		button_44.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_44.setBounds(239, 361, 58, 58);
		frmView.getContentPane().add(button_44);
		
		JButton button_45 = new JButton("");
		button_45.setBackground(Color.WHITE);
		button_45.setToolTipText("");
		button_45.setHorizontalAlignment(SwingConstants.LEFT);
		button_45.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_45.setBounds(183, 361, 58, 58);
		frmView.getContentPane().add(button_45);
		
		JButton button_46 = new JButton("");
		button_46.setBackground(Color.BLUE);
		button_46.setToolTipText("");
		button_46.setHorizontalAlignment(SwingConstants.LEFT);
		button_46.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_46.setBounds(126, 361, 58, 58);
		frmView.getContentPane().add(button_46);
		
		JButton button_47 = new JButton("");
		button_47.setBackground(Color.RED);
		button_47.setToolTipText("");
		button_47.setHorizontalAlignment(SwingConstants.LEFT);
		button_47.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_47.setBounds(69, 361, 58, 58);
		frmView.getContentPane().add(button_47);
		
		JButton button_17 = new JButton("");
		button_17.setBackground(Color.BLUE);
		button_17.setToolTipText("");
		button_17.setHorizontalAlignment(SwingConstants.LEFT);
		button_17.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_17.setBounds(12, 104, 58, 60);
		frmView.getContentPane().add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBackground(Color.RED);
		button_18.setToolTipText("");
		button_18.setHorizontalAlignment(SwingConstants.LEFT);
		button_18.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_18.setBounds(12, 163, 58, 59);
		frmView.getContentPane().add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBackground(Color.GREEN);
		button_19.setToolTipText("");
		button_19.setHorizontalAlignment(SwingConstants.LEFT);
		button_19.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_19.setBounds(12, 218, 58, 60);
		frmView.getContentPane().add(button_19);
		
		JButton button_21 = new JButton("");
		button_21.setBackground(Color.WHITE);
		button_21.setToolTipText("");
		button_21.setHorizontalAlignment(SwingConstants.LEFT);
		button_21.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_21.setBounds(12, 277, 58, 60);
		frmView.getContentPane().add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBackground(Color.RED);
		button_22.setToolTipText("");
		button_22.setHorizontalAlignment(SwingConstants.LEFT);
		button_22.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_22.setBounds(12, 334, 58, 61);
		frmView.getContentPane().add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBackground(Color.BLUE);
		button_23.setToolTipText("");
		button_23.setHorizontalAlignment(SwingConstants.LEFT);
		button_23.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_23.setBounds(12, 394, 58, 61);
		frmView.getContentPane().add(button_23);
		
		JButton button_24 = new JButton("RAgain");
		button_24.setToolTipText("");
		button_24.setHorizontalAlignment(SwingConstants.LEFT);
		button_24.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_24.setBounds(12, 451, 58, 61);
		frmView.getContentPane().add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBackground(Color.WHITE);
		button_25.setToolTipText("");
		button_25.setHorizontalAlignment(SwingConstants.LEFT);
		button_25.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_25.setBounds(12, 511, 58, 60);
		frmView.getContentPane().add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBackground(Color.GREEN);
		button_26.setToolTipText("");
		button_26.setHorizontalAlignment(SwingConstants.LEFT);
		button_26.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_26.setBounds(12, 570, 58, 60);
		frmView.getContentPane().add(button_26);
		
		JButton button_27 = new JButton("RAgain");
		button_27.setToolTipText("");
		button_27.setHorizontalAlignment(SwingConstants.LEFT);
		button_27.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_27.setBounds(12, 628, 58, 60);
		frmView.getContentPane().add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setBackground(Color.GREEN);
		button_28.setToolTipText("");
		button_28.setHorizontalAlignment(SwingConstants.LEFT);
		button_28.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_28.setBounds(96, 714, 60, 58);
		frmView.getContentPane().add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBackground(Color.BLUE);
		button_29.setToolTipText("");
		button_29.setHorizontalAlignment(SwingConstants.LEFT);
		button_29.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_29.setBounds(155, 714, 60, 58);
		frmView.getContentPane().add(button_29);
		
		JButton button_30 = new JButton("RAgain");
		button_30.setToolTipText("");
		button_30.setHorizontalAlignment(SwingConstants.LEFT);
		button_30.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_30.setBounds(214, 714, 60, 58);
		frmView.getContentPane().add(button_30);
		
		JButton button_31 = new JButton("");
		button_31.setBackground(Color.WHITE);
		button_31.setToolTipText("");
		button_31.setHorizontalAlignment(SwingConstants.LEFT);
		button_31.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_31.setBounds(272, 714, 60, 58);
		frmView.getContentPane().add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setBackground(Color.RED);
		button_32.setToolTipText("");
		button_32.setHorizontalAlignment(SwingConstants.LEFT);
		button_32.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_32.setBounds(330, 714, 60, 58);
		frmView.getContentPane().add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.setBackground(Color.GREEN);
		button_33.setToolTipText("");
		button_33.setHorizontalAlignment(SwingConstants.LEFT);
		button_33.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_33.setBounds(389, 714, 60, 58);
		frmView.getContentPane().add(button_33);
		
		JButton button_34 = new JButton("RAgain");
		button_34.setToolTipText("");
		button_34.setHorizontalAlignment(SwingConstants.LEFT);
		button_34.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_34.setBounds(447, 714, 60, 58);
		frmView.getContentPane().add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setBackground(Color.RED);
		button_35.setToolTipText("");
		button_35.setHorizontalAlignment(SwingConstants.LEFT);
		button_35.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_35.setBounds(505, 714, 60, 58);
		frmView.getContentPane().add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.setBackground(Color.BLUE);
		button_36.setToolTipText("");
		button_36.setHorizontalAlignment(SwingConstants.LEFT);
		button_36.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_36.setBounds(562, 714, 60, 58);
		frmView.getContentPane().add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setBackground(Color.WHITE);
		button_37.setToolTipText("");
		button_37.setHorizontalAlignment(SwingConstants.LEFT);
		button_37.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_37.setBounds(616, 714, 60, 58);
		frmView.getContentPane().add(button_37);
		
		JButton button_48 = new JButton("");
		button_48.setBackground(Color.RED);
		button_48.setToolTipText("");
		button_48.setHorizontalAlignment(SwingConstants.LEFT);
		button_48.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_48.setBounds(95, 24, 60, 58);
		frmView.getContentPane().add(button_48);
		
		JButton button_49 = new JButton("");
		button_49.setBackground(Color.BLUE);
		button_49.setToolTipText("");
		button_49.setHorizontalAlignment(SwingConstants.LEFT);
		button_49.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_49.setBounds(153, 24, 60, 58);
		frmView.getContentPane().add(button_49);
		
		JButton button_50 = new JButton("RAgain");
		button_50.setToolTipText("");
		button_50.setHorizontalAlignment(SwingConstants.LEFT);
		button_50.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_50.setBounds(212, 24, 60, 58);
		frmView.getContentPane().add(button_50);
		
		JButton button_51 = new JButton("");
		button_51.setBackground(Color.RED);
		button_51.setToolTipText("");
		button_51.setHorizontalAlignment(SwingConstants.LEFT);
		button_51.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_51.setBounds(270, 24, 60, 58);
		frmView.getContentPane().add(button_51);
		
		JButton btnRa = new JButton("");
		btnRa.setBackground(Color.WHITE);
		btnRa.setToolTipText("");
		btnRa.setHorizontalAlignment(SwingConstants.LEFT);
		btnRa.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnRa.setBounds(328, 24, 58, 58);
		frmView.getContentPane().add(btnRa);
		
		JButton button_53 = new JButton("");
		button_53.setBackground(Color.GREEN);
		button_53.setToolTipText("");
		button_53.setHorizontalAlignment(SwingConstants.LEFT);
		button_53.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_53.setBounds(385, 24, 58, 58);
		frmView.getContentPane().add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setBackground(Color.BLUE);
		button_54.setToolTipText("");
		button_54.setHorizontalAlignment(SwingConstants.LEFT);
		button_54.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_54.setBounds(442, 24, 58, 58);
		frmView.getContentPane().add(button_54);
		
		JButton button_55 = new JButton("RAgain");
		button_55.setToolTipText("");
		button_55.setHorizontalAlignment(SwingConstants.LEFT);
		button_55.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_55.setBounds(499, 24, 58, 58);
		frmView.getContentPane().add(button_55);
		
		JButton btnPlayer = new JButton("");
		btnPlayer.setForeground(Color.YELLOW);
		btnPlayer.setBackground(Color.GREEN);
		btnPlayer.setToolTipText("");
		btnPlayer.setHorizontalAlignment(SwingConstants.LEFT);
		btnPlayer.setFont(new Font("Dialog", Font.PLAIN, 7));
		btnPlayer.setBounds(556, 24, 60, 58);
		frmView.getContentPane().add(btnPlayer);
		
		JButton button_57 = new JButton("");
		button_57.setBackground(Color.WHITE);
		button_57.setToolTipText("");
		button_57.setHorizontalAlignment(SwingConstants.LEFT);
		button_57.setFont(new Font("Dialog", Font.PLAIN, 7));
		button_57.setBounds(615, 24, 60, 58);
		frmView.getContentPane().add(button_57);
		
		JLabel lblResult = new JLabel("Result:");
		lblResult.setBounds(816, 94, 70, 15);
		frmView.getContentPane().add(lblResult);
		
		textDiceResult = new JTextField();
		textDiceResult.setBounds(870, 89, 125, 19);
		frmView.getContentPane().add(textDiceResult);
		textDiceResult.setColumns(10);
		
		lblPlayer1 = new JLabel("Player 1:");
		lblPlayer1.setBounds(816, 182, 70, 15);
		frmView.getContentPane().add(lblPlayer1);
		
		lblPlayer2 = new JLabel("Player 2:");
		lblPlayer2.setBounds(816, 281, 70, 15);
		frmView.getContentPane().add(lblPlayer2);
		
		lblPlayer3 = new JLabel("Player 3:");
		lblPlayer3.setBounds(816, 391, 70, 15);
		frmView.getContentPane().add(lblPlayer3);
		
		lblPlayer4 = new JLabel("Player 4:");
		lblPlayer4.setBounds(816, 499, 70, 15);
		frmView.getContentPane().add(lblPlayer4);
		
		textPlayer1Piece1 = new JTextField();
		textPlayer1Piece1.setBounds(924, 135, 38, 38);
		frmView.getContentPane().add(textPlayer1Piece1);
		textPlayer1Piece1.setColumns(10);
		
		textPlayer1Piece2 = new JTextField();
		textPlayer1Piece2.setColumns(10);
		textPlayer1Piece2.setBounds(960, 135, 38, 38);
		frmView.getContentPane().add(textPlayer1Piece2);
		
		textPlayer1Piece3 = new JTextField();
		textPlayer1Piece3.setColumns(10);
		textPlayer1Piece3.setBounds(924, 171, 38, 38);
		frmView.getContentPane().add(textPlayer1Piece3);
		
		textPlayer1Piece4 = new JTextField();
		textPlayer1Piece4.setColumns(10);
		textPlayer1Piece4.setBounds(960, 171, 38, 38);
		frmView.getContentPane().add(textPlayer1Piece4);
		
		textPlayer2Piece1 = new JTextField();
		textPlayer2Piece1.setColumns(10);
		textPlayer2Piece1.setBounds(924, 250, 38, 38);
		frmView.getContentPane().add(textPlayer2Piece1);
		
		textPlayer2Piece2 = new JTextField();
		textPlayer2Piece2.setColumns(10);
		textPlayer2Piece2.setBounds(960, 250, 38, 38);
		frmView.getContentPane().add(textPlayer2Piece2);
		
		textPlayer2Piece3 = new JTextField();
		textPlayer2Piece3.setColumns(10);
		textPlayer2Piece3.setBounds(960, 286, 38, 38);
		frmView.getContentPane().add(textPlayer2Piece3);
		
		textPlayer2Piece4 = new JTextField();
		textPlayer2Piece4.setColumns(10);
		textPlayer2Piece4.setBounds(924, 286, 38, 38);
		frmView.getContentPane().add(textPlayer2Piece4);
		
		textPlayer3Piece1 = new JTextField();
		textPlayer3Piece1.setColumns(10);
		textPlayer3Piece1.setBounds(924, 352, 38, 38);
		frmView.getContentPane().add(textPlayer3Piece1);
		
		textPlayer3Piece2 = new JTextField();
		textPlayer3Piece2.setColumns(10);
		textPlayer3Piece2.setBounds(960, 352, 38, 38);
		frmView.getContentPane().add(textPlayer3Piece2);
		
		textPlayer3Piece3 = new JTextField();
		textPlayer3Piece3.setColumns(10);
		textPlayer3Piece3.setBounds(960, 388, 38, 38);
		frmView.getContentPane().add(textPlayer3Piece3);
		
		textPlayer3Piece4 = new JTextField();
		textPlayer3Piece4.setColumns(10);
		textPlayer3Piece4.setBounds(924, 388, 38, 38);
		frmView.getContentPane().add(textPlayer3Piece4);
		
		textPlayer4Piece1 = new JTextField();
		textPlayer4Piece1.setColumns(10);
		textPlayer4Piece1.setBounds(924, 452, 38, 38);
		frmView.getContentPane().add(textPlayer4Piece1);
		
		textPlayer4Piece2 = new JTextField();
		textPlayer4Piece2.setColumns(10);
		textPlayer4Piece2.setBounds(960, 452, 38, 38);
		frmView.getContentPane().add(textPlayer4Piece2);
		
		textPlayer4Piece3 = new JTextField();
		textPlayer4Piece3.setColumns(10);
		textPlayer4Piece3.setBounds(960, 488, 38, 38);
		frmView.getContentPane().add(textPlayer4Piece3);
		
		textPlayer4Piece4 = new JTextField();
		textPlayer4Piece4.setColumns(10);
		textPlayer4Piece4.setBounds(924, 488, 38, 38);
		frmView.getContentPane().add(textPlayer4Piece4);
		
	
		
		
		
		
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

	public void setBtnSetUpPlayers(JButton btnSetUpPlayers) {
		this.btnSetUpPlayers = btnSetUpPlayers;
	}
	
	public JButton getBtnRollDice() {
		return btnRollDice;
	}

	public void setBtnRollDice(JButton btnRollDice) {
		this.btnRollDice = btnRollDice;
	}

	public JTextArea getTextWelcome() {
		return textWelcome;
	}

	public void setTextWelcome(JTextArea textWelcome) {
		this.textWelcome = textWelcome;
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
	
	private JLabel lblPlayer1;
	



	private JLabel lblPlayer2;
	private JLabel lblPlayer3;
	private JLabel lblPlayer4;
	
	
	private JFrame frmView;
	

	private JButton btnSetUpPlayers;
	private JButton btnRollDice;

	private JTextArea textWelcome;
	private JTextField textDiceResult;
	
}
