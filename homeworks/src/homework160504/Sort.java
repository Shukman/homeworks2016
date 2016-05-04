package homework160504;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("One");	// 1
		list.add("Two");	// 2
		list.add("Three");	// 3
		list.add("Four");	// 4
		list.add("Five");	// 5
		
		Collections.sort(list);
		
		System.out.println(list); // 5, 4, 1, 3, 2 по алфавиту!
		
	}

}
