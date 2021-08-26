package studentList;
import java.util.Scanner;
public class EnterDisplaySearch {
	public static void main(String arg[]) {
		DetailsOfStudent dos = new DetailsOfStudent();
		Scanner input = new Scanner(System.in);
		boolean flag = false;
		while(true) {
			int choiseOfUser = dos.choice();
			switch(choiseOfUser) {
				case 1:
					dos.enterDetails();
					break;
				case 2:
					dos.displayDetails();
					break;
				case 3:
					System.out.println("Enter the name of the student to be searched ");
					String searchName = input.nextLine();
					dos.searchStudent(searchName);
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
