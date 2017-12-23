import java.util.Scanner;

public class Lesson4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		char check = 'y';
		int num = 1;
		
		while(check == 'y' || check == 'Y') {
			
			System.out.println(num);
			System.out.print("Continue y or n? ");
			
			check = input.next().trim().charAt(0);
			num++;
		}
		
		input.close();
		System.out.print("You stopped the application.");
		
	}
}