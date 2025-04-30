package lesson19;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) throws Exception{
		ServerSocket server = null;
		
		server = new ServerSocket(9999);
		while(true) {
			System.out.println("클라이언트 접속 대기");
			Socket client = server.accept();
			System.out.println("스레드 생성");
			HttpThread ht = new HttpThread(client);
			ht.start();
		}
	}
}

class HttpThread extends Thread {
	private Socket client;
	BufferedReader br;
	PrintWriter pw;
	public HttpThread(Socket client) {
		this.client = client;
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		BufferedReader fbr = null;
	    try {
	        String line = br.readLine();
	        System.out.println("Http Header :: " + line);

	        // 요청 헤더 전체 읽기
	        while (!(line = br.readLine()).equals("")) {
	            System.out.println("Http Header :: " + line);
	        }

	        String fileName = "index.html";

	        fbr = new BufferedReader(new FileReader(fileName));
	        pw.println("HTTP/1.0 200 OK");
	        pw.println("Content-Type: text/html; charset=UTF-8");
	        pw.println();
	        String fileLine;
	        while ((fileLine = fbr.readLine()) != null) {
	            pw.println(fileLine);
	        }
	        fbr.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        try {
	            if (br != null) br.close();
	            if (pw != null) pw.close();
	            if (client != null) client.close();
	        } catch (Exception ignore) {}
	    }
	}
}
