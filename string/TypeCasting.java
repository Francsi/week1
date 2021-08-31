package strings;
import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String[] list = s1.split(" ");
		int maxValues=0,minValues=Integer.parseInt(list[0]);
		String result;
		for(int i=0; i<list.length; i++) {
			int val = Integer.parseInt(list[i]);
			if(maxValues<val) {
				maxValues = val;
			}
			if(minValues>val) {
				minValues = val;
			}
		}
		result ="max Value "+ maxValues + " \nmin value: "+ minValues;
		input.close();
		System.out.println(result);
	}
}
