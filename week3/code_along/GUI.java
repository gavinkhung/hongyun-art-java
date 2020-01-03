public class GUI {
	
	public static final int WIDTH = 800, HEIGHT = 600;
	
	public GUI(String name) {
		JFrame frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GUIPanel panel = new GUIPanel();
        
        frame.add(panel);
        
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
		
		panel.repaint();
	}
	
	public static void main(String[] args) {
		new GUI("gui");
	}
}
class GUIPanel extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.drawRect(100, 100, 100, 100);
        
        // 4th parameter is the transparency from 0 to 255, 255 is solid
        g.setColor(new Color(255, 0, 0, 30));
        g.fillRect(275, 100, 100, 100);
        g.setColor(new Color(255, 0, 0, 70));
        g.fillRect(325, 100, 100, 100);
        
        g.setColor(Color.red);
        g.fillRect(500, 100, 100, 100);

        g.setFont(new Font("SansSerif", Font.PLAIN, 40));
        g.drawString("My first GUI application", 100, 100);

        g.setColor(Color.black);
        g.drawOval(100, 200, 100, 100);
        
        
        g.setColor(new Color(0, 0, 0, 30));
        g.fillOval(275, 200, 100, 100);
        g.setColor(new Color(0, 0, 0, 70));
        g.fillOval(325, 200, 100, 100);
        
        g.setColor(Color.black);
        g.fillOval(500, 200, 100, 100);
        
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.blue);
        
		g2.setStroke(new BasicStroke(1.0f));
        g.drawLine(100, 300, 200, 400);
        
        g2.setStroke(new BasicStroke(2.5f));
        g.drawLine(300, 300, 400, 400);
        
        g2.setStroke(new BasicStroke(5.0f));
        g.drawLine(500, 300, 600, 400);
    }

}
