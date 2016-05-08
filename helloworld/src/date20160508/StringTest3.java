package date20160508;

public class StringTest3 {

	public static void main(String[] args) {
		String string = "  alsj1234, , ,kd123fha123lj    k d f l";
		String newstring = string.trim();
		
		System.out.println("string="+string);
		System.out.println("newstring="+newstring);
		
		int kongGe=0;
		int yingWen=0;
		int shuZi=0;
		int qiTa=0;
		char ch;
		
		for(int i=0;i<newstring.length();i++){
			ch = string.charAt(i);
			if (ch == ' ') kongGe++;
			else if (ch>='0' && ch<='9') shuZi++;
			else if (ch>='a' && ch<='z' || ch>='A' && ch<='Z') yingWen++;
			else qiTa++;
		}
		
		System.out.println("kongGe:"+kongGe);
		System.out.println("shuZi:"+shuZi);
		System.out.println("yingWen:"+yingWen);
		System.out.println("qiTa:"+qiTa);
		
		
	}
}
