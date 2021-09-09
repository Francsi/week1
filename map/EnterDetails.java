package maps;
import java.util.*;

public class EnterDetails {
	public void enterDetails() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter details of the students");
		int num=0;
		while(true) {
			Map<String,String> studentDetails = new HashMap<String,String>();
			System.out.println("Enter name of the student");
			studentDetails.put("name",input.nextLine());
			System.out.println("Enter emailId of the student");
			studentDetails.put("emailId",input.nextLine());
			System.out.println("Enter phone number of the student");
			studentDetails.put("phone number",input.nextLine());
			Details.records.add(studentDetails);
			System.out.println("Enter 1 to exit or else 0 to continue.");
			num = input.nextInt();
			input.nextLine();
			if(num==1) {
				break;
			}
		}
	}
}
