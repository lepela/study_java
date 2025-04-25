package lesson17;

public class ProcessEx {
	public static void main(String[] args) throws Exception{
		Process p1 = Runtime.getRuntime().exec("notepad.exe");
		Process p2 = Runtime.getRuntime().exec("mspaint.exe");
		p1.waitFor();
		p2.destroy();
	}
}
