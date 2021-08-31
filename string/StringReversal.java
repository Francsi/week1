package strings;
import java.util.Scanner;

public class StringReversal {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = input.nextLine();
		char[] str1 = str.toCharArray();
		String result="";
		for(int i=str1.length-1;i>-1;i--) {
			result+=str1[i];
		}
		System.out.println(result);
		input.close();
	}
}
