import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Skyscraper extends JPanel {

	public static final int WIDTH = 600, HEIGHT = 600, GRID_SIZE = 100;
	
	public Skyscraper(String name) {
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
		new Skyscraper("skyscraper");
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.darkGray);
		g.fillRect(0, 500, WIDTH, 100);
		
		g.setColor(Color.gray);
		
		g.fillRect(295, 10, 10, 100);
		
		int[] xPoints = {300, 250, 350};
		int[] yPoints = {100, 200, 200};
		g.fillPolygon(xPoints, yPoints, 3);
		
		g.fillRect(250, 200, 100, 300);
		
		g.setColor(Color.blue);
		for(int y=200; y<500; y+=50) {
			for(int i=10; i<100; i+=45) {
				g.fillRect(i+250, y, 35, 35);
			}
		}
	}
	
}
