package number27;

public class StringBufferTest {

	public static void main(String[] args) {
		
		
		//StringBuffer始终对一个对象进行操作，这点不同于string，如果经常会对字符串进行修改，推荐使用stringbuffer
		StringBuffer test = new StringBuffer("123");
		System.out.println(test);
		test.append(12);
		System.out.println(test);
	}
}
