
public class BarSzek extends Szek {

	private boolean haromlabu;
	
	BarSzek(int szelesseg, int hosszusag, int magassag, Anyag anyag, boolean haromlabu) {
		super(szelesseg, hosszusag, magassag, anyag);
		this.haromlabu = haromlabu;

		tipusNev = "Ivo";
	}
	
	public int getLabszam() {
		if(haromlabu) {
			return 3;
		}
		else {
			return 4;
		}
	}

}
