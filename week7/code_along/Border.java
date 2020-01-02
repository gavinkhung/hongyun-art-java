import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Border {

	public Border() {
		JFrame frame = new JFrame("UI");
		frame.setSize(1200, 800);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.gray);
		
		JButton north = new JButton("north");
		JButton south = new JButton("south");
		JButton center = new JButton("center");
		JButton east = new JButton("east");
		JButton west = new JButton("west");
		
		
		panel.add(north, BorderLayout.NORTH);
		panel.add(south, BorderLayout.SOUTH);
		panel.add(center, BorderLayout.CENTER);
		panel.add(east, BorderLayout.EAST);
		panel.add(west, BorderLayout.WEST);
		
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new Border();
	}

}
