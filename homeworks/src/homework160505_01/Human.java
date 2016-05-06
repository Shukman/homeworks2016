package homework160505_01;

public class Human {
	
	private String name;
	
	private boolean isAngry = true;
	private boolean isTired = true;
	
	public Human(String name) {
		this.name = name;
	}

	public void wakeUp(String alarmСlock){
		if(isAngry){
			System.out.println("'" + name + "'" + " бросает " + alarmСlock + " подальше!");
			isAngry = false;
			
		} else { 
			System.out.println("'" + name + "'" + " медленно потягивается и выключает " + alarmСlock);
		}
	}
	int count = 0;
	public void phone(String beforeAfternoon) {
		if(isTired){
			System.out.println("Позвонили " + beforeAfternoon + ". '" + name + "'" + " поднимает телефон");
			isTired = false;
		} else {
			System.out.println("Позвонили " + beforeAfternoon + ". '" + name + "'" + " спит дальше");
			count++;
			if(count > 2){
				System.out.println("'" + name + "'" + " поднимает телефон");
				isTired = true;
				count = 0;
			}
		}
	}

}
