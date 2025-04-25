package lesson16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileToStream {
	public static void main(String[] args) throws Exception{
		Path path = Paths.get("src/lesson16/FileToStream.java");
		Files.lines(path).forEach(System.out::println);
		System.out.println("==============================");
		FileReader fr = new FileReader(path.toFile());
		BufferedReader br = new BufferedReader(fr);
		br.lines().forEach(System.out::println);
		br.close();
	}
}
