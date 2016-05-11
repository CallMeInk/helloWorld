package number25;

public class Demo1 {

	public static void main(String[] args) {
		String s = "123a";
		try{
			int i = Integer.parseInt(s);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
		

		System.out.println("now run here!");
	}
}
