import java.time.LocalDateTime;

public class BarSzek extends Szek {

	private boolean haromlabu;
	
	
	BarSzek() {
		this(new KozosTulajdonsagok(25,35,120,Anyag.TOLGY,GyartasiHely.GYOR,LocalDateTime.now()));	
	}
	
	BarSzek(GyartasiHely gyartasiHely, LocalDateTime gyartasiIdo) {
		this(new KozosTulajdonsagok(35,35,120,Anyag.TOLGY,gyartasiHely,gyartasiIdo));	
	}
	
	BarSzek(KozosTulajdonsagok params) {
		super(params);
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
