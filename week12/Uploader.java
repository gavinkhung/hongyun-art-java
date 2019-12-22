import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Uploader {

	private ArrayList<Points> pointsList;
	
	public Uploader() {
		pointsList = new ArrayList<Points>();
		
		for(int i=0; i<10; i++) {
			pointsList.add(new Points(255, 1.0f, new Color(255, 0, 0)));
			pointsList.get(i).addPoint((int)(Math.random()*Constants.WIDTH), (int)(Math.random()*Constants.WIDTH));
			pointsList.get(i).addPoint((int)(Math.random()*Constants.WIDTH), (int)(Math.random()*Constants.WIDTH));
			pointsList.get(i).addPoint((int)(Math.random()*Constants.WIDTH), (int)(Math.random()*Constants.WIDTH));
		}
		serialize();
	}
	
	public static void main(String[] args) {
		new Uploader();
	}
	
	public void serialize() {
		if(pointsList.size()<1) {
			return;
		}
		File directorySerialized = new File(Constants.projectDirectorySerialized);
		if(!directorySerialized.exists()) {
			directorySerialized.mkdir();
		}
		File file = new File(Constants.projectDirectorySerialized+Constants.fileName);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		
		FileOutputStream fileOutputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try{
			fileOutputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			for(Points current: pointsList){
				objectOutputStream.writeObject(current);
			}
			
			fileOutputStream.close();
			objectOutputStream.close();
			
			System.out.print(Constants.projectDirectorySerialized+Constants.fileName+".txt"+" saved");
		}
		catch(FileNotFoundException err){
			System.out.print(Constants.projectDirectorySerialized+Constants.fileName+".txt"+" not found\n");
		}
		catch(IOException err){
			System.out.print("Error making ObjectOutputStream\n");
		}
		
		for(Points line: pointsList) {
			System.out.println(line);
		}
	}

}
