import java.awt.Color;
import java.awt.Graphics;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Loader extends JPanel {

	
	private JFrame frame;
	private ArrayList<Points> deserializedPoints;
	
	public Loader(){
		frame = new JFrame("load");
		deserializedPoints = new ArrayList<Points>();
		
		loadPoints();
		
		frame.setSize(Constants.WIDTH, Constants.HEIGHT);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.add(this);
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setFocusable(true);
		frame.requestFocusInWindow();
		
		repaint();
	}
	
	public static void main(String[] args) {
		new Loader();
	}
	
	public void loadPoints() {
		File file = new File(Constants.projectDirectorySerialized+Constants.fileName);
		
		FileInputStream fileInputStream = null;
		ObjectInputStream objectInputStream = null;
		try{
			fileInputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(fileInputStream);
			
			try{
				while(true){
					Points current = (Points) objectInputStream.readObject();
					deserializedPoints.add(current);
				}
			}
			catch(ClassNotFoundException e){
				System.out.print("Points class not found\n");
			}
			catch(EOFException e){
				System.out.print("All data read\n");
			}
			
			fileInputStream.close();
			objectInputStream.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(Points current: deserializedPoints) {
			current.draw(g);
		}
		
	}
	
}
