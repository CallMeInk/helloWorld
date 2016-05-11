package number25;

public class ExceptionTest {

	public static void test() throws ExceptionDiy{
		throw new ExceptionDiy("Diy exception");
	}
	
	public static void main(String[] args) {
		try {
			test();
		} catch (ExceptionDiy e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
