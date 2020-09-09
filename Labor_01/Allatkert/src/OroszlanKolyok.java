
public class OroszlanKolyok extends Oroszlan{

	OroszlanKolyok(String nev){
		super(nev);
	}
	
	void run() {
		//suly -= 1;
	}
	
	@Override
	public int megetet(int mennyiseg) {
		
		if(mennyiseg > 10)
			return 0;
		
		return super.megetet(mennyiseg);
	}
	
	public void simogat() {
		elegedett++;
	}
}
