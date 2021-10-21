import javax.swing.JFrame;

import java.awt.Color;

/**
 * @author arnav doshi
 * @version 5/26/21
 * @author Period - Period 5 APCS
 */
public class GameMain {
	/**
	 * Main method to run the entire project
	 * 
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		WindowGame window = new WindowGame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(0, 0, 800, 600);
		// window.setExtendedState( JFrame.MAXIMIZED_BOTH);
		window.getContentPane().setBackground(Color.black);
		window.setLayout(null);
		window.setVisible(true);
		window.setVisible(true);
	}
}
