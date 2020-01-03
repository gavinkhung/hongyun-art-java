import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

public class Project2 {
	
	public static final int WIDTH = 600, HEIGHT = 400;
	
	public Project2(String  name) {
		JFrame frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        JPanel panel = new JPanel();

        JButton button = new JButton("press me");
        button.setOpaque(true);
        button.setBackground(Color.orange);
        button.setForeground(Color.cyan);

        JLabel label = new JLabel("text");
        label.setOpaque(true);
        label.setBackground(Color.yellow);
        label.setForeground(Color.black);
        
        JTextField textField = new JTextField("textField");
        textField.setColumns(10);
        textField.setFont(new Font("SansSerif", Font.PLAIN, 60));
        
        JSlider slider = new JSlider(1, 240, 240);
        
        slider.setMajorTickSpacing(40);
        slider.setMinorTickSpacing(8);
        slider.setPaintTicks(true);
     
        
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
		new Project2("SwingElements");
	}
}