package collectionsPack;
import java.util.*;

public class StudentList {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> studentName = new ArrayList<String>();
		System.out.print("Enter number of students: ");
		int noOfStudents; 
		noOfStudents = input.nextInt();
		for(int i=0; i<noOfStudents; i++) {
			System.out.print((i+1)+" Enter names of student:");
			studentName.add(input.nextLine());
		}
		System.out.println(studentName.toString());
		input.close();
	}
}
