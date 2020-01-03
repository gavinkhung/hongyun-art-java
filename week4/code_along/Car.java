import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Car extends JPanel {

	public static final int WIDTH = 600, HEIGHT = 600, GRID_SIZE = 100;
	
	public Car(String name) {
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
		new Car("car");
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(255, 0, 100));
		
		g.fillRect(150, 150, 300, 150);
		
		g.setColor(Color.blue);
		g.fillRect(160, 160, 140, 130);
		g.fillRect(310, 160, 130, 130);
		
		g.setColor(new Color(255, 100, 100));
		g.fillRect(100, 300, 400, 100);
		
		
		g.setColor(Color.black);
		g.fillOval(100, 400, 100, 100);
		g.fillOval(400, 400, 100, 100);
		
		g.setColor(Color.darkGray);
		g.fillRect(0, 500, WIDTH, 100);
		
	}
	
}
