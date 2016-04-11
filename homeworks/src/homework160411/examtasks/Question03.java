package homework160411.examtasks;

public class Question03 {
	
	/*
	 * A. Greater than,10
	 * B. false,10
	 * C. Greater than,11
	 * D. false,11
	 * E. compile error in 18
	 * F. compile error in 19
	 */

	public static void main(String[] args) {
		
		int x = 0;
		while (x++ < 10) {}
		String message = x > 10 ? "Greater than" : "false"; // 18
		System.out.println(message + "," + x); // 19
		
	}

}
