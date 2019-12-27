import java.io.File;
import java.io.FileWriter;

public class FileWriting {

	public static void main(String[] args){
		new FileWriting().writeFile();
	}
	
	public void writeFile(){
		String inputFileName = "words.txt";
		String text = "we are in words.txt";

		try{
			File currentFile = new File(inputFileName);
            FileWriter fileWriter = new FileWriter(currentFile);

			fileWriter.write(text);

			fileWriter.flush();
			fileWriter.close();
		}
		catch(Exception e){
			System.out.print(inputFileName+"not found\n");
        }

    }
    
}
