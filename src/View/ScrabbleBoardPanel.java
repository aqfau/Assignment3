package View;

import java.awt.Dimension;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

public class ScrabbleBoardPanel extends JPanel {

	// panel.setBackground(Color.BLACK);
	private JLabel board[][] = new JLabel[15][15];
	int panelSize;
	private ImageIcon icon1;
	private ImageIcon icon2;
	private ImageIcon icon3;
	private ImageIcon icon4;
	private ImageIcon icon5;
	private ImageIcon icon6;
	private int mouseX;
	private int mouseY;

	public ScrabbleBoardPanel(int winWidth) {
		
		
		icon1 = new ImageIcon("ScabblePics/Star_55_55.jpg");
		icon2 = new ImageIcon("ScabblePics/Double_Letter_Score_55_55.jpg");
		icon3 = new ImageIcon("ScabblePics/Triple_Letter_Score_55_55.jpg");
		icon4 = new ImageIcon("ScabblePics/Double_Word_Score_55_55.jpg");
		icon5 = new ImageIcon("ScabblePics/Triple_Word_Score_55_55.jpg");
		icon6 = new ImageIcon("ScabblePics/Grey_Piece_55_55.jpg");
		panelSize = 825;
		this.setBounds(winWidth / 2 - panelSize / 2 - 9, 0, panelSize, panelSize);
		this.setLayout(null);
		createScrabbleBoard();
		addMouseListener();
	
	}
	
	private void addMouseListener() {
		this.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
				System.out.println(getMouseX() + " " + getMouseY());
			}

			@Override
			public void mousePressed(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseReleased(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(java.awt.event.MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
	}
	
	

	public int getMouseX() {
		return mouseX;
	}

	public int getMouseY() {
		return mouseY;
	}

	public void createScrabbleBoard() {
		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[i].length; j++) {

				if (i == 7 && j == 7) {

					board[i][j] = new JLabel(icon1, JLabel.CENTER);
					board[i][j].setBounds(i * 55, j * 55, 55, 55);
					board[i][j].setTransferHandler(new TransferHandler("icon"));
					this.add(board[i][j]);
					this.revalidate();
				}

				// Double letter Score
				else if (((i == 0 || i == 14) && (j == 3 || j == 11)) || ((i == 2 || i == 12) && (j == 6 || j == 8))
						|| ((i == 3 || i == 11) && (j == 0 || j == 7 || j == 14))
						|| ((i == 6 || i == 8) && (j == 2 || j == 6 || j == 8 || j == 12))
						|| ((i == 7) && (j == 3 || j == 11))) {
					board[i][j] = new JLabel(icon2, JLabel.CENTER);
					board[i][j].setBounds(i * 55, j * 55, 55, 55);
					this.add(board[i][j]);

				}

				// Triple letter Score
				else if (((i == 1 || i == 13) && (j == 5 || j == 9))
						|| ((i == 5 || i == 9) && (j == 1 || j == 5 || j == 9 || j == 13))
						|| ((i == 3 || i == 11) && (j == 0 || j == 7 || j == 14))
						|| ((i == 6 || i == 8) && (j == 2 || j == 6 || j == 8 || j == 12))
						|| ((i == 7) && (j == 3 || j == 11))) {
					board[i][j] = new JLabel(icon3, JLabel.CENTER);
					board[i][j].setBounds(i * 55, j * 55, 55, 55);
					this.add(board[i][j]);

				}

				// Double Word Score
				else if (((i == 1 || i == 13) && (j == 1 || j == 13)) || ((i == 2 || i == 12) && (j == 2 || j == 12))
						|| ((i == 3 || i == 11) && (j == 3 || j == 11))
						|| ((i == 4 || i == 10) && (j == 4 || j == 10))) {
					board[i][j] = new JLabel(icon4, JLabel.CENTER);
					board[i][j].setBounds(i * 55, j * 55, 55, 55);
					this.add(board[i][j]);

				}

				// Triple Word Score
				else if (((i == 0 || i == 14) && (j == 0 || j == 7 || j == 14)) || (i == 7 && (j == 0 || j == 14))) {
					board[i][j] = new JLabel(icon5, JLabel.CENTER);
					board[i][j].setBounds(i * 55, j * 55, 55, 55);
					this.add(board[i][j]);

				}

				// Grey piece
				else {

					board[i][j] = new JLabel(icon6, JLabel.CENTER);
					board[i][j].setBounds(i * 55, j * 55, 55, 55);
					this.add(board[i][j]);
				}
			}
		}
	}

}
