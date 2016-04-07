package homework160407;

public class IfTypicalUseCases {
	
	public static void main(String[] args) {
		
		int x = 20;
		
		boolean isEven = isEven(x);
	}

	private static boolean isEven(int x) {
//		if (x % 2 == 0)	{
//			return true;
//		} else {
//			return false;			
//		}
		
		return x % 2 == 0; // короткая запись
	}

}
