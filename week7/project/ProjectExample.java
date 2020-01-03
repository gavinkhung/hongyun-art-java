import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ProjectExample {

	public ProjectExample() {
		JFrame frame = new JFrame("ProjectExample");
		frame.setSize(1200, 800);
		//600, 400
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 2));
		
		JPanel panel1 = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				setBackground(Color.cyan);
				
				g.setColor(Color.green);
				g.setColor(new Color(150, 75, 0));
				g.fillRect(250, 100, 100, 400);
				
				g.setColor(new Color(100, 255, 100));
				int[] xPoints = {300, 100, 500};
				int[] yPoints = {0, 300, 300};
				g.fillPolygon(xPoints, yPoints, 3);
			}
		};
		
		JPanel panel2 = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				setBackground(Color.yellow);
				
				g.setColor(new Color(255, 0, 100));
				
				g.fillRect(150, 50, 300, 150);
				
				g.setColor(Color.blue);
				g.fillRect(160, 60, 140, 130);
				g.fillRect(310, 60, 130, 130);
				
				g.setColor(new Color(255, 100, 100));
				g.fillRect(100, 200, 400, 100);
				
				g.setColor(Color.black);
				g.fillOval(100, 300, 100, 100);
				g.fillOval(400, 300, 100, 100);
				
				
			}
		};
		
		JPanel panel3 = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				
				setBackground(Color.orange);
				
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
				for(int x=0; x<600; x+=50) {
					for(int y=0; y<400; y+=50) {
						g.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
						g.fillRect(x, y, 50, 50);
					}
				}
				g.setColor(Color.black);
				for(int i=0; i<600; i+=50) {
					g.drawLine(i, 0, i, 400);
				}
				for(int i=0; i<400; i+=50) {
					g.drawLine(0, i, 600, i);
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
