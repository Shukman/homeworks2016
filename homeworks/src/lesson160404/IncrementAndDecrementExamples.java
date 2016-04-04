package lesson160404;

public class IncrementAndDecrementExamples {
	
	public static void main(String[] args) {
		
		int counter = 0;
		
		System.out.println(counter);  // 0
		System.out.println(++counter); // 1
		System.out.println(counter); // 1
		System.out.println(counter--);  // 1
		System.out.println(counter);  // 0
		
		
		int x = 3;
		
		int y = ++x * 5 / x-- + --x;
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		
		x++;
		
		x = 40;
		
//		x+3;
	}

}
