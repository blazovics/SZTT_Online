
public abstract class Butor {

	protected int szelesseg;
	protected int hosszusag;
	protected int magassag;
	
	protected Anyag anyag;
	
	Butor(int szelesseg, int hosszusag, int magassag, Anyag anyag)
	{
		this.szelesseg = szelesseg;
		this.hosszusag = hosszusag;
		this.magassag = magassag;
		this.anyag = anyag;
	}
	
	protected String tipusNev;
	
	public String getTipusNev() {
		return tipusNev;
	}

	public int getMagassag() {
		return magassag;
	}

	public int getHosszusag() {
		return hosszusag;
	}

	public int getSzelesseg() {
		return szelesseg;
	}
	
}
