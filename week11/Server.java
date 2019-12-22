import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	
	private Scanner scanner;
	private Socket socket;
	private BufferedReader bufferedReader;
	private PrintWriter printWriter;
	int port = 8888;
	String echo;
	String response;
	
	public Server() {
		
	}

	public static void main(String[] args) {
		
	}

}
