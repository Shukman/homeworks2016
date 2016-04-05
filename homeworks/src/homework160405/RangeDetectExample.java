package homework160405;

import java.util.Arrays;

public class RangeDetectExample {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: EvenOddExample <number>");
			System.exit(0);
		}
		
		String argsList = Arrays.toString(args);
		System.out.println(argsList);
		
		int x = Integer.parseInt(args[0]);
		
		/*
		 * если х между 10 и 20 включительно  - напечатать ПОПАЛ
		 * иначе (если х меньше 10 или х больше 20) - напечатать МИМО
		 */
		
		if (x >= 10 && x <= 20) {
			System.out.println("POPAL");
		} else {
			System.out.println("MIMO");
		}
		
	}

}
