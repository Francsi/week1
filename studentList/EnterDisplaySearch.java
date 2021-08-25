package studentList;
import java.util.Scanner;
public class EnterDisplaySearch {
	public static void main(String arg[]) {
		DetailsOfStudent dos = new DetailsOfStudent();
		Scanner input = new Scanner(System.in);
		int noOfStudents;
		System.out.println("Enter number of students");
		noOfStudents = input.nextInt();
		String[] name = new String[noOfStudents];
		String[] emailId = new String[noOfStudents];
		String[] phoneNo = new String[noOfStudents];
		for(int i=0; i<noOfStudents; i++) {
			System.out.println("Enter name of the Student ");
			name[i]=input.nextLine();
			System.out.println("Enter emailId of the Student ");
			emailId[i]=input.nextLine();
			System.out.println("Enter phoneNo of the Student ");
			phoneNo[i]=input.nextLine();
		}
		boolean flag = false;
		while(true) {
			int choiseOfUser = dos.choice();
			switch(choiseOfUser) {
				case 1:
					dos.enterDetails(noOfStudents, name, emailId, phoneNo);
					break;
				case 2:
					dos.displayDetails(noOfStudents, name, emailId, phoneNo);
					break;
				case 3:
					System.out.println("Enter the name of the student to be searched ");
					String searchName = input.nextLine();
					dos.searchStudent(noOfStudents, searchName, name, emailId, phoneNo);
					break;
				default:
					flag = true;
					break;
			}
			if(flag) {
				break;
			}
		}
		input.close();
		System.out.println("End of the code");
	}
}
