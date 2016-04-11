package homework160411;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
//		if (args.length > 0) {
//			System.out.println(args[0]);			
//		}
//		if (args.length > 1){
//			System.out.println(args[1]);			
//		}
//		System.out.println(args[2]);
//		System.out.println(args[3]);
//		System.out.println(args[4]);
		
		
		int i = 0;
		while(i < args.length) {
			System.out.println(args[i++]);
//			i++;
		}
		
		for (int n = 0; n < args.length; n++){
			System.out.println(args[n]);
		}
		
		for (String parametr : args) {
			System.out.println(parametr);
		}
		
		for(int k = 0; k < args.length; k++){
			String parametr = args[k];
			System.out.println(parametr);
		}
	}

}
