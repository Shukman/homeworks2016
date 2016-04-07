package homework160407;
import java.util.Arrays;
public class HomeworkTask01 {
	
	public static void main(String[] args) {
		if (args == null) {
			System.exit(1);
		}
		if (args.length == 0) {
			System.out.println("Usage: <hello phrase>");
			System.exit(0);
		}
		String argsList = Arrays.toString(args);
		System.out.println(argsList);
		
		int x = Integer.parseInt(args[0]);
		System.out.println(Integer.toBinaryString(x));
		
		if (x == 0) {
			System.out.println(0);
		}
		if (x == 1) {
			System.out.println(1);
		}
		if (x == 2) {
			System.out.println(0);
			System.out.println(1);
		}
		if (x == 3) {
			System.out.println(1);
			System.out.println(1);
		}
		if (x == 4) {
			System.out.println(0);
			System.out.println(0);
			System.out.println(1);
		}
		if (x == 5) {
			System.out.println(1);
			System.out.println(0);
			System.out.println(1);
		}
		if (x == 6) {
			System.out.println(0);
			System.out.println(1);
			System.out.println(1);
		}
		if (x == 7) {
			System.out.println(1);
			System.out.println(1);
			System.out.println(1);
		}
		if (x == 8) {
			System.out.println(0);
			System.out.println(0);
			System.out.println(0);
			System.out.println(1);
		}
		if (x == 9) {
			System.out.println(1);
			System.out.println(0);
			System.out.println(0);
			System.out.println(1);
		}	
	}
}
