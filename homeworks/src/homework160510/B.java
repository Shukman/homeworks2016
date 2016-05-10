package homework160510;

public class B extends Object{
	
	{
		System.out.println("раз");
	}
	
//	public B(){
//	super();
//	} можно не писать, компилятор создаст конструктор по умолчанию
	
	{
		System.out.println("два");
	}
	
	public static void main(String[] args) {
		new B();
	}

}
