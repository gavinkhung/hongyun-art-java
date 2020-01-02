import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProjectExample {

	public ProjectExample() {
		JFrame frame = new JFrame("ProjectExample");
		frame.setSize(1200, 800);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		
		JPanel panel1 = new JPanel() {
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
		};
		
		JPanel panel2 = new JPanel() {
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
		};
		
		JPanel panel3 = new JPanel() {
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
		};
		
		JPanel panel4 = new JPanel() {
			public void paintComponent(Graphics g) {
				for(int i=0; i<300; i+=50) {
					g.drawLine(i, 0, i, HEIGHT);
				}
				
				for(int i=0; i<200; i+=50) {
					g.drawLine(0, i, WIDTH, i);
				}
			}
		};
		
		panel.add(panel1);
		panel.add(panel2);
		panel.add(panel3);
		panel.add(panel4);
		
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new ProjectExample();
	}

}
