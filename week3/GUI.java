import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class GUI {
	
	public static final int WIDTH = 1200, HEIGHT = 800;
	
	public GUI(String name) {
		JFrame frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        Drawing panel = new Drawing();
        
        frame.add(panel);
        
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new GUI("gui");
	}
}
class Drawing extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.drawRect(100, 100, 100, 100);

        g.drawString("hello", 100, 100);

        g.setColor(Color.blue);
        g.drawLine(200, 200, 300, 300);

        g.setColor(Color.black);
        g.drawOval(400, 400, 100, 100);
    }

}