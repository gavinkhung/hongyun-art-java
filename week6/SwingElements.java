import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class SwingElements {
	
	public static final int WIDTH = 1200, HEIGHT = 800;
	
	public SwingElements(String name) {
		JFrame frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel panel = new JPanel();

        JButton button = new JButton("press me");

        JLabel label = new JLabel("text");

        JTextField textField = new JTextField("textField");
        textField.setColumns(40);
        
        JSlider slider = new JSlider(1, 255, 255);
        
        panel.add(button);
        panel.add(label);
        panel.add(textField);
        panel.add(slider);

        frame.add(panel);
        
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
	}
	
	public static void main(String[] args) {
		new SwingElements("SwingElements");
	}
}