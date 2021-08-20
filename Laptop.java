package polymorphism;

public class Laptop {
	String typeOfScreen;
	boolean touchScreen;
	int chargePower;
	String typeOfProcessor;
	Laptop(String typeScreen,boolean touchScren,int batteryPower,String typeProcessor){
		typeOfScreen=typeScreen;
		touchScreen = touchScren;
		chargePower = batteryPower;
		typeOfProcessor=typeProcessor;
	}
	Laptop(String typeScreen,int batteryPower,String typeProcessor){
		typeOfScreen=typeScreen;
		touchScreen = false;
		chargePower = batteryPower;
		typeOfProcessor=typeProcessor;
	}
}
