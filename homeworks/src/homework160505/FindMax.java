package homework160505;

public class FindMax {
	
	public static void main(String[] args) {
		
		int[] a = {10, 30, -20, 90, 40, 2};
		
		int m = findMaxElementIndex(a);
		
		System.out.println(m);
		System.out.println(a[m]);
	}

	private static int findMaxElementIndex(int[] a) {
		if(a == null) {
			return -1;
		}
		if(a.length == 0) {
			return -1;
		}
		int indexofElementWithMaxValue = 0;
		for (int i = 1; i < a.length; i++) {
			if(a[i] > a[indexofElementWithMaxValue]){//сравниваем i-й элемент с элементами нашей переменной
				indexofElementWithMaxValue = i;
			}
		}
		return indexofElementWithMaxValue;
	}
}
