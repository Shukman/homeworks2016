package homework160407;

public class HomeworkTask03 {
	
	public static void main(String[] args) {
		
		if (args == null) {
			System.exit(1);
		}
		
		if (args.length == 0) {
			System.out.println("Usage: <number>");
			System.exit(0);
		}
		int x = Integer.parseInt(args[0]);
		System.out.println("Проверка: " + Integer.toBinaryString(x));
		
		String stroka = ""; //создание пустой строки
		int ostatok; // создание переменной
		
		while (x != 0) { // Пока число не равно 0
			ostatok = x % 2; // получаем остатой от деления числа на 2
			x = x / 2; // делим наше число
			stroka = stroka + ostatok; // попорядку записываем остаток от деления
		}
		
		for (int i = 0; i < stroka.length(); i++) { // пробегаемся по каждому элементу строки
			System.out.println(stroka.charAt(i)); // вывод каждого элемента строки в том направление в котором оно считывается
			
		}
		
	}
}
