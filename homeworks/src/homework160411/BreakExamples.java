package homework160411;

public class BreakExamples {
	
	public static void main(String[] args) {
		
		int x = 1;
		int n = 0;
		
		while (true){ // for (;;)
			x = x * 2;
			n++;
			if (x > 1_000_000) {
				break;
			}
		}
		System.out.println(x);
		System.out.println(n);
		System.out.println();
		
		int[][] matrix = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{110,12,13,14,15},
				{120,12,13,14,15},
				{131,12,13,14,15},
		};
		int sum = 0;
		OUTER:
			for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
				if (sum > 20){ 
					System.out.println("sum= " + sum + " i=" + i + " j=" + j + " m[i][j]=" + matrix[i][j]);
						break OUTER;
				}
			}
			//breaj goes here!
		}
		//break OUTER goes here!!!
	}
	

}
