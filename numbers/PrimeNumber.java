package numbers;
import java.util.Scanner;
import java.lang.Math;
public class PrimeNumber {
	public static void main(String args[]) {
		Integer num;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		boolean flag = true;
		for(int i=2; i < Math.sqrt(num)+1; i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("The given number "+num+" is prime");
		}
		else {
			System.out.println("The given number "+num+" is not prime");
		}
		input.close();
	}
}
