package no.hvl.dat108.f02tallplukker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Tallplukker {

	public static List<Integer> plukkUt(List<Integer> liste, Predicate<Integer> b) {
		
		List<Integer> svar = new ArrayList<>();
		for(int tall : liste) {
			if(b.test(tall)) { //Denne linjen
				svar.add(tall);
			}
		}
		return svar;
	}
}
