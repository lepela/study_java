package lesson18;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteArrayStream {
	public static void main(String[] args) throws Exception{
		// byte[] 생성
		// 해당 배열을 파일로 작성
		// 작성된 파일을 읽어서
		// byte[] 로 출력
		
		byte[] arr = {65,66,67,68,69};
		ByteArrayInputStream bias = new ByteArrayInputStream(arr);
		FileOutputStream fos = new FileOutputStream("output4.txt");
		fos.write(bias.readAllBytes());
		fos.close();
		
		FileInputStream fis = new FileInputStream("output4.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(fis.readAllBytes());
		System.out.println(baos);
		fis.close();
	}
}
