package strings;
import java.util.Scanner;

public class ReverseString {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string to be reversed: ");
		String string = input.nextLine();
		StringBuilder sb = new StringBuilder(string);
		sb.reverse();
		System.out.println("Reversed string is "+sb.toString());
		input.close();
	}
	
} 
