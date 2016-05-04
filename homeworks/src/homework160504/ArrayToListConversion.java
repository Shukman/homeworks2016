package homework160504;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToListConversion {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); // <> diamond operator
		list.add(10);
		list.add(20);
		list.add(30);
		
		Integer[] a = new Integer[0];
		
		a = list.toArray(a); //нужно где то сохранить и сохраняем в а; перегоняем динамический массив в обычный массив
		
		System.out.println(Arrays.toString(a));
		
		int[] x = {10, 20, 30, 40, 50};
		System.out.println(x.length); //length - для обычного массива, для динамического массива size
		
		//есть некий лист, перебирать с помощью цикла и добавлять поэлементно
		ArrayList<Integer> list2 = new ArrayList<>();
		for (int i = 0; i < x.length; i++) {
			list2.add(x[i]);
		}
		System.out.println(list2);
		
	}

}
