package lesson160331;

public class Task01 {
	
	public static void main(String[] args) {
		
//������ 1 ������� 1		
		double x = 28E3;
		System.out.println("����� �� �����: " + x + "�");

		double y = 1E3;
		System.out.println("������� �� �������: " + y + "�");

		double c = 1145.22;
		System.out.println("������� �� ������ ����: " + c + "�");

		double l = x + y + c;
		System.out.println("����� ���������� �����: " + l + "�");
		
		double p = (l * 13 / 100);
		System.out.println("����� ��������: " + p + "�");
		
		double z = l - p;
		System.out.println("� �������: " + z + "�");
		
		System.out.println();
//������ 1 ������� 2
		double z1 = l - ((x + y + c) * 0.13);
		System.out.println("� �������: " + z1 + "�"); 
		
		System.out.println();
//������ 2 ������� 1		
		int ozp = 30_000;
		int nalog = (ozp * 13 / 100);
		int zp = ozp - nalog;
		System.out.println("����� ���������� ����� - " + ozp);
		System.out.println("���������� ����� - " + nalog);
		System.out.println("���������� ����� � ������� - " + zp);
		
		System.out.println();
//������ 2 ������� 2
		int zp1 = ozp - (ozp * 13 / 100);
		System.out.println("���������� ����� � ������� - " + zp1);
	}

}
