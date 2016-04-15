package homework160414;

public class StringMethods {
	
	public static void main(String[] args) {
		
		String s = "Hello, world!";
		
		System.out.println(s.length()); //какова длина строки
		
		for (int i = 0; i < s.length(); i++) { //от нуля до номера последнего символы строки
			System.out.println(i + ":" + s.charAt(i));//возвращает нам символ соответвствующий номеру строки
		}
		
		System.out.println(s.charAt(0));
//		System.out.println(s.charAt(s.length()));
		System.out.println(s.charAt(s.length() - 1));
		
		System.out.println(s.indexOf('w'));
		
		System.out.println(s.indexOf('o'));
		System.out.println(s.lastIndexOf('o'));
		
		String phrase = "If the thatcher of thatchwood went to thatch it a thatching...";
		
		System.out.println(phrase.indexOf("went"));
		System.out.println(phrase.indexOf("thatch", 35));
		
		System.out.println(s.substring(6));
		System.out.println(s.substring(7, 12));

		String w = s.substring(7, 12);
		
		System.out.println(w);
		
		System.out.println(s.substring(2,2).length());

//		s.substring(2,15); ERROR 
//		s.substring(2,1); ERROR 
	}

}
