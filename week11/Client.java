import java.io.BufferedReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	private Scanner scanner;
	private Socket socket;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	int port = 8888;
	String echo;
	String response;
	
	public Client() {
		
	}

	public static void main(String[] args) {
		
	}
}
