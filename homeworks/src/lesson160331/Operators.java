package lesson160331;

public class Operators {
	
	public static void main(String[] args) {
		int y = 4; //������ ������� ����� � ������ ����������, �������� ��� ����� �����.(32����)
		double x = 3 + 2 * y; //������������ ����� ������� ��������
		
		System.out.println(x);
		
		int a = 125;
		System.out.println(Integer.toBinaryString(a));

		int b = 315;
		System.out.println(Integer.toBinaryString(b));
		
		double z = 10E2;
		System.out.println(z);
		
		System.out.println(10/3);
		
		double d = 10.0 / 3;
		System.out.println(d); // ���������� ������������ �����, �� ��� ������, �� 10 � 3 ����� �����, ������� �� 10 � 10.0
		
		float f = 10 / 3f;
		System.out.println(f); //��� ������ ���� �� ����� ������� ������������(3f), ����� �������� ������������ ����� � �������
		
		int xx = 1;
		long yy = 33;
		float ff = 1f;
		System.out.println(xx * yy * ff);
		
		int x1 = 100_000;
		int y1 = 100_000;
		
		System.out.println(x1 * y1); //�� ���������� � ����� �����, �� ����� ������� ������� � ����� ���������� ��������
		
		long l1 = x1 * y1;
		System.out.println(l1); // �������� �� ����� �����, ������� � ������ ���� ��� ����� � ����������� � 32 ����
		
		long x2 = 100_000;
		long y2 = 100_000;
		
		long l2 = x2 * y2;
		System.out.println(l2);
	}

}
