package strings;
import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String checkString = input.nextLine();
		char[] string = checkString.toCharArray();
		int length = checkString.length();
		boolean flag = true;
		for(int i=0; i<(length/2);i++) {
			if(string[i]!=string[length-i-1]) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("the string "+checkString+" is palindrome");
		}
		else {
			System.out.println("the string "+checkString+" is not a palindrome");
		}
		input.close(); 
	}
}
