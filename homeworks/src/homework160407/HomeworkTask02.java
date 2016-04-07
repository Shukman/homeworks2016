package homework160407;

public class HomeworkTask02 {
	
	public static void main(String[] args) {
		
		if (args == null) {
			System.exit(1);
		}
		
		if (args.length == 0) {
			System.out.println("Usage: <number>");
			System.exit(0);
		}
		int x = Integer.parseInt(args[0]);
		System.out.println(Integer.toBinaryString(x));
		
		switch (x % 2) {
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		}
		x >>= 1;
		switch (x % 2) {
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		}
		x >>= 1;
		switch (x % 2) {
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		}
		x >>= 1;
		switch (x % 2) {
		case 0:
			System.out.println(0);
			break;
		case 1:
			System.out.println(1);
			break;
		}
	}
}
