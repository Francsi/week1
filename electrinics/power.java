package electronics;

import java.util.Scanner;

public class Power {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int voltage = input.nextInt();
		int current = input.nextInt();
		float power = (voltage * current);
		System.out.println(power);
		input.close();
	}
}
