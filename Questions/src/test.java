import java.util.Scanner;

public class test {
	
	public static void main(String[]args) {
		
		Scanner read = new Scanner(System.in);
		
		double s = 0;
		System.out.print("Enter the value of n: ");
		float n = read.nextFloat();
		for (float i = 0; i < n; i++) {
									
			s += (i % 2 == 0 ? 1 : -1) * ((i + 1) / (i + 2));
		}
		System.out.println(s);
		read.close();
	}
}