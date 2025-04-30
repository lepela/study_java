package lesson19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpIpMultiChatServer {
	HashMap<String, DataOutputStream> clients;
	
	public static void main(String[] args) {
		new TcpIpMultiChatServer().start();
	}
	
	public TcpIpMultiChatServer() {
		clients = new HashMap<>();
		Collections.synchronizedMap(clients);
	}
	
	void sendToAll(String msg) {
		Iterator<String> it = clients.keySet().iterator();
		while(it.hasNext()) {
			try {
				clients.get(it.next()).writeUTF(msg);
			} 
			catch(Exception e) {}
		}
	}
	
	public void start() {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작 되었습니다");
			
			while(true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + "] 에서 접속하셨습니다");
				new ServerReceiver(socket).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {}
		}
		@Override
		public void run() {
			String name = "";
			try {
				name = in.readUTF();
				sendToAll(name + "님이 입장하셨습니다");
				clients.put(name, out);
				System.out.println("현재 접속자 수는 " + clients.size() + "입니다");
				while(in != null) sendToAll(in.readUTF());
			}
			catch (Exception e) {}
			finally {
				sendToAll(name + "님이 퇴장하셨습니다");
				clients.remove(name);
				System.out.println("현재 접속자 수는 " + clients.size() + "입니다");
			}
		}
	}
}
