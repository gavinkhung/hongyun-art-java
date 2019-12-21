import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class BoardPanel extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
	
	private JButton saveButton, undoButton, redoButton;
	private JTextField textField;
	private JPanel canvas;
	
	private ArrayList<Points> pointsList;
	private ArrayList<Points> removedPointsList;
	private Points currentPoint;
	
	private Color burshColor;
	private int transparency;
	private float brushThickness;
	
	public BoardPanel() {
		setLayout(new BorderLayout());
		
		pointsList = new ArrayList<Points>();
		removedPointsList = new ArrayList<Points>();
		
		burshColor = Color.black;
		transparency = 255;
		brushThickness = 5;
		currentPoint = new Points(transparency, brushThickness, burshColor);
		
		JPanel savePanel = new JPanel();
		savePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		saveButton = new JButton("Save");
		saveButton.addActionListener(this);
		saveButton.setActionCommand(saveButton.getText());
		undoButton = new JButton("Undo");
		undoButton.addActionListener(this);
		undoButton.setActionCommand(undoButton.getText());
		redoButton = new JButton("Redo");
		redoButton.addActionListener(this);
		redoButton.setActionCommand(redoButton.getText());
		textField = new JTextField("name");
		textField.setColumns(40);
		savePanel.add(saveButton);
		savePanel.add(textField);
		savePanel.add(undoButton);
		savePanel.add(redoButton);
		
		JPanel optionsPanel = new JPanel();
		optionsPanel.setLayout(new GridLayout(2, 1));
		
		JPanel colorsPanel = new JPanel();
		colorsPanel.setLayout(new GridLayout(Constants.colors.length/2, 2));
		for(Color currentColor: Constants.colors) {
			JButton button = new JButton();
			button.setBackground(currentColor);
			button.setForeground(currentColor);
			button.setOpaque(true);
			button.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					burshColor = button.getBackground();
				}
				
			});
			colorsPanel.add(button);
		}
		JPanel sizePanel = new JPanel();
		sizePanel.setLayout(new GridLayout(4, 1));
		JSlider transparencySlider = new JSlider(1, 255, 255);
		transparencySlider.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent ce) {
	            transparency = ((JSlider) ce.getSource()).getValue();
	        }
	    });
		JSlider brushThicknessSlider = new JSlider(0, 10);
		brushThicknessSlider.addChangeListener(new ChangeListener() {
	        @Override
	        public void stateChanged(ChangeEvent ce) {
	            brushThickness = ((JSlider) ce.getSource()).getValue();
	        }
	    });
		sizePanel.add(new JLabel("transparency", JLabel.CENTER));
		sizePanel.add(transparencySlider); 
		sizePanel.add(new JLabel("brushThickness", JLabel.CENTER));
		sizePanel.add(brushThicknessSlider);
		
		optionsPanel.add(colorsPanel);
		optionsPanel.add(sizePanel);
		
		canvas = new JPanel() {
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(burshColor);
				for(Points current: pointsList) {
					current.draw(g);
				}
				
			}
		};
		canvas.setBackground(Color.white);
		canvas.setFocusable(true);
		canvas.addMouseListener(this);
		canvas.addMouseMotionListener(this);
		
		add(savePanel, BorderLayout.NORTH);
		add(optionsPanel, BorderLayout.WEST);
		add(canvas, BorderLayout.CENTER);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if(currentPoint!=null) {
			currentPoint.addPoint(e.getX(), e.getY());
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {
		currentPoint = new Points(transparency, brushThickness, burshColor);
		currentPoint.addPoint(e.getX(), e.getY());
		pointsList.add(currentPoint);
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {
		requestFocusInWindow();
	}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals(saveButton.getActionCommand())) {
			BufferedImage img = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_RGB);
			canvas.paint(img.getGraphics());
			File outputfile = new File(Constants.projectDirectory+textField.getText()+".png");
			try {
				ImageIO.write(img, "png", outputfile);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if(command.equals(undoButton.getActionCommand())) {
			if(pointsList.size()>0) {
				removedPointsList.add(pointsList.remove(pointsList.size()-1));
			}
			repaint();
		} else if(command.equals(redoButton.getActionCommand())) {
			if(removedPointsList.size()>0) {
				pointsList.add(removedPointsList.remove(removedPointsList.size()-1));
			}
			repaint();
		}
	}
	
}
