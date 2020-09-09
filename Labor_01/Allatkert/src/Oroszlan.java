
public class Oroszlan {
	String name;
	private int suly;
	
	public static String fajnev = "Oroszlán";
	
	Oroszlan(String name){
		this.name = name;
	}
	
	int megetet(int mennyiseg) {
		if(mennyiseg < 0) {
			return 0;
		}
		
		suly += mennyiseg;
		this.goToSleep();
		
		return mennyiseg;
	}
	
	private void goToSleep() {
		System.out.println("Zzzz..");
	}
}
