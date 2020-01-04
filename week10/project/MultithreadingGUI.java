import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MultithreadingGUI extends JPanel {

	public static final int WIDTH = 900, HEIGHT = 500;
	
	private static int i = 0;
	private static int iS = 0;
	private static Object o1 = new Object();
	
	public MultithreadingGUI() {
		ThreadOne t1 = new ThreadOne();
		ThreadTwo t2 = new ThreadTwo();
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("i: "+i);
		System.out.println("iS: "+iS);
		
		
		JFrame frame = new JFrame("load");
		
		frame.setSize(WIDTH, HEIGHT);
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
		new MultithreadingGUI();
	}
	
	public static void increaseSynchronized() {
		synchronized(o1) {
			iS += 1;
		}
	}
	public static void increase() {
		i += 1;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.red);
		
		g.drawString("without synchronized: "+i, 10, 100);
		g.fillRect(i/100, 100, 100, 100);
		
		g.drawString("with synchronized: "+iS, 10, 300);
		g.fillRect(iS/100, 300, 100, 100);
	}
	
}
class ThreadOne extends Thread {
	
	public void run(){
		for(int i=0; i<40000; i++) {
			MultithreadingGUI.increaseSynchronized();
			MultithreadingGUI.increase();
		}
	}
}
class ThreadTwo extends Thread {
	
	public void run(){
		for(int i=0; i<40000; i++) {
			MultithreadingGUI.increaseSynchronized();
			MultithreadingGUI.increase();
		}
	}
	
}