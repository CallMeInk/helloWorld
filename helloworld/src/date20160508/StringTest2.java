package date20160508;

public class StringTest2 {

	//String类一些常用的方法
	public static void main(String[] args) {
		String string = "yukaiyukai";
		System.out.println("char with index of 3 is:"+string.charAt(3));
		System.out.println("string's length is:"+string.length());
		System.out.println("first time character u appears at:"+string.indexOf("u"));
		System.out.println("first time character u appears at(> index 5):"+string.indexOf("u",5));
		System.out.println(string.substring(2));
		System.out.println(string.substring(2, 6));
	}
}
