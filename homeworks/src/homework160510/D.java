package homework160510;

public class D {
	
	public static final int MAX = 20;
	
	static int счетчик; // поле класса
	
	int count; // поле экземпляра
	
//	int count; переменная экземпляра объекта класса D count 
//что бы считать сколько раз используется класс D() 
	{
		count++;
		System.out.println("count = " + count);
	
		счетчик++;
		System.out.println("счетчик = " + счетчик);
	}
	
	final static void method4(){}
	static final void method3(){}
	
	public void mathodA(){
		return;
	}

}
