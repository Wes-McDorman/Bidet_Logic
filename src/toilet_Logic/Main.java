package toilet_Logic;

public class Main {
	public static void main(String[] args) {
		
		//TODO sensor for the toilet seat to determine if it is up or down
		
		
		WaterSquirt bidet = new WaterSquirt(); //instantiate WaterSquirt class
		System.out.println("Bidet Armed");
		bidet.isSquirting(); //Say if the water jet is off
		Voice voice = new Voice();
		System.out.println("Voice Armed");
		voice.getAngry();
		voice.ending();
		
		
		
		
	}

}
