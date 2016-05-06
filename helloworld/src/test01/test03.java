package test01;

public class test03 {
	public static void main(String[] args) {
		int array[] = new int[10];
		for (int i=0;i<10;i++) 
			array[i] = i;
		for(int i:array)
			System.out.println(i);
		System.out.println();
	}
}
