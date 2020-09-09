import java.time.LocalDateTime;

public class Gyar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Raktar r = new Raktar();
		
		r.addButor(new Asztal(LocalDateTime.now(),GyartasiHely.GYOR));
	}

}
