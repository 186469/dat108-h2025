package waitnotifymelding;

public class Main {
	
	public static Melding melding = new Melding()
			;
	
	public static void main(String[] args) {
		
		//En tråd som skriver ut melding på skjermen
		//En tråd som gir melding en verdi
		Object lock = new Object();
		
		// En tråd som skriver en melding på skjermen
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println(melding.getTekst());
			}
		});
		
		// En tråd som gir melding en verdi
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				melding.setTekst("Hallo");
				}
		});
		t1.start();
		t2.start();
		
		
		// En tråd som skriver en melding på skjermen
		Thread t1Lambda = new Thread(() -> System.out.println(melding.getTekst()));
				
		// En tråd som gir melding en verdi
		Thread t2Lambda = new Thread(() -> System.out.println("hallo"));
	}
}
