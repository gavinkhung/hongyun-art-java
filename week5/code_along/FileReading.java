import java.io.File;
import java.util.Scanner;

public class FileReading {
	
	public static void main(String[] args){
		new FileReading().readFile("words.txt");
	}
	
	public void readFile(String inputFileName){
		File currentFile = new File(inputFileName);
		try{
            Scanner scanner = new Scanner(currentFile);
            
            while(scanner.hasNext()){
                System.out.print(scanner.nextLine()+"\n");
            }

            scanner.close();
		}
		catch(Exception e){
			System.out.print(inputFileName+" not found\n");
        }

    }
    
}
