import java.util.ArrayList;

import java.util.List;

public abstract class PublicTransport implements IVehicle {
	ArrayList<Station> stations = new ArrayList<Station>();
	
	public List<Station> getStations(){
		return new ArrayList<Station>(stations);
	}
}
