package encapsulation;

public class PersonDetails {
	private String name;
	private int phoneNumber;
	private String mailId;
	private float salary;
	
	public String getName() {
		return name;
	}
	public int getNumber() {
		return phoneNumber;
	}
	public String getMailId() {
		return mailId;
	}
	public float getSalary() {
		return salary;
	}
	public void setName(String personName) {
		name = personName;
	}
	public void setPhoneNumber(int personNumber) {
		phoneNumber = personNumber;
	}
	public void setMailId(String mailID) {
		mailId = mailID;
	}
	public void setSalary(float personSalary) {
		salary = personSalary;
	}
}
