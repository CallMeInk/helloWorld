package number38;

import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\javaTest");
		boolean success = file.mkdir();
		if (success){
			System.out.println("create success!");
			File file2 = new File("D:\\javaTest\\javatest.txt");
			success = file2.createNewFile();
			if (success){
				System.out.println("success!");
			}
			else{
				System.out.println("fail!");
			}
		}
		else{
			System.out.println("create fail!");
		}
		
	}
}
