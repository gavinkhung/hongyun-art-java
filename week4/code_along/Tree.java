import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tree extends JPanel {

	public static final int WIDTH = 600, HEIGHT = 600, GRID_SIZE = 100;
	
	public Tree(String name) {
		JFrame frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        frame.add(this);
        setBackground(Color.cyan);
        
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new Tree("tree");
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.green);
		g.fillRect(0, 500, WIDTH, 100);
		
		g.setColor(new Color(150, 75, 0));
		g.fillRect(250, 100, 100, 400);
		
		g.setColor(new Color(100, 255, 100));
		int[] xPoints = {300, 100, 500};
		int[] yPoints = {0, 400, 400};
		g.fillPolygon(xPoints, yPoints, 3);
	}
	
}
