package no.hvl.dat108.collsort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		//1. Sortere i "naturlig" rekkefølge i hht. String compareTo. OK
		List<String> listen = Arrays.asList("Hallo", "blabla", "knut", "Per", "ØÆå");
//		Collections.sort(listen, new Comparator<String>() {
//			@Override
//			public int compare(String a, String b) {
//				return a.compareToIgnoreCase(b);		
//			}			
//		});
		System.out.println(listen);
		
		//2. Sortere alfabetisk uavhengig av store og små bokstaver
		//???
		System.out.println(listen);
		
		//3. ..., nå med lambda-uttrykk !!! :)
		//???
		Collections.sort(listen, (a, b) -> a.compareToIgnoreCase(b));		
		System.out.println(listen);
		
		//4. Sortere på lengden på strengene (med lambda-uttrykk)
		//???
		Collections.sort(listen, (a, b) -> a.length() - b.length());
		System.out.println(listen);
		
		//5. Sortere på lengden synkende. Putte lambda-uttrykk inn i variabel.
		//???
		//???
		Comparator<String> paaLengdeSynkende = (a, b) -> b.length() - a.length();
		Collections.sort(listen,paaLengdeSynkende);
		System.out.println(listen);
	}
}

