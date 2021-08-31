package strings;

public class DisplayDetails extends Details{
	public void display() {
		int length = super.name.size();
		for(int i=0;i<length;i++) {
			System.out.print((i+1)+" The name of the student is: "+super.name.toArray()[i]);
			System.out.print((i+1)+" The name of the student is: "+super.emailId.toArray()[i]);
			System.out.print((i+1)+" The name of the student is: "+super.phoneNo.toArray()[i]);
		}
	}
}
