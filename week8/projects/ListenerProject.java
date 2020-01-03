import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListenerProject extends JPanel implements ActionListener, MouseListener, MouseMotionListener, KeyListener {

	private ArrayList<Integer> xs, ys;
	private JButton button;
	private Color color;
	
	private int x, y, radius;
	
	public ListenerProject() {
		x = 0;
		y = 0;
		radius = 100;
		
		xs = new ArrayList<Integer>();
		ys = new ArrayList<Integer>();
		
		color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256));
		
		
		JFrame frame = new JFrame("ListenerProject");
		frame.setSize(1200, 800);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		button = new JButton("clear");
		button.addActionListener(this);
		button.setActionCommand(button.getText());
		
		add(button);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		addKeyListener(this);
		
		frame.add(this);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new ListenerProject();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), 50));
		g.fillOval(x, y, radius, radius);
		
		g.setColor(color);
		for(int i=0; i<xs.size(); i++) {
			g.fillOval(xs.get(i), ys.get(i), radius, radius);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals(button.getActionCommand())) {
			color = Color.white;
			
			xs = new ArrayList<Integer>();
			ys = new ArrayList<Integer>();

			repaint();
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		
		xs.add(x);
		ys.add(y);
		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX();
		y= e.getY();
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
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

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		color = new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*120));
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}
	
}
