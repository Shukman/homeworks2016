package homework160426;

public class Last2 {
	
	public static void main(String[] args) {
		
		System.out.println(last2(null));
		
	}
	
	static public int last2(String str) {
		
		if (str == null) {
			return 0;
		}
		
		if (str.length() < 3) {
			return 0;
		}
		
		String sub = str.substring(str.length() - 2);
		
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.subSequence(i, i+2).equals(sub)){
				count++;
			}
		}
		return count;
	}

}
