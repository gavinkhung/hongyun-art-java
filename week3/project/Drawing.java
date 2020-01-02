import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

public class Drawing {
	
	public static final int WIDTH = 1200, HEIGHT = 800;
	
	public Drawing(String name) {
		JFrame frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        DrawingPanel panel = new DrawingPanel();
        
        frame.add(panel);
        
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new Drawing("drawing");
	}
}
class DrawingPanel extends JPanel {

	private Color[] colors;

	public DrawingPanel(){
		colors = new Color[]{
			Color.RED, 
			Color.PINK, 
			Color.ORANGE, 
			Color.YELLOW, 
			Color.GREEN, 
			Color.BLUE, 
			Color.CYAN, 
			Color.BLACK, 
			Color.GRAY
		};
	}

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
		
		for(int i=0; i<colors.length; i+=1){
			g.setColor(colors[i]);
        	g.drawRect(150+(i*100), 100, 100, 100);
		}

		for(int i=0; i<colors.length; i+=1){
			g.setColor(colors[i]);
        	g.fillRect(150+(i*100), 200, 100, 100);
		}

		for(int i=0; i<colors.length; i+=1){
			g.setColor(colors[i]);
        	g.drawOval(150+(i*100), 300, 100, 100);
		}

		for(int i=0; i<colors.length; i+=1){
			g.setColor(colors[i]);
        	g.drawOval(150+(i*100), 400, 100, 100);
		}

        g.drawString("hello", 100, 100);

        g.setColor(Color.blue);
        g.drawLine(200, 200, 300, 300);

    }

}