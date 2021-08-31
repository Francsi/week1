package strings;
import java.util.*;
public class EnterDisplay {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		EnterDetails ed = new EnterDetails();
		DisplayDetails dd = new DisplayDetails();
		while(true) {
			System.out.println("Choose the bellow options \n"
					+ "1. Enter student details \n"
					+ "2. Display student details \n"
					+ "3. exit\n");
			int choiseOfUser = input.nextInt();
			System.out.println("Choise entered is "+choiseOfUser);
			switch(choiseOfUser) {
				case 1:
					ed.enter();
					break;
				case 2:
					dd.display();
					break;
				default:
					flag=true;
					break;
			}
			if(flag) {
				break;
			}
		}
		System.out.println("End of code");
		input.close();
	}
}
