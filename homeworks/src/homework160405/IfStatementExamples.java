package homework160405;

public class IfStatementExamples {
	
	public static void main(String[] args) {
		
		int x = 20;
		
		int y = 30;
		
		if (x < y)
			System.out.println("Less than");
		else
			System.out.println("Greater than");

		boolean isLessThan = x < y;
		
		if (isLessThan) {
			System.out.println("I have checked x and y and that's what i say: ");
			System.out.println("Less than");
		}
		else
			System.out.println("Greater than");  
		
	}

}
