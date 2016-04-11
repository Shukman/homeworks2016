package homework160411;

public class ContinueExamples {
	
	public static void main(String[] args) {
		
		int x = 1_000_000;
		for(;;) {
			if (x % 5 ==0) {
				System.out.println(x);
				x -= 1001;
				continue;
			}
			x--;
			if (x < 0) {
				break;
			}
		}
		
		int[][] matrix = {
				{1,0,3,0,0},
				{6,7,8,9,10},
				{11,12,0,14,15},
				{110,12,13,14,15},
				{120,12,13,14,15},
				{131,0,13,14,15},
		};
		System.out.println("___________");
		
		OUTER:
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				if(matrix[row][column] == 0){
					System.out.println(row);
//					break;
					continue OUTER;
				}
			}
		}
		
	}

}
