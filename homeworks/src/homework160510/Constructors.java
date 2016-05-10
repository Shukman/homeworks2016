package homework160510;

public class Constructors {
	
	public static void main(String[] args) {
		
		int a = 0;
		
		String s = "Hello";
		
		Animal dog = new Animal("собака", "Шарик"); // HEAP - куча
		
		dog.play();
		
		Animal[] mikrobs = {new Animal(), new Animal(), new Animal()}; 
		
		
	}

}
