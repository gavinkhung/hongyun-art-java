import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Grid extends JPanel {

	public static final int WIDTH = 600, HEIGHT = 600, GRID_SIZE = 100;
	
	public Grid(String name) {
		JFrame frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        frame.add(this);
        
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new Grid("grid");
	}
	
	public void paintComponent(Graphics g) {
		for(int i=0; i<WIDTH; i+=GRID_SIZE) {
			g.drawLine(i, 0, i, HEIGHT);
		}
		
		for(int i=0; i<HEIGHT; i+=GRID_SIZE) {
			g.drawLine(0, i, WIDTH, i);
		}
	}
	
}
