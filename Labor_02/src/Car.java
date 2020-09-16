import java.util.ArrayList;

public class Car implements IVehicle {
	private ArrayList<Part> parts = new ArrayList<Part>();
	public float calculateSpeed() {
		return 130;
	}
}
