package View;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;


import javax.swing.TransferHandler;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Player_2_Panel extends JPanel {
	
	private ImageIcon icon1;
	private ImageIcon icon2;
	private ImageIcon icon3;
	private ImageIcon icon4;
	private ImageIcon icon5;
	private ImageIcon icon6;
	private ImageIcon icon7;
	private ImageIcon icon8;
	private ImageIcon icon9;
	private ImageIcon icon10;
	private ImageIcon icon11;
	private ImageIcon icon12;
	private ImageIcon icon13;
	private ImageIcon icon14;
	private ImageIcon icon15;
	private ImageIcon icon16;
	private ImageIcon icon17;
	private ImageIcon icon18;
	private ImageIcon icon19;
	private ImageIcon icon20;
	private ImageIcon icon21;
	private ImageIcon icon22;
	private ImageIcon icon23;
	private ImageIcon icon24;
	private ImageIcon icon25;
	private ImageIcon icon26;
	
	
	private JLabel lblPlayer_2;
	private JTextArea txtAreaPlayer_2 ;
	private JLabel playerTiles[];

	public Player_2_Panel() {
		// Player 2 panel
		
		// TODO Border of panel 
		setBorder(new LineBorder(Color.GREEN, 3));
		setBounds(1162, 0, 335, 825);
		setBackground(Color.BLACK);
		setLayout(null);

		// Player 2 score label
		lblPlayer_2 = new JLabel("Player 2 Score");
		lblPlayer_2.setForeground(Color.WHITE);
		lblPlayer_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblPlayer_2.setBounds(59, 10, 237, 47);
		this.add(lblPlayer_2);

		// Player 2 score text area
		txtAreaPlayer_2 = new JTextArea();
		txtAreaPlayer_2.setBounds(59, 73, 221, 39);
		intializeTileImages();
		playerTiles = new JLabel[7];
		initializeTiles();
		this.add(txtAreaPlayer_2);
	}
	
	public void setScore(String score) {

		txtAreaPlayer_2.setForeground(getBackground());
		txtAreaPlayer_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		int whiteSpace = 0;
		System.out.println(txtAreaPlayer_2.getWidth());
		System.out.println(score.length());
		
		whiteSpace = (txtAreaPlayer_2.getWidth() / 2)/10 - (score.length() /2);
		for(int i = 0; i < whiteSpace; i++){
			score = " " + score;
		}
		txtAreaPlayer_2.setText(score);
	}
	
	private void initializeTiles() {
		for(int i = 0 ; i < 7; i++) {
			
			playerTiles[i] = new JLabel(icon3, JLabel.CENTER);
			playerTiles[i].setBounds(140, (i * 100) + 150, 55, 55);
			this.add(playerTiles[i]);
		}
	}
	

	
	private void intializeTileImages() {
		
		icon1 = new ImageIcon("ScabblePics/Scrabble-tile-A-wood.jpg");
		icon2 = new ImageIcon("ScabblePics/Scrabble-tile-B-wood.jpg");
		icon3 = new ImageIcon("ScabblePics/Scrabble-tile-C-wood.jpg");
		icon4 = new ImageIcon("ScabblePics/Scrabble-tile-D-wood.jpg");
		icon5 = new ImageIcon("ScabblePics/Scrabble-tile-E-wood.jpg");
		icon6 = new ImageIcon("ScabblePics/Scrabble-tile-F-wood.jpg");
		icon7 = new ImageIcon("ScabblePics/Scrabble-tile-G-wood.jpg");
		icon8 = new ImageIcon("ScabblePics/Scrabble-tile-H-wood.jpg");
		icon9 = new ImageIcon("ScabblePics/Scrabble-tile-I-wood.jpg");
		icon10 = new ImageIcon("ScabblePics/Scrabble-tile-J-wood.jpg");
		icon11 = new ImageIcon("ScabblePics/Scrabble-tile-K-wood.jpg");
		icon12 = new ImageIcon("ScabblePics/Scrabble-tile-L-wood.jpg");
		icon13 = new ImageIcon("ScabblePics/Scrabble-tile-M-wood.jpg");
		icon14 = new ImageIcon("ScabblePics/Scrabble-tile-N-wood.jpg");
		icon15 = new ImageIcon("ScabblePics/Scrabble-tile-O-wood.jpg");
		icon16 = new ImageIcon("ScabblePics/Scrabble-tile-P-wood.jpg");
		icon17 = new ImageIcon("ScabblePics/Scrabble-tile-Q-wood.jpg");
		icon18 = new ImageIcon("ScabblePics/Scrabble-tile-R-wood.jpg");
		icon19 = new ImageIcon("ScabblePics/Scrabble-tile-S-wood.jpg");
		icon20 = new ImageIcon("ScabblePics/Scrabble-tile-T-wood.jpg");
		icon21 = new ImageIcon("ScabblePics/Scrabble-tile-U-wood.jpg");
		icon22 = new ImageIcon("ScabblePics/Scrabble-tile-V-wood.jpg");
		icon23 = new ImageIcon("ScabblePics/Scrabble-tile-W-wood.jpg");
		icon24 = new ImageIcon("ScabblePics/Scrabble-tile-X-wood.jpg");
		icon25 = new ImageIcon("ScabblePics/Scrabble-tile-Y-wood.jpg");
		icon26 = new ImageIcon("ScabblePics/Scrabble-tile-Z-wood.jpg");	
	}

}
