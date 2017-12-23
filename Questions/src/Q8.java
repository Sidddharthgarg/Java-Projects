import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		boolean b = true;
		int choice = 0;
		int n;
		Scanner input = new Scanner(System.in);
		
		while (b) {		
			
			System.out.println("Enter your choice:\n1: Begin calculation.\n2: Terminate program. ");
			choice = input.nextInt();
			
			switch (choice) {

				case 1:
					double s = 0;
					System.out.print("Enter the value of n: ");
					n = input.nextInt();
					for (float i = 0; i < n; i++) {
												
						s += (i % 2 == 0 ? 1 : -1) * ((i + 1) / (i + 2));
					
					}
					
					System.out.println("s = " + s);
					break;	
					
				case 2:
					System.out.println("Program Terminated.");
					System.exit(0);
					
				default:
					System.out.println("Please enter a valid choice.");
			}
			
		}
		input.close();
	}
}