import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		boolean b = true;
		int c = 0, num = 0, copy = 0;
		
		while(b) {		
			
			System.out.print("Enter a digit: ");
			Scanner input = new Scanner(System.in);
			num = input.nextInt();
			copy = num;
			
			while(true) {
				// copy = 4786
				int last = copy % 10;	//last = 6
				int zeroOrOne = last % 2;	//if 0 then even
				copy = copy / 10;
				
				switch(zeroOrOne) {

				case 0:
					System.out.println(last + " is even.");
					break;
					
				case 1:
					System.out.println(last + " is odd.");
					break;
				}
				
				if(copy == 0)
					break;
			}
		}
	}
}
