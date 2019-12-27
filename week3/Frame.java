import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;

public class Frame {
	
	public static final int WIDTH = 1200, HEIGHT = 800;
	
	public Frame(String name) {
		JFrame frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
		
        frame.add(panel);
        
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new Frame("frame");
	}
}
