package lesson160331;

public class Task01 {
	
	public static void main(String[] args) {
		
//example 1.1		
		double x = 28E3;
		System.out.println("pay by the hour: " + x + "p");

		double y = 1E3;
		System.out.println("extra charge for food: " + y + "p");

		double c = 1145.22;
		System.out.println("surcharge for night: " + c + "p");

		double l = x + y + c;
		System.out.println("the total taxable income: " + l + "p");
		
		double p = (l * 13 / 100);
		System.out.println("total retained: " + p + "p");
		
		double z = l - p;
		System.out.println("payoff: " + z + "p");
		
		System.out.println();
//example 1.2
		double z1 = l - ((x + y + c) * 0.13);
		System.out.println("payoff: " + z1 + "p"); 
		
		System.out.println();
//example 2.1		
		int ozp = 30_000;
		int nalog = (ozp * 13 / 100);
		int zp = ozp - nalog;
		System.out.println("pay by the hour - " + ozp);
		System.out.println("total retained - " + nalog);
		System.out.println("payoff - " + zp);
		
		System.out.println();
//example 1.2
		int zp1 = ozp - (ozp * 13 / 100);
		System.out.println("payoff - " + zp1);
	}

}
