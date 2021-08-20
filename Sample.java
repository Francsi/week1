package introduction;

public class Sample {
	public String name = "Francis Avinash";
	public String companyName = "Full Creative";
	final int IDNUMBER = 630209636;
	protected String mailId = "francis.shouri@anywhere.co";
	String gender = "Male";
	private int age = 21;
	
	public static void main(String args[]) {
		Sample obj = new Sample();
		System.out.println("Name of the employee "+ obj.name);
		System.out.println("Company Name of the employee "+ obj.companyName);
		System.out.println("idNumber of the employee "+obj.IDNUMBER);
		System.out.println("Gender of the employee "+obj.gender);
		System.out.println("Age of the employee "+obj.age);
	}
}
