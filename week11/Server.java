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
		scanner = new Scanner(System.in);
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("Server open");
			
			socket = serverSocket.accept();
			
			System.out.println("New connection");
		} catch(IOException e) {
			System.out.printf("Server exception "+e.getMessage());
			e.printStackTrace();
		}	
		



		try {
			bufferedReader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			printWriter = new PrintWriter(
					socket.getOutputStream(), true);
		
				
			Runnable sending = () -> {
				send();
			};
			Runnable recieving = () -> {
				while(true)
				{
					try {
						response = bufferedReader.readLine();
					} catch(SocketException e) {
						System.out.print("Disconnected\n");
						try {
							socket.close();
						} catch (IOException e1) {
							e1.printStackTrace();
						}
						System.exit(1);
					} catch (IOException e) {
					
						e.printStackTrace();
					}
				System.out.print("Other: "+response+"\n");
				}
			};
			Thread sendingThread = new Thread(sending);
			Thread reievingThread = new Thread(recieving);
			sendingThread.start();
			reievingThread.start();
			try {
				sendingThread.join();
				reievingThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (SocketTimeoutException e1) {
			System.out.print("SocketTimeoutException TOOOOOOOOOOO LONJG");
			e1.printStackTrace();
		} catch(IOException e) {
			System.out.print("IOException block: "+e.getMessage()+"\n");
		} finally {
			try {
				socket.close();
				System.out.print("Socket closed");
			} catch(IOException e) {
				System.out.print("Finally block: "+e.getMessage()+"\n");
			}
		}



		
	}

	public static void main(String[] args) {
		new Server();
	}

	public synchronized void send(){
		do
		{
			System.out.print("Enter string to echo\n");
			echo = scanner.nextLine();
			printWriter.println(echo);
		}
		while(!echo.equals("exit"));
	}

}
