import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Card {

	public Card() {
		JFrame frame = new JFrame("UI");
		frame.setSize(1200, 800);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CardLayout cardLayout = new CardLayout();
		
		JPanel panel = new JPanel();
		panel.setLayout(cardLayout);
		
		
		JPanel blankPanel = new JPanel();
		blankPanel.setBackground(Color.black);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.green);
		JButton button = new JButton();
		buttonPanel.add(button);
		
		panel.add(blankPanel, "blankPanel");
		panel.add(buttonPanel, "buttonPanel");
		
		cardLayout.show(panel, "blankPanel");
		//cardLayout.show(panel, "buttonPanel");
		
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new Card();
	}

}
