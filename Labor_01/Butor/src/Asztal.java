import java.time.LocalDateTime;

public class Asztal extends Butor {
	
	Asztal(LocalDateTime gyartasiIdo, GyartasiHely gyartasiHely){
		this(new KozosTulajdonsagok(90,200,75,Anyag.FENYO,gyartasiHely,gyartasiIdo));
	}
	
	Asztal()
	{
		this(new KozosTulajdonsagok(90,200,75,Anyag.FENYO,GyartasiHely.GYOR,LocalDateTime.now()));
	}
	
	Asztal(KozosTulajdonsagok params){
		super(params);
		tipusNev = "Magor";
	}
	
	
	

	
}
