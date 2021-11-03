package View;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ScrabbleFrame {

	private JFrame frame;
	int winSizeX = 1515;
	int winSizeY = 865;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScrabbleFrame window = new ScrabbleFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ScrabbleFrame() {
		initialize();
		ScrabbleBoardPanel board = new ScrabbleBoardPanel(getWinSizeX());
		Player_1_Panel player_1 = new Player_1_Panel();
		Player_2_Panel player_2 = new Player_2_Panel();
		frame.getContentPane().add(board);
		frame.getContentPane().add(player_1);
		frame.getContentPane().add(player_2);
		
		player_1.setScore("10");
		player_2.setScore("10");
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, winSizeX, winSizeY);
		frame.setTitle("Scrabble");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
	}

	public JFrame getFrame() {
		return frame;
	}

	public int getWinSizeX() {
		return winSizeX;
	}

	public int getWinSizeY() {
		return winSizeY;
	}

}
