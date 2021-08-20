package encapsulation;

public class Detatils {
	public static void main(String args[]) {
		PersonDetails details = new PersonDetails();
		details.setName("Francis Avinash");
		details.setPhoneNumber(630209636);
		details.setMailId("francis.shouri@anywhere.co");
		details.setSalary(25000);
		String name = details.getName();
		int phoneNumber = details.getNumber();
		String mailId = details.getMailId();
		float salary = details.getSalary();
		System.out.println("Name of the person is "+name);
		System.out.println("Number of the "+name+" is "+phoneNumber);
		System.out.println("MailId of the "+name+" is "+mailId);
		System.out.println("Salary of the "+name+" is "+salary);
	}
}
