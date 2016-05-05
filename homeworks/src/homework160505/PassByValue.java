package homework160505;

public class PassByValue {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		int b = incrementBy10(a); //фактический параметр calc(10) 
		
		a = b;
		
		System.out.println(a);
		
	}

// final фиксирует значение, прописываем один раз и больше не меняем
	private static int incrementBy10(final int myVar) { // формальный параметр
		// final int myVar = 210
//		myVar = myVar + 10; ERROR!
//		System.out.println("myVar = " + myVar);
		return myVar + 10;
	}
}
