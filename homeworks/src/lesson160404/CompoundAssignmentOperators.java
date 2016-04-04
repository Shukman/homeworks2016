package lesson160404;

public class CompoundAssignmentOperators {
	
	public static void main(String[] args) {
		
		int x = 2, y = 3;
		
		x = x + y;  // 5
		
		x += y;
		
		
		
		long n = 10;
		int m = 5;
		
		m = (int)(m * n);
		
		m *= n;
		
		long l = 5;
		long k = l = 3;
		System.out.println(l);
		System.out.println(k);
		
	}


}
