package maps;


public class EnterDisplaySearch {
	public static void main(String args[]) {
		Choice ch = new Choice();
		EnterDetails ed = new EnterDetails();
		DisplayDetails dd = new DisplayDetails();
		boolean flag = false;
		
		while(true) {
			int choiceOfStudent = ch.choice();
			switch(choiceOfStudent) {
				case 1:
					ed.enterDetails();
					break;
				case 2:
					dd.display();
					break;
				case 3:
					flag =true;
					break;
			}
			if(flag) {
				break;
			}
		}
		System.out.println("end of code");
	}
}
