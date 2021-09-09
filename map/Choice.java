package maps;
import java.util.Scanner;

public class Choice {
	public int choice() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the choice\n"
				+ "1. Enter the details.\n"
				+ "2.Display the details.\n"
				+ "3.Exit\n");
		int val = input.nextInt();
		return val;
	}
}
