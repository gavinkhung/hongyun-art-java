import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Project1 extends JPanel {
	
	public static final int WIDTH = 600, HEIGHT = 400;
	
	public Project1(String  name) {
		JFrame frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JButton button = new JButton("press me");

        JLabel label = new JLabel("text");

        JTextField textField = new JTextField("textField");
        textField.setColumns(40);
        
        JSlider slider = new JSlider(1, 255, 255);
        
        add(button);
        add(label);
        add(textField);
        add(slider);

        frame.add(this);
                
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new Project1("project1");
	}
	
	public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setColor(Color.red);
        g.fillRect(100, 100, 200, 200);
        
        g.setColor(Color.orange);
        g.fillRect(300, 100, 200, 200);
	}
}