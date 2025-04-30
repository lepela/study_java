package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyEx {
	public static void main(String[] args) throws Exception{
		// output2.txt 파일을 output3.txt 파일로 복사
		// FileInputStream, FileOutputStream사용
		FileInputStream fis = new FileInputStream("output2.txt");
		FileOutputStream fos = new FileOutputStream("output3.txt");
		
//		fos.write(fis.readAllBytes());
		
//		int b = 0;
//		while((b = fis.read()) != -1) {
//			fos.write(b);
//		}
		
		byte[] bs = new byte[10];
		int length = 0; 
		while((length = fis.read(bs)) != -1) {
			fos.write(bs, 0, length);
		}
		
		fis.close();
		fos.close();
	}
}
