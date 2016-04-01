package lesson160331;

public class Task01 {
	
	public static void main(String[] args) {
		
//пример 1 вариант 1		
		double x = 28E3;
		System.out.println("ќклад по часам: " + x + "р");

		double y = 1E3;
		System.out.println("ƒоплата за питание: " + y + "р");

		double c = 1145.22;
		System.out.println("ƒоплата за ночные часы: " + c + "р");

		double l = x + y + c;
		System.out.println("ќбщий облагаемый доход: " + l + "р");
		
		double p = (l * 13 / 100);
		System.out.println("¬сего удержано: " + p + "р");
		
		double z = l - p;
		System.out.println("  выплате: " + z + "р");
		
		System.out.println();
//пример 1 вариант 2
		double z1 = l - ((x + y + c) * 0.13);
		System.out.println("  выплате: " + z1 + "р"); 
		
		System.out.println();
//пример 2 вариант 1		
		int ozp = 30_000;
		int nalog = (ozp * 13 / 100);
		int zp = ozp - nalog;
		System.out.println("обща€ заработна€ плата - " + ozp);
		System.out.println("вычитаемый налог - " + nalog);
		System.out.println("заработна€ плата к выплате - " + zp);
		
		System.out.println();
//пример 2 вариант 2
		int zp1 = ozp - (ozp * 13 / 100);
		System.out.println("заработна€ плата к выплате - " + zp1);
	}

}
