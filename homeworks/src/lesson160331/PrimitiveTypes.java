package lesson160331;

public class PrimitiveTypes {
	
	public static void main(String[] args) {
		
		byte b = 1; // 8 bits == 1 byte
		b = Byte.MAX_VALUE;
		b = Byte.MIN_VALUE;
		
		short s = 34; // 16 bits == 2 bytes
		s = Short.MAX_VALUE;
		s = Short.MIN_VALUE;
		
		int i = 10; // 32 bits == 4 bytes
		i = Integer.MAX_VALUE;
		i = Integer.MIN_VALUE;
		
		//long char float double boolean
		
		long l = 10L; //ставим в конце L- константа длинного типа, 64 bits == 8 bytes, целое число, но очень большое.
		l = Long.MAX_VALUE;
		l = Long.MIN_VALUE;
		
		char c = 10; //предназначен для хранения символов, 16 bit == 2 bytes, нет отрицательных чисел, беззнаковый тип
		c = 'A';
//		c = -1;  ERROR!
		c = 65; c++; //код пробела 32
		System.out.println(c);
		c = '\002';//специальный знак с кодом 2
		c = Character.MAX_VALUE;
		c = Character.MIN_VALUE;
		
		float f = 10.3f; //нужно указывать в конце букву f, число с плавающей десятичной точкой. 32 bits == 4 bytes
		f = 10E2f;
		f = 10; //если работает с целым числом, преобразует компилятор в вещественной число
		System.out.println(f);
		f = Float.MAX_VALUE;
		f = Float.MIN_VALUE;
		
		double d = 10.3; // вещественный числа с плавающей точкой, двойной точности, 64 bits == 8 bytes
		d = Double.MAX_VALUE;
		d = Double.MIN_VALUE;
		
		
		
	}
	
	

}
