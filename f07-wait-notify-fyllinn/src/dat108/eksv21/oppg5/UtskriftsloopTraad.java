package dat108.eksv21.oppg5;

public class UtskriftsloopTraad extends Thread{	
	
	private boolean verdi = true;
	
	@Override
	public void run() {
		while(verdi) {
			System.out.println("Tråd 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	}
	public void stopp() {		
		verdi = false;
	}
}
