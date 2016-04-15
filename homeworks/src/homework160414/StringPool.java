package homework160414;

public class StringPool {
	
	public static void main(String[] args) {
		
		String name = "Mike";

		String name2 = "Mike";
		
		String name3 = new String("Mike");

		System.out.println(name == name2);//один и тот же объект?
		System.out.println(name == name3);//один и тот же объект?
		
		System.out.println(name.equals(name3));//спрашиваем: объект нейм равен объекту неймтри
		
	}

}
