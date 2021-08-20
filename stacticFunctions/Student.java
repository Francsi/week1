package staticFunction;

public class Student {
	static String companyName = "Lendi Institute";
	int idNumber = 17402;
	String mailId="shourifrancis@gmail.com";
	static {
		companyName = "Full Creative";
		System.out.println("This block is first Invoked before the main functional block");
	}
	Student() {
		System.out.println("This block is contructor block which invoked next to static block");
		mailId = "yez@ienal.com";
		idNumber = 123234;
	}
	public static void main(String args[]) {
		Student student = new Student();
		System.out.println(companyName);
		System.out.println(student.idNumber);
		System.out.println(student.mailId);
	}
}
