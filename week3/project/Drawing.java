import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

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
		
        g.setFont(new Font("SansSerif", Font.PLAIN, 20));
        for(int i=0; i<colors.length; i+=1){
			g.setColor(colors[i]);
        	g.drawString("drawing", 150+(i*100), 100);
		}
        
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
        	g.fillOval(150+(i*100), 400, 100, 100);
		}
		
		Graphics2D g2 = (Graphics2D) g;
		
		for(int i=0; i<colors.length; i+=1){
			g.setColor(colors[i]);
			g2.setStroke(new BasicStroke(i+0.0f));
        	g.drawLine(150+(i*100), 500, 250+(i*100), 600);
		}
		
		for(int i=0; i<colors.length; i+=1){
			g.setColor(colors[i]);
			g2.setStroke(new BasicStroke((9-i)+0.0f));
        	g.drawLine(250+(i*100), 700, 150+(i*100), 600);
		}

    }

}
