package maps;
import java.util.*;

public class SearchMod {
	public void search() {
		Scanner input = new Scanner(System.in);
		int length = Details.records.toArray().length;
		if(length != 0) {
			System.out.print("Enter name to searched:");
			String searchName = input.nextLine();
			boolean flag = true;
			int SearchLength = searchName.length();
			for(Map detail : Details.records) {
				for(int i=0;i<detail.get("name").toString().length()-SearchLength+1;i++) {
					String name = detail.get("name").toString();
					System.out.println(name.subSequence(i, i+SearchLength));
					if(searchName.equals(name.subSequence(i, i+SearchLength))) {
						System.out.println("Name of the Student is:"+detail.get("name")
											+"\nEmailId of the Student is:"+detail.get("emailId")
											+"\nPhone number of the Student is:"+detail.get("phone number"));
						flag = false;
						break;
					}
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
