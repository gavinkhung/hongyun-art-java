package photoshop;

import javax.swing.JFrame;

public class Photoshop {
	
	public static final int WIDTH = 1200, HEIGHT = 800;
	
	private JFrame frame;
	private BoardPanel boardPanel;
	
	public Photoshop(String name) {
		frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		boardPanel = new BoardPanel();
		
		frame.add(boardPanel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new Photoshop("gavin");
	}
}
