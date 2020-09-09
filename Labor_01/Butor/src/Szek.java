import java.time.LocalDateTime;

public class Szek extends Butor {

	Szek() {
		this(new KozosTulajdonsagok(45,45,80,Anyag.TOLGY,GyartasiHely.GYOR,LocalDateTime.now()));	
	}
	
	Szek(GyartasiHely gyartasiHely, LocalDateTime gyartasiIdo) {
		this(new KozosTulajdonsagok(45,45,80,Anyag.TOLGY,gyartasiHely,gyartasiIdo));	
	}
	
	Szek(KozosTulajdonsagok params) {
		super(params);
		
		tipusNev = "Luca";
	}

}
