package homework160505;

public class Host {
	
	public static void main(String[] args) {
		
		Animal kittie = new Animal("Кот", "Барсик"); //create создаем экземпляр животного
//		kittie.name = "Барсик"; //set state
//		kittie.kind = "Кот"; // set state
		kittie.feed("сосика"); // send message
		kittie.feed("сосика"); // send message
		kittie.feed("сосика"); // send message
		kittie.play();
		kittie.play();
//		kittie.isHungry = false; поставили private
		kittie.play();
	}

}
