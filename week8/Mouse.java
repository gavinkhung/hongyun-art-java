import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mouse extends JPanel implements MouseListener {

	private int x, y, width, height;
	
	public Mouse() {
		x = 0;
		y = 0;
		width = 100;
		height = 100;
		
		JFrame frame = new JFrame("UI");
		frame.setSize(1200, 800);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addMouseListener(this);
		
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new Mouse();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(x, y, width, height);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y= e.getY();
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		requestFocusInWindow();
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
