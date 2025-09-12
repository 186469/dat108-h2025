package busywait;

public class Main {
	
	public static String melding;
	
	public static void main(String[] args) {
		
		//En tråd som skriver ut melding på skjermen
		//En tråd som gir melding en verdi
		boolean verdi = true;
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				while(melding != null) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(melding);

					}
				}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				melding = "Hallo";
				}
			
		});
		t1.start();
		t2.start();
		
	}
}
