package homework160411.examtasks;

public class Question01 {
	
	/*
	 * Какая из этих операций может использоваться с boolean переменной?
	 * 
	 * A. ==
	 * B. +
	 * C. --
	 * D. |
	 * E. %
	 * F. <=
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		boolean  x = true;
		
		boolean y = (x == false);
		
//		y = x + 0;  ERROR!
		
//		x--;  ERROR!
		
		y = x | true;
		
//		y = x % 0;   ERROR!
		
//		y = x <= 0;  ERROR!
		
	}

}
