public class Sum {
	
	public static void main(String[] args) {
		
		int i, j;
		int P[] = {56, 78, 91, 70, 59, 93, 67, 83, 72, 91};
		int Q[] = {96, 88, 83, 78, 99};
		int R[] = new int[5];
		
		for (i = 0, j = 1; i < 5; i++, j += 2) {
			
			R[i] = P[j] + Q[i];
			
		}
		
		System.out.println("Resultant array: ");
		
		for (i = 0; i < 5; i++) {
			System.out.print(R[i] + "\t");
		}
		System.out.println("\n" + 2 % 2);
	}
}
