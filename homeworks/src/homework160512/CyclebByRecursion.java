package homework160512;

public class CyclebByRecursion {
	
	public static void main(String[] args) {
		
		//способ 1
		print(10);
		System.out.println();
		//способ 2
		print2(0, 10);
		
		
	}

	private static void print2(int i, int n) {
		if (i >= n){
			return;
		}
		System.out.println(i);
		print2(i+1, n); //tail recursion (хвостик)
	}
//		if(i < n){
//			System.out.println(i);
//			print2(i+1, n);
//		}

	private static void print(int i) {
		if(i > 0) {
			print(i-1);
			System.out.println(i - 1);
		}
	}

}
