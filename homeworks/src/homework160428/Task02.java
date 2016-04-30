package homework160428;

import java.util.Arrays;

public class Task02 {
	
	public static void main(String[] args) {
		
		int [][] matrix = {
				{1, 5, 6, 3, 7},
				{9, 11, 2, 5, 26},
				{24, 1, 7, 8, 17},
				{95, 23, 12, 1, 0},				
				{54, 34, 452, 10, 123},				
				{1, 2, 1000, 10, 12},				
				{0, 123, 21, 1, 1},				
				{0, 323, 21, 110, 111},				
				{0, 31, 223, 14, 13},				
			};
		
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println();
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");							
			}
			System.out.println();
		}
		System.out.println();
		int[] otvet = maxValue(matrix);
		System.out.println("Максимальное значение каждой строки матрицы:");
		System.out.println(Arrays.toString(otvet));
		
	}	

	static int[] maxValue(int[][] a){
	
		int k = 0;
		int[] result = new int [a.length];
		
		for (int i = 0; i < a.length; i++) {
			int max = a[i][0];
			
			for (int j = 0; j < a[i].length; j++) {
				
				if(max < a[i][j]) {
					max = a[i][j];
				}
				
				if(j == a[i].length - 1){
					result[k] = max;
					k++;
				}
			}	
		}
		return result;
	}

}
