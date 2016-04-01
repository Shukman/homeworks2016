package lesson160331;

public class Operators {
	
	public static void main(String[] args) {
		int y = 4; //просим отвести место в памяти компьютера, размером под целое число.(32бита)
		double x = 3 + 2 * y; //вещественное число двойной точности
		
		System.out.println(x);
		
		int a = 125;
		System.out.println(Integer.toBinaryString(a));

		int b = 315;
		System.out.println(Integer.toBinaryString(b));
		
		double z = 10E2;
		System.out.println(z);
		
		System.out.println(10/3);
		
		double d = 10.0 / 3;
		System.out.println(d); // печатается вещественное число, но без дробей, тк 10 и 3 целые числа, сделаем не 10 а 10.0
		
		float f = 10 / 3f;
		System.out.println(f); //как только одно из чисел сделали вещественное(3f), сразу получаем вещественное число с дробями
		
		int xx = 1;
		long yy = 33;
		float ff = 1f;
		System.out.println(xx * yy * ff);
		
		int x1 = 100_000;
		int y1 = 100_000;
		
		System.out.println(x1 * y1); //не помещается в целое число, тк число слишком большое и часть информации теряется
		
		long l1 = x1 * y1;
		System.out.println(l1); // проблемы тк числа целые, поэтому и запись идет для целых и впихивается в 32 бита
		
		long x2 = 100_000;
		long y2 = 100_000;
		
		long l2 = x2 * y2;
		System.out.println(l2);
	}

}
