package maps;
import java.util.*;
public class DisplayDetails {
	public void display() {
		System.out.println(Details.records.toString());
		int length = Details.records.toArray().length;
		if(length != 0) {
			for(int i=0;i<length;i++) {
				Map<String,String> students = Details.records.get(i); 
				System.out.println("Name of the student is: "+students.get("name")+
						"\nEmailId of the student is: "+students.get("emailId")+
						"\nPhone number of the student is: "+students.get("phone number")+"\n");
			}
		}
		else {
			System.out.println("Enter details first.");
		}
		
	}
}
