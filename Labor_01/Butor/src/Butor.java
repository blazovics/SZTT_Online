import java.time.LocalDateTime;

public abstract class Butor {

	protected KozosTulajdonsagok kozosTulajdonsagok;
	
	private int id;
	private static int sequence = 0;
	
	Butor(KozosTulajdonsagok params)
	{
		this.kozosTulajdonsagok = params;
		
		this.id = ++sequence;
	}
	
	protected String tipusNev;
	
	public String getTipusNev() {
		return tipusNev;
	}

	public int getMagassag() {
		return kozosTulajdonsagok.magassag;
	}

	public int getHosszusag() {
		return kozosTulajdonsagok.hosszusag;
	}

	public int getSzelesseg() {
		return kozosTulajdonsagok.szelesseg;
	}
	
	public GyartasiHely getGyartasiHely() {
		return kozosTulajdonsagok.gyartasiHely;
	}
	
	public LocalDateTime getGyartasiIdo() {
		return kozosTulajdonsagok.gyartasiIdo;
	}

	public int getId() {
		return id;
	}
	
}
