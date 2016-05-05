package homework160505;

public class FindMax1 {
	
	public static void main(String[] args) {
		
		int[] a = {10, 120, 2, 90, 400, 10};
		
		int b = indexMax(a);
		
		System.out.println(b);
		System.out.println(a[b]);
	}
	private static int indexMax(int[] a) {
	
		if(a.length == 0) return -1;
		if (a == null) return -1;
		
		int index = 0;
		for (int i = 1; i < a.length; i++) {
			if(a[i] > a[index]){
				index = i;
			}
		}
		return index;
	}
}
