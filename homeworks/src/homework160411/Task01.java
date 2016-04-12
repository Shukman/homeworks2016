package homework160411;

public class Task01 {
	
	public static void main(String[] args) {
		
		int[][][] matrix = new int[3][3][3];
		matrix[0][0][0] = 1;
		matrix[0][1][0] = 1;
		matrix[0][2][0] = 1;
		matrix[0][0][1] = 6;
		matrix[0][0][2] = 7;
		matrix[0][1][1] = 9;
		matrix[0][2][2] = 2;
		matrix[0][1][2] = 3;
		matrix[0][2][1] = 3;
		
		matrix[1][0][0] = 3;
		matrix[1][1][0] = 3;
		matrix[1][0][1] = 2;
		matrix[1][1][1] = 1;
		matrix[1][0][2] = 0;
		matrix[1][1][2] = 3;
		matrix[1][2][0] = 3;
		matrix[1][2][1] = 3;
		matrix[1][2][2] = 3;
			
		matrix[2][0][2] = 6;
		matrix[2][2][2] = 3;
		matrix[2][0][0] = 2;
		matrix[2][2][0] = 2;
		matrix[2][1][0] = 0;
		matrix[2][0][1] = 3;
		matrix[2][1][2] = 0;
		matrix[2][1][1] = 3;
		matrix[2][2][1] = 3;

		
		OUTER:
		for (int x = 0; x < 3; x++) {
			for (int y = 0; y < 3; y++) {
				for (int z = 0; z < 3; z++){
					if(matrix[x][y][z] == 0){
						System.out.println(x);
						continue OUTER;
				}
			}
				
			}
		}
	}
}
