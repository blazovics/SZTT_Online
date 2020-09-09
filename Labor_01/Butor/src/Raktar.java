import java.util.ArrayList;
import java.util.List;

public class Raktar {

	private List<Butor> butorLista = new ArrayList<>();
	
	public void addButor(Butor b) {
		butorLista.add(b);
	}
	
	public void remButor(Butor b) {
		butorLista.remove(b);
	}
	
	public int keresTipusSzerint(String tipus)
	{
		int darab = 0;
		for(Butor b: butorLista)
		{
			if(b.tipusNev.equals(tipus))
			{
				darab++;
			}
		}
		return darab;
	}
}
