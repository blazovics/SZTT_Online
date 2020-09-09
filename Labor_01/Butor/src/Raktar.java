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
	
	public List<Butor> keresTipusSzerint(String tipus)
	{
		List<Butor> butors = new ArrayList<Butor>();
		for(Butor b: butorLista)
		{
			if(b.tipusNev.equals(tipus))
			{
				butors.add(b);
			}
		}
		return butors;
	}
	
	public Butor keresIDSzerint(int id)
	{
		for(Butor b: butorLista)
		{
			if(b.getId() == id)
			{
				return b;
			}
		}
		return null;
	}
}
