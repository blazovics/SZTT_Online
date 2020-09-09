
public class KinyithatoAsztal extends Asztal {

	private boolean kinyitva = false;
	private int teljesHossz;
	


	
	KinyithatoAsztal(int szelesseg, int hosszusag, int magassag, Anyag anyag, int teljesHossz) {
		super(szelesseg, hosszusag, magassag, anyag);
		this.teljesHossz = teljesHossz;
	}


	public int getTeljesHossz() {
		return teljesHossz;
	}
	
	@Override
	public int getHosszusag()
	{
		if(kinyitva) {
			return teljesHossz;
		}
		else {
			return hosszusag;
		}
	}
	
}
