package date20160508;

public class StringTest {
	
	public static void main(String[] args) {
		String name1 = "yukai";
		String name2 = new String("yukai");
		String name3 = name2;
		
		//==比较的是地址，equals比较的是内容
		System.out.println("name1==name2:"+(name1==name2));
		System.out.println("name1==name3:"+(name1==name3));
		System.out.println("name2==name3:"+(name2==name3));
		
		System.out.println("name1.equals(name2):"+name1.equals(name2));
		System.out.println("name1.equals(name3):"+name1.equals(name3));
		System.out.println("name2.equals(name3):"+name2.equals(name3));
		
		//直接赋值的方式，当内容一样时，不会再新创建，而new每次都新创建一个
		String name4="ink";
		String name5="ink";
		System.out.println("name4==name5:"+(name4==name5));
		
		String name6 = new String("ink");
		String name7 = new String("ink");
		System.out.println("name6==name7:"+(name6==name7));
		
		//String内容的不可变性,name8的地址已经改变，原来name8指向的“abc”还存在在堆中，新的那name8指向“abcd”
		String name8 = new String ("abc");
		name8 += "d";
		System.out.println("name8="+name8);
	}

}
