package lesson05;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class FileDownloader {
	public static void main(String[] args) throws Exception {
		String img = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNTAzMTFfMjQy%2FMDAxNzQxNjg1NDYxNTUx.v4tN2D0b5ylmNdDzRWwhSBDorD3odSA09JR3YYAd2V0g.4WTFwJdys3M-L1TkqEXOkprtChBuiXcy0UWMZGTAWUUg.PNG%2F%25B0%25ED%25BE%25E7%25C0%25CC%25C5%25B8%25BF%25EC%25B8%25B07.png&type=sc960_832";
		URL url = new URL(img);
		
		InputStream is = url.openStream();
		FileOutputStream fos = new FileOutputStream("img.png");
		
		int b = 0;
		while( (b = is.read()) != -1) {
			fos.write(b);
		}
		fos.close();
	}
}
