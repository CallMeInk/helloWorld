package number39;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Demo2 {

	public static void main(String[] args) throws Exception {
		File file = new File("D://javatest.txt");
		InputStream inputfilestream = new FileInputStream(file);
		byte b[] = new byte[1024];
		int length = 0;
		int tmp = 0;
		while ((tmp = inputfilestream.read())!=-1){
			b[length++] = (byte) tmp;
			System.out.print(tmp+" ");
		}
		//b[length] = "\0";
		System.out.println();
		inputfilestream.close();
		System.out.println(new String(b));
	}
}
