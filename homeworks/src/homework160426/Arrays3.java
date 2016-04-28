package homework160426;

public class Arrays3 {
	
	public static void main(String[] args) {
		
		String[] bugs = {"Light", "Severe", "Disaster"};
		String[] troublse; //можно хранить адрес массива строк
		
		troublse = bugs;
		
		System.out.println(troublse); //покажет массив ссылок на строки
		System.out.println(bugs); //содержится ссылка на массив строк по адрсу такому
		
		System.out.println(troublse == bugs);
		
		
	}

}
