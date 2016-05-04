package homework160504;

import java.util.ArrayList;

public class ArrayListExamples {
	
	public static void main(String[] args) {
		
		int[] a; //переменная а в которой может храниться ссылка на массив целых чисел
		
		a = new int[10]; // создаем массив из 10 целых чисел и ссылка присваивается переменной а
		
		// если массив из 10 элементов, он всегда будет под десять целый чисел, не 11 и не 9, а только 10
		// массивы в джаве статичны
		//указания в скобках означает, что в нем будут хранится целые числа
		ArrayList<Integer> intArray1 = new ArrayList<Integer>();
		ArrayList<Integer> intArray2 = new ArrayList<>(); //динамический массив - arraylist , можно добавлять и удалять элементы сколько захотим
		
		intArray1.add(10); //add // intArray1.add(new Integer(10));
		intArray1.add(20);
		intArray1.add(30);
		intArray1.add(40);
		
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size()); //какой размер у динамического массива
		//можем создать динамический массив и посмотреть что там и какой размер
		
		intArray1.add(50); //append
		
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size());
		
		intArray1.add(0, 0);//первое число куда, второй число это что insert into the beginning
		
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size());
		
		intArray1.add(4, 35); // insert into the middle
		
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size());
		
		//можно удалить элемент из массива
		
		intArray1.remove(5); //delete
		
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size());
		
		int indexOf30 = intArray1.indexOf(30); // найти номер элемента в массиве search
		System.out.println(indexOf30); 
		intArray1.remove(indexOf30);//delete
		
		intArray1.remove((Integer)20); // элемент со значением двадцать хотим удалить search and delete
//		intArray1.remove(new Integer(20)); // элемент со значением двадцать хотим удалить search and delete
		
		for (Integer integer : intArray1) {
			System.out.println(integer);
		}
		
		System.out.println(intArray1.size());
		
		for (int i = 0; i < intArray1.size(); i++) {
			System.out.println(intArray1.get(i)); //получить элементы массива перед этим прошлись по ним
			intArray1.set(i, i * 100); // a[i] = i * 100;
			System.out.println(intArray1.get(i)); // println(a[i]) // распаковывается объект и печатается
		}
		System.out.println(intArray1.isEmpty());//проверяет пустой ли он
		System.out.println(intArray2.isEmpty());
		
		intArray1.clear(); //очистить массив
		
		System.out.println(intArray1.isEmpty());
		System.out.println(intArray1.size());
	}
}
