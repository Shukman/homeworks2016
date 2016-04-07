package homework160407;

public class SwitchExample2 {
	
	public static void main(String[] args) {
		
		switch (5) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println("нечетная цифра");
			break;
		case 0:
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println("четная цифра");
			break;
				
		}
	}

}
