package lesson19;

import java.net.URL;

public class URLEx {
	public static void main(String[] args) throws Exception{
		String addr = "https://search.naver.com:443/a/b/c/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=qk4sda5a#abcd";
		URL url = new URL(addr);
		System.out.println(url.getProtocol());
		System.out.println(url.getHost());
		System.out.println(url.getPort());
		System.out.println(url.getPath());
		System.out.println(url.getFile());
		System.out.println(url.getQuery());
		System.out.println(url.getRef());
	}
}
