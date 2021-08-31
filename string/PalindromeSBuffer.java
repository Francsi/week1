package strings;
import java.util.*;

public class PalindromeSBuffer {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String checkString = input.nextLine();
		StringBuffer string = new StringBuffer(checkString);
		if(checkString.equals(string.reverse().toString())) {
			System.out.println("the string "+checkString+" is palindrome");
		}
		else {
			System.out.println("the string "+checkString+" is not a palindrome");
		}
		input.close();
	}
}
