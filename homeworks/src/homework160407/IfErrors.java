package homework160407;

public class IfErrors {

	public static void main(String[] args) {
	
		if (args.length == 0) {
			System.out.println("No args!");
			System.exit(1);
		}
			
		System.out.println("args[0]=" + args[0]);
		
		
		int x = 1;
		
//		if (x) { ERROR!!!
//			// ...
//		}
		
//		if (x = 2) {
//			//...
//		}
		
		if (2 == x) { // old school style
			//... 
		}
	}

}
