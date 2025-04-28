package lesson12;

import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=ks40r3zs";
		MyUrl myUrl = new MyUrl(url);
		System.out.println(myUrl);
	}
}

class MyUrl {
	String protocol;
	String domain;
	String fileName;
	String queryString;
	Param[] params;
	
	public MyUrl(String url) {
		protocol = url.substring(0, url.indexOf("://"));
		url = url.substring(url.indexOf("://")+"://".length());
		
		domain = url.substring(0, url.indexOf("/"));
		url = url.substring(url.indexOf("/")+"/".length());

		fileName = url.substring(0, url.indexOf("?"));
		url = url.substring(url.indexOf("?")+"?".length());

		queryString = url;
		String[] tmps = queryString.split("&"); 
		params = new Param[tmps.length];
		for(int i = 0 ; i < tmps.length ; i++) {
			String[] t = tmps[i].split("=");
			params[i] = new Param(t[0], t[1]);
		}
	}
	
	// code 자주사용되는 기능 > 자동생성

	
	@Override
	public String toString() {
		return String.format("MyUrl [protocol=%s, domain=%s, fileName=%s, params=%s]", protocol, domain, fileName,
				Arrays.toString(params));
	}

	class Param {
		String key;
		String value;
		public Param(String key, String value) {
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return String.format("[key=%s, value=%s]", key, value);
		}
	}
}
