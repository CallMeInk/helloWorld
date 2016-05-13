package number27;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		int array[] = {1,2,3,4,5};
		System.out.println(array);
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.binarySearch(array, 4));
		Arrays.fill(array, 4);
		System.out.println(Arrays.toString(array));
	}
}
