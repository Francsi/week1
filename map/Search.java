package maps;
import java.util.*;

public class Search {
	public void search() {
		Scanner input = new Scanner(System.in);
		int length = Details.records.toArray().length;
		if(length != 0) {
			System.out.print("Enter name to searched:");
			String searchName = input.nextLine();
			boolean flag = true;
			for(int i=0; i<length; i++) {
				if(searchName.equals(Details.records.get(i).get("name"))) {
					System.out.println("Name of the Student is:"+Details.records.get(i).get("name"));
					System.out.println("EmailId of the Student is:"+Details.records.get(i).get("emailId"));
					System.out.println("Phone number of the Student is:"+Details.records.get(i).get("phone number"));
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("There is no such name present.");
			}
		}
		else {
			System.out.println("Enter the student list.");
		}
	}
}
