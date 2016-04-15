package homework160414;

public class StringMethods2 {
	
	public static void main(String[] args) {
		
		String s = "Hello, world!";
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		String name = "Mike";
		
		if (args.length ==0) {
			System.out.println("Enter name");
			return;			
		}
		if (args[0].equalsIgnoreCase(name)) {
			System.out.println("hello, Mike! How are you?");
		}
		if (args[0].startsWith("Mr.")){
			System.out.println("Hello " + args[0]);
		}else {
			System.out.println("Hi, buddy!");
		}
		
		System.out.println(s.endsWith("d!"));
		System.out.println(s.contains("mama"));
		System.out.println(s.indexOf("mama") != -1);
		
		System.out.println(s.replace('o', 'O'));//генерируется новая строчка, а не меняется существующая тк строки не изменны
		System.out.println(s.replace("Hell", "Ад"));
		
		System.out.println("abc".trim());
		System.out.println("\t\n   a b c   ".trim()); //removes white space удаляет пустые символсы слева и справа, что бы осталась значащая серединка
	}

}
