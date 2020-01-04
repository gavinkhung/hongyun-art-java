import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clock extends JPanel {

	public static final int WIDTH = 600, HEIGHT = 600, GRID_SIZE = 100;
	private String time;
	
	public Clock(String name, String fileName) {
		JFrame frame = new JFrame(name);
		frame.setSize(WIDTH, HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        frame.add(this);
        
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
		
		time = readFile(fileName);
		repaint();
	}
	
	public static void main(String[] args) {
		new Clock("clock", "time.txt");
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(time != null) {
			g.setColor(Color.black);
			g.fillRect(100, 100, 400, 400);
			
			g.setColor(Color.red);
			g.setFont(new Font("SansSerif", Font.PLAIN, 140));
			g.drawString(time, 100, 340);
		}
	}
	
	public String readFile(String fileName) {
		String output = new String("");
		File currentFile = new File(fileName);
		try{
            Scanner scanner = new Scanner(currentFile);
            
            output = scanner.nextLine();

            scanner.close();
		}
		catch(Exception e){
			System.out.print(fileName+" not found\n");
        }
		return output;
	}
	
}
