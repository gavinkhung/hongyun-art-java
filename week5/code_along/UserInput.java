import java.io.File;
import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args){
		new UserInput().read();
	}
	
	public void read(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Y or N: ");

        String response = scanner.next();

        if(response.equals("Y")){
            System.out.println("you said Y");
        } else if(response.equals("N")){
            System.out.println("you said N");
        } else {
            System.out.println("unknown response");
        }

    }
    
}
