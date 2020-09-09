import java.time.LocalDateTime;

public class KinyithatoAsztal extends Asztal {

	private boolean kinyitva = false;
	private int teljesHossz;
	
	KinyithatoAsztal(int teljesHossz) {
		this(new KozosTulajdonsagok(90,75,200,Anyag.BUKK,GyartasiHely.GYOR,LocalDateTime.now()),teljesHossz);
	}
	
	KinyithatoAsztal(GyartasiHely gyartasiHely, LocalDateTime gyartasiIdo, int teljesHossz) {
		this(new KozosTulajdonsagok(90,200,75,Anyag.BUKK,gyartasiHely,gyartasiIdo),teljesHossz);

	}
	
	KinyithatoAsztal(KozosTulajdonsagok params, int teljesHossz) {
		super(params);
		this.teljesHossz = teljesHossz;
		tipusNev = "Hunor";
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
			return getHosszusag();
		}
	}
	
}
