package strings;
import java.util.*;
public class EnterDetails extends Details{
	public void enter() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of Students:");
		int noOfStudents = input.nextInt();
		input.nextLine();
		for(int i=0; i<noOfStudents;i++) {
			System.out.println("Enter name of the Students");
			super.name.add(input.nextLine());
			System.out.println("Enter emailId of the Students");
			super.emailId.add(input.nextLine());
			System.out.println("Enter phone number of the Students");
			super.phoneNo.add(input.nextLine());
		}
		input.close();
	}
}
