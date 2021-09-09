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
			for(Map detail : Details.records) {
				if(searchName.equals(detail.get("name"))) {
					System.out.println("Name of the Student is:"+detail.get("name")
										+"EmailId of the Student is:"+detail.get("emailId")
										+"Phone number of the Student is:"+detail.get("phone number"));
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
