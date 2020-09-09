
public class Oroszlan extends Nagymacska implements IHangotAd {
	//String name;
	private int suly;
	
	protected int elegedett;
	
	public static String fajnev = "Oroszlán";
	
	Oroszlan(String name){
		this.name = name;
	}
	
	int megetet(int mennyiseg) {
		if(mennyiseg < 0) {
			return 0;
		}
		
		suly += mennyiseg;
		elegedett++;
		this.goToSleep();
		
		return mennyiseg;
	}
	
	private void goToSleep() {
		System.out.println("Zzzz..");
	}

	@Override
	public void AddjHangot() {
		System.out.println("Roar");
		
	}
}
