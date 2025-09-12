package no.hvl.dat108.utplukk;

import java.util.ArrayList;
import java.util.List;

interface Betingelse {
	boolean erOppfylt(int tall);
}

public class Tallplukker {

	public static List<Integer> plukkUt(List<Integer> liste, Betingelse b) {
		
		List<Integer> svar = new ArrayList<>();
		for(int tall : liste) {
			if(b.erOppfylt(tall)) { //Denne linjen
				svar.add(tall);
			}
		}
		return svar;
	}
}
