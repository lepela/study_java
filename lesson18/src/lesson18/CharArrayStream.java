package lesson18;

import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class CharArrayStream {
	public static void main(String[] args) throws Exception{
		String str = "ABCDE 가나다라";
		CharArrayReader car = new CharArrayReader(str.toCharArray());
		FileWriter fw = new FileWriter("output5.txt");
		
		int c = 0;
		while((c = car.read()) != -1) {
			System.out.println(c);
			fw.write(c);
		}
		fw.close();
		
		FileReader fr = new FileReader("output5.txt");
		CharArrayWriter caw = new CharArrayWriter();
		while((c = fr.read()) != -1) {
			caw.write(c);
		}
		System.out.println(caw);
		String str2 = caw.toString();
		System.out.println(str2);
		fr.close();
		
		
		
			
	}
}
