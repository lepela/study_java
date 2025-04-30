package lesson18;

import java.io.FileInputStream;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("file.txt");
//		int b = fis.read();
//		System.out.println(b);
//		b = fis.read();
//		System.out.println(b);
		
//		for(int i = 0 ; i < 24 ; i++) {
//			int b = fis.read();
//			System.out.println(b + " :: " + (char)b);
//		}
//		System.out.println(fis.read());
		
		// EOF(End Of File)에 도달시 -1 
//		int b = 0;
//		while((b = fis.read()) != -1) {
//			System.out.println(b + " :: " + (char)b);
//		}
		
//		byte[] bs = new byte[50];
//		int ret = fis.read(bs, 5, 10);
//		System.out.println(Arrays.toString(bs));
//		System.out.println(ret);
		
		byte[] bs = fis.readAllBytes(); // 
		System.out.println(Arrays.toString(bs));
		
		fis.close();
		
		
	}
}
