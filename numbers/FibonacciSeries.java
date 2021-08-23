package numbers;
import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int numberOfElements = input.nextInt(), num1 = 1, num2 = 1, num3, i;
		System.out.println(num1+"\n"+num2);
		for(i=2;i<numberOfElements;i++) {
			num3 = num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
		input.close();
	}
}
