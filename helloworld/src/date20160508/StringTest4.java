package date20160508;

public class StringTest4 {
	public static void main(String[] args) {
		String string = "yukai";
		String newstring = new StringBuffer(string).reverse().toString();
		System.out.println(newstring);
	}
}
