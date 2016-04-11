package homework160411.examtasks;

public class Question04 {
	
	/*
	 * A. 10, 14,
	 * B. 10, 14
	 * C. 10,
	 * D.
	 * E. 
	 * F. infinitive loop
	 */
	
	public static void main(String[] args) {
		
		java.util.List<Integer> list = new java.util.ArrayList<Integer>();
		list.add(10);
		list.add(14);
		for (int x : list) {
			System.out.print(x + ", ");
			break;
		}
		
	}

}
