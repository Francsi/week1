package maps;
import java.util.*;
public class DisplayDetails extends Details{
	public void display() {
		int length = records.toArray().length;
		if(length != 0) {
			for(int i=0;i<length;i++) {
				Map<String,String> students = records.get(i); 
				System.out.println("Name of the student is: "+students.get("name"));
				System.out.println("EmailId of the student is: "+students.get("EmailId"));
				System.out.println("Phone number of the student is: "+students.get("phone number")+"\n");
			}
		}
		else {
			System.out.println("Enter details first.");
		}
		
	}
}
