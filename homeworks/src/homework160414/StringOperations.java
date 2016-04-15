package homework160414;

public class StringOperations {
	
	public static void main(String[] args) {
		
		// Concatenation - объеденять две строки
		
		System.out.println("Hello" + "World");
		
		System.out.println("x=" + 200);
		
		String s = "x=" + 200;
		
		System.out.println(s);
		
		for (char c : s.toCharArray()) { //строчку переводим в массив символов и печатаем
			System.out.println((int)c); // напечатают коды символов если добавить int			
		}
		
		System.out.println(1 + 2);
		System.out.println('A' + 'B'); //если стоит плюс, преобразуются в числа
		System.out.println("A" + 'B');//если один из них строка
		System.out.println('A' + "B");
		System.out.println(1 +  2 + "B"); //выражение вычисляется слева на право
		System.out.println("" + 1 + 2 + "B");
		
		int i = 1;
		int j = 2;
		System.out.println("" + i + j + "B");
		
		s += "..."; // s = s + "..."
		
		s += 10;
		
		System.out.println(s);
	}
}
