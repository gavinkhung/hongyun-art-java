import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid {

	public Grid() {
		JFrame frame = new JFrame("UI");
		frame.setSize(1200, 800);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		panel.setBackground(Color.gray);
		
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		JButton button3 = new JButton("button3");
		JButton button4 = new JButton("button4");
		
		
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new Grid();
	}

}
