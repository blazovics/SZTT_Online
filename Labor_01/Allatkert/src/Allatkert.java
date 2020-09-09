import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Allatkert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oroszlan leo = new Oroszlan("Leo");
		OroszlanKolyok simba = new OroszlanKolyok("Simba");
		Hiuz samu = new Hiuz("Samu");
		
		leo.name = "Szimba";
		//leo.suly = 200;
		
		leo.megetet(2);
		//leo.goToSleep();
		
		List<Nagymacska> nagymacskak = new ArrayList<Nagymacska>();
		nagymacskak.add(leo);
		nagymacskak.add(simba);
		nagymacskak.add(samu);
		
		Map<String, Nagymacska> leltar = new HashMap<>();
		
		leltar.put(leo.name,leo);
		leltar.put(simba.name,simba);
		leltar.put(samu.name,samu);
		
		System.out.println(leltar.get("Samu").karmokKint);
		
		String nev = Oroszlan.fajnev;
	}

}
