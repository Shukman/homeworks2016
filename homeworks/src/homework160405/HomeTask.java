package homework160405;

import java.util.Arrays;

public class HomeTask {
	
	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("Usage: HomeTask <number>");
			System.exit(0);
		}
		
		String argsList = Arrays.toString(args);
		System.out.println(argsList);
		
		int x = Integer.parseInt(args[0]);
	
		/*
		 * Example1:
		 * 2 mnogo
		 * 5 malo
		 * 1 v samblu raz
		 * 
		 * Example2:
		 * 2 mnogo
		 * 5 malo
		 * 1 v samblu raz
		 * remain povtorite, plz
		 */
		System.out.println("Example 1: ");		
		if (x == 1){
			System.out.println("v samblu raz");
		}
		if	(x == 2){
			System.out.println("mnogo");
		}
		if	(x == 5){ 
			System.out.println("malo");
		}

		System.out.println();
		System.out.println("Example 2: ");
		if (x == 1)
			System.out.println("v samblu raz");
		else if	(x == 2)
			System.out.println("mnogo");
		else if	(x == 5) 
			System.out.println("malo");
		else 
			System.out.println("povtorite, plz");
	}

}
