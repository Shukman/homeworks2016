package homework160505;

public class Animal {
	
	// class members: fields, other class, methods
	
	private String name; // поле, field
	private String kind;
	private boolean isHungry = true;
	
	public Animal(String kind, String name) { //конструктор, название совпадает с классом и нет типа возвращаемого значения
		this.kind = kind;
		this.name = name;
	}

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
