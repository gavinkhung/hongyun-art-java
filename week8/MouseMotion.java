import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseMotion extends JPanel implements MouseMotionListener {

	private int x, y, width, height;
	
	public MouseMotion() {
		x = 0;
		y = 0;
		width = 100;
		height = 100;
		
		JFrame frame = new JFrame("UI");
		frame.setSize(1200, 800);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addMouseMotionListener(this);
		
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new MouseMotion();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(x, y, width, height);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		x = e.getX();
		y= e.getY();
		repaint();
	}

}
