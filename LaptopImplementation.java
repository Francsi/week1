package polymorphism;

public class LaptopImplementation {
	public static void main(String args[]) {
		Laptop laptop1 = new Laptop("LCD",3000,"i3");
		System.out.println(laptop1.typeOfScreen);
		System.out.println(laptop1.touchScreen);
		System.out.println(laptop1.chargePower);
		System.out.println(laptop1.typeOfProcessor);

		Laptop laptop2 = new Laptop("LCD",true,3000,"i3");
		System.out.println(laptop2.typeOfScreen);
		System.out.println(laptop2.touchScreen);
		System.out.println(laptop2.chargePower);
		System.out.println(laptop2.typeOfProcessor);
	}
}
