package number40;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class Demo {
	
	public static void main(String[] args) throws Exception {
		File file = new File("D://javatest.txt");
		Reader reader = new FileReader(file);
		char c[] = new char[1024];
		int length = reader.read(c);
		reader.close();
		System.out.println(new String(c,0,length));
	}

}
