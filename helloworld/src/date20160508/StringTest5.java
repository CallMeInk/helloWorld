package date20160508;

public class StringTest5 {
	public static void main(String[] args) {
		String string = "11,122,351,14,15";
		int array[] = new int[5];
		char ch;
		int count = 0;
		int head = -1;
		for (int i=0;i<string.length();i++){
			ch = string.charAt(i);
			if (!(ch>='0' && ch<='9')){
				array[count] = Integer.parseInt(string.substring(head+1,i));
				count++;
				head=i;
			}
		}
		array[count] = Integer.parseInt(string.substring(head+1,string.length()));
		for(int i:array){
			System.out.println(i);
		}
	}
}
