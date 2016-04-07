package homework160407;

public class SwitchExample4 {
	
	public static void main(String[] args) {
		
		if (args == null) {
			System.exit(1);
		}
		
		if (args.length == 0) {
			System.out.println("Usage: <hello phrase>");
			System.exit(0);
		}
		
		final String hello = "Hello";
		
		switch (args[0]) {
		case hello:
			System.out.println("Hi there!");
			break;
		case "Привет":
			System.out.println("Здорово!");
			break;
		case "Шолом":
			System.out.println("Лэхаим");
			break;
		default:
			System.out.println("Улыбаемся и машем");	
		}
	}

}
