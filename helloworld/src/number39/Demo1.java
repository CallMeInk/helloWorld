package number39;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Demo1 {

	public static void main(String[] args) throws Exception {
		File file = new File("D://javatest.txt");
		InputStream inputfilestream = new FileInputStream(file);
		int length = (int) file.length();
		byte b[] = new byte[length];
		inputfilestream.read(b);
		inputfilestream.close();
		System.out.println(new String(b));
	}
}
