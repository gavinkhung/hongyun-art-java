import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MovingCar extends JPanel {

	public static final int WIDTH = 600, HEIGHT = 600, GRID_SIZE = 100;
	
	private int distance;
	
	public MovingCar(String name) {
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
		
		distance = 0;
		for(int i=0; i<200; i++) {
			distance += 1;
			repaint();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new MovingCar("movingCar");
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(new Color(255, 0, 100));
		
		g.fillRect(50+distance, 150, 300, 150);
		
		g.setColor(Color.blue);
		g.fillRect(60+distance, 160, 140, 130);
		g.fillRect(210+distance, 160, 130, 130);
		
		g.setColor(new Color(255, 100, 100));
		g.fillRect(0+distance, 300, 400, 100);
		
		
		g.setColor(Color.black);
		g.fillOval(0+distance, 400, 100, 100);
		g.fillOval(300+distance, 400, 100, 100);
		
		g.setColor(Color.darkGray);
		g.fillRect(0, 500, WIDTH, 100);
		
	}
	
}
