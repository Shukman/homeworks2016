package homework160428;

import java.util.Arrays;

public class FillArrayWithRandoms {
	
	public static void main(String[] args) {
		
		double r = Math.random();
		
		System.out.println(r);
		
		System.out.println(r * 1000);
		System.out.println((int)r * 1000);
		System.out.println((int)(r * 1000)); //выделяем целую часть
		
		
		int[] x = randomArray(100, 1000);
		
		System.out.println(Arrays.toString(x));
		
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		
		System.out.println(Arrays.binarySearch(x, 15));
	}
	
	static int[] randomArray(int n, int max) {
		
		int[] result = new int[n]; // массив из n чисел
		
//		Arrays.fill(result, 20);// заполнил весь массив двадцатками
		
		for (int i = 0; i < result.length; i++) { 
			result[i] = (int)(Math.random() * max);
		}
		
		return result;
	}

}
