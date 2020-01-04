import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Clock2 extends JPanel {

	public static final int WIDTH = 600, HEIGHT = 600, GRID_SIZE = 100;
	private String time;
	private int[] hours = {3,4,5,6,7,8,9,10,11,12,1,2};
	
	public Clock2(String name, String fileName) {
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
		new Clock2("clock2", "time.txt");
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if(time != null) {
			g.setFont(new Font("SansSerif", Font.PLAIN, 40));
			g.setColor(Color.black);
			g.drawOval(110, 100, 400, 400);
			
			int counter = 0;
			for(double i=0; i<Math.PI*2; i+=(Math.PI*0.16667)) {
				if(counter<hours.length) {
					g.drawString(""+hours[counter], (int)(Math.cos(i)*200)+300, (int)(Math.sin(i)*200)+300);
					counter++;
				}
			}
			if(time.indexOf(":")!=-1) {
				int hour = Integer.parseInt(time.substring(0, time.indexOf(":")));
				int min = Integer.parseInt(time.substring(time.indexOf(":")+1));
				
				System.out.println("H: "+hour);
				System.out.println("M: "+min);
				
				double hourRad = Math.toRadians(hour*30-90);
				double minRad = Math.toRadians(min*6-90);
				
				// hour hand
				g.drawLine(310, 300, (int)(Math.cos(hourRad)*150)+300, (int)(Math.sin(hourRad)*150)+300);
				
				// min hand
				Graphics2D g2 = (Graphics2D) g;
				g2.setStroke(new BasicStroke(3f));
				g.drawLine(310, 300, (int)(Math.cos(minRad)*190)+300, (int)(Math.sin(minRad)*190)+300);
				
			}
			
			
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
