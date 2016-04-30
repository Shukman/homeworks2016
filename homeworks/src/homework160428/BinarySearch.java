package homework160428;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] a = {10, 20, -2, 3, 0, 100, -500};
		
		
		System.out.println(Arrays.toString(a));

		Arrays.sort(a); // отсортировали
		
		System.out.println(Arrays.toString(a));
		
		
		int result = binarySearch(a, 20); 
		
		System.out.println(result); 
		System.out.println(a[result]);
	}
	
	static int binarySearch(int[] x, int key) {
		// TODO write code for binary search
		
		int left = 0;
		int right = x.length -1; //длина последнего массива
		
		while(left <= right) {
			int mid = left + (right - left) / 2;
			if(x[mid] == key) {
				return mid;
			}
			if (x[mid] > key) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
}
