package homework160512;

public class Recursion {
	
	public static void main(String[] args) {
		
		Object o = new Object();
		
		o.toString();
		
		a();
		
		d(0);
		
	}
	
	static void d(int depth){
		System.out.println("depth = " + depth++);
		d(depth);
	}

	private static void a() {
		System.out.println("a");
		b();
	}

	private static void b() {
		System.out.println("b");
		c();
	}

	private static void c() {
		System.out.println("c");
		new Exception().printStackTrace(); //классу Exception посылаем сообщение на метод printStactTrace(напечатать трассировку стека)
	}

}
