package homework160510;

public class Animal {
	
	// class members: fields, other class, methods
	//state - описывает состояние
	
	private String name; // поле, field		null
	private String kind;				//  null
	private boolean isHungry = true;
	
	{//блоки инициализации
		System.out.println("создано очередное животное");
		
	}
	
	public Animal(boolean h, String n, String k){
		kind = k;
		name = n;
		isHungry = h;
	}
	
	public Animal(String kind){
		this.kind = kind;
		name = "";
		isHungry = false;
	}
	
	public Animal(String kind, String name) { //конструктор, название совпадает с классом и нет типа возвращаемого значения
		this(true, name, kind); //использовать конструктор уже существующий выше
	}
	
	public Animal() {
		this("микроб", "");
//		this(true, "", "микроб");
	}
	
	//behavior - описывает поведение

	public void feed(String food) { //метод экземпляра instance method
		if(isHungry){
		System.out.println(kind + " '" + name + "' ест " + food);
		isHungry = false;
		}else{
			System.out.println(kind + " '" + name + "' играет с " + food);
		}
	}
	
	public void play() { // no static ==> instance method
		if(isHungry) {
			System.out.println(kind + " '" + name + "' обиделся и залез в коробку ");
		} else {
			System.out.println(kind + " '" + name + "' играет, пока не проголодался ");
			isHungry = true;
		}
	}

}
