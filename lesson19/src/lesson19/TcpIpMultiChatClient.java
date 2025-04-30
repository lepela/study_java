package lesson19;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpMultiChatClient {
	public static void main(String[] args) throws Exception{
		String name = "박종민";
		String serverIp = "192.168.0.27";
		Socket socket = new Socket(serverIp, 7777);
		System.out.println("서버에 연결되었습니다");
		new ClientSender(socket, name).start();
		new ClientReceiver(socket).start();
	}
	static class ClientSender extends Thread {
		Socket socket;
		DataOutputStream out;
		String name;
		public ClientSender(Socket socket, String name) throws Exception{
			this.socket = socket;
			this.name = name;
			out = new DataOutputStream(socket.getOutputStream());
		}
		@Override
		public void run() {
			Scanner scanner = new Scanner(System.in);
			try {
				if(out != null) out.writeUTF(name);
				while(out != null) out.writeUTF("[" + name + "] :: " + scanner.nextLine());
			} catch (IOException e) {}
			finally {
				scanner.close();
			}
		}
	}
	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		public ClientReceiver(Socket socket) throws Exception{
			this.socket = socket;
			in = new DataInputStream(socket.getInputStream());
		}
		@Override
		public void run() {
			while(in != null) {
				try {
					System.out.println(in.readUTF());
				} catch (IOException e) {}
			}
		}
	}
}
