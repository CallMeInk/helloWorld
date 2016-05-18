package number39;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo3 {

	public static void main(String[] args) throws Exception {
		File file = new File("D://javatest.txt");
		OutputStream out = new FileOutputStream(file,true);
		String str ="-------append";
		out.write(str.getBytes());
		out.close();
	}
}
