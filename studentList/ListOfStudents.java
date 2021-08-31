package studentList;
import java.util.Scanner;

public class ListOfStudents {
	public static void main(String args[]) {
		Scanner name = new Scanner(System.in);
		System.out.println("Enter no. of students");
		int noOfStudents = name.nextInt();
		name.nextLine();
		String[] studentList = new String[noOfStudents];
		for(int i=0;i<noOfStudents;i++) {
			System.out.println("Enter student name "+(i+1)+" ");
			studentList[i] = name.nextLine();
		}
		for(int j=0;j<noOfStudents;j++) {
			System.out.println((j+1)+" Name of the student "+studentList[j]);
		}
		name.close();
	}
}
