package homework160411;

public class MoreForLoopExamples {
	
	public static void main(String[] args) {
		
		int x = 0;
		int y = 0;
		int z = 0;
		
		for (y = 0, z = 4, x = 3; x < 5 && y < 10; x++, y++){
			System.out.print(y + " ");
		}
		System.out.println();
		System.out.println(x);
//		System.out.println(y); ERROR!! y is out of scope
//		System.out.println(z); ERROR!! z is out of scope
	
//		for (int n = 10;;){
//			
//		}
		
//		for (;; x += 10) {
//			System.out.println(x);
//		}
		
//		for (; x < 100;){ //while (x < 100) {}
//			
//		}
			
	}

}
