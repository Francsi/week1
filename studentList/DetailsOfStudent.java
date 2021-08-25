package studentList;
import java.util.Scanner;
public class DetailsOfStudent {
	Scanner input = new Scanner(System.in);
	
	public int choice() {
		System.out.println("Choose the bellow options \n"
				+ "1. Enter student details \n"
				+ "2. Display student details \n"
				+ "3. Search student details using student name \n"
				+ "4. exit\n");
		return input.nextInt();
	}
	
	public void enterDetails(int noOfStudents, String[] name, String[] emailId, String[] phoneNo) {
		System.out.println("Students you can enter are "+noOfStudents);
		for(int i=0; i<noOfStudents; i++) {
			System.out.println("Enter name of the Student ");
			name[i]=input.nextLine();
			System.out.println("Enter emailId of the Student ");
			emailId[i]=input.nextLine();
			System.out.println("Enter phoneNo of the Student ");
			phoneNo[i]=input.nextLine();
		}
	}
	
	public void displayDetails(int noOfStudents, String[] name, String[] emailId, String[] phoneNo) {
		for(int i=0; i<noOfStudents; i++) {
			System.out.println((i+1)+" Name of the student is "+name[i]+"\n"
					+(i+1)+" EmailId of the student "+name[i]+" is "+emailId[i]+"\n"
					+(i+1)+" Phone number of the student "+name[i]+" is "+phoneNo[i]);
		}
	}
	
	public void searchStudent(int noOfStudents, String searchName, String[] name, String[] emailId, String[] phoneNo) {
		boolean flag = true;
		for(int i=0; i<noOfStudents; i++) {
			if(searchName.equals(name[i])) {
				System.out.println("Name of the student is "+name[i]+"\n"
						+"EmailId of the student is "+emailId[i]+"\n"
						+"Phone number of the student is "+phoneNo[i]+"\n");
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("There is no student regarding "+searchName+"\n");
		}
	}
}
