package strings;
import java.util.Scanner;

public class PrintName {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name ");
		String name = input.nextLine();
		String[] name1 = name.split(" ");
		int length = name1.length;
		if(length > 2) {
			System.out.println("First name: "+name1[0]);
			System.out.println("Middle name: "+name1[1]);
			System.out.print("Last name: ");
			for(int i=2;i<length ;i++) {
				System.out.print(name1[i]+" ");
			}
		}
		if(length == 2) {
			System.out.println("First name: "+name1[0]);
			System.out.println("Last name: "+name1[1]);
		}
		if(length == 1) {
			System.out.println("First name: "+name1[0]);
		}
		input.close();
	}
}
