package lesson160404;

public class PrimitiveTypes2 {
	
	public static void main(String[] args) {
		boolean b, b2, isBlack;
		
		b = false;
		
		b2 = true;
		
		isBlack = !b;
		
		System.out.println(b);
		
		System.out.println(isBlack);
		
		
		boolean isTall = false;
		
		System.out.println(isBlack || isTall);
		System.out.println(isBlack && isTall);
//		System.out.println(isBlack && 0);  ERROR!!!
//		System.out.println(isBlack || 0);  ERROR!!!
		
		System.out.println(isBlack & isTall);
		
	}
	

}
