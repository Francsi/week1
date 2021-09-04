package maps;
import java.util.*;

public class EnterDetails extends Details {
	public void enterDetails() {
		Scanner input = new Scanner(System.in);
		Map<String,String> studentDetails = new HashMap<String,String>();
		System.out.println("Enter details of the students");
		while(input.hasNext()) {
			System.out.println("Enter name of the student");
			String name = input.nextLine();
			studentDetails.put("Name",name);
			System.out.println("Enter emailId of the student");
			studentDetails.put("EmailId",input.nextLine());
			System.out.println("Enter phone number of the student");
			studentDetails.put("phone number",input.nextLine());
			records.add(studentDetails);
		}
		input.close();
	}
}
