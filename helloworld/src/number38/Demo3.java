package number38;

import java.io.File;

public class Demo3 {
	
	public static void listFile(File file){
		if (file.isDirectory()){
			File files[] = file.listFiles();
			//System.out.println("files_length = "+files.length);
			for (int i=0;i<files.length;i++)
			listFile(files[i]);
		}
		else{
				System.out.println(file);					
		}
	}
	

	public static void main(String[] args) {
		File file = new File("D://ctex");
		System.out.println(file.isDirectory());
		listFile(file);
	}
}
