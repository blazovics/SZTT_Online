import java.util.ArrayList;

public class Car implements IVehicle {
	private ArrayList<Part> parts = new ArrayList<Part>();
	@Override
	public float calculateSpeed() {
		return 130;
	}
}
