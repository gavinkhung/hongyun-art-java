import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Key extends JPanel implements KeyListener {

	private Color color;
	
	public Key() {
		color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
		JFrame frame = new JFrame("keys");
		frame.setSize(1200, 800);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		addKeyListener(this);
		
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Key();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(color);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE) {
			color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
			repaint();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
