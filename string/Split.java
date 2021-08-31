package strings;
import java.util.Scanner;
public class Split {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		int length = s1.length();
		if(length%2==0) {
			for(int i=0; i<length; i+=2) {
				System.out.println(s1.substring(i, i+2));
			}
		}
		else {
			for(int i=0; i<length; i+=2) {
				if(i!=length-1) {
					System.out.println(s1.substring(i, i+2));
				}
				else {
					System.out.println(s1.substring(i)+"_");
				}
			}
		}
		input.close();
	}
}
