package number38;

import java.io.File;

public class Demo2 {

	public static void main(String[] args) {
		File file = new File("d:\\javaTest\\javatest.txt");
		boolean flag = file.exists();
		if (flag){
			flag = file.delete();
			if (flag){
				System.out.println("delete success");				
			}else{
				System.out.println("delete fail");
			}
		}else{
			System.out.println("not exsit!");
		}
		
		//目录的删除需要先将目录里的所有文件全部删除
		file = new File("d:\\javaTest");
		flag = file.exists();
		if (flag){
			flag = file.delete();
			if (flag){
				System.out.println("delete success");
			}
			else{
				System.out.println("delete fail");
			}
		}
		else{
			System.out.println("dir not exsit");
		}
		
	}
}
