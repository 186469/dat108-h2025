package no.hvl.dat108.people;

/* Kopiert fra javabrains.io sitt Java 8 Lambda Basics kurs */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
	
	static void printLastNameStartsWithC(List<Person> people) {
		
		//printConditionally(people, p -> true);
		for(Person p : people) {
			if(p.lastName().startsWith("C"))
			System.out.println(p);
		}
	}
	
	static void printConditionally(List<Person> liste, Predicate<Person> pred) {
		for(Person p : liste) {
			if(p.firstName().startsWith("C")) {
				System.out.println(p);
			}
		}
	}
	
	static void doConditionly(List<Person> people, Predicate<Person> pred, Consumer<Person> cons) {

		for(Person p : people) {
			if(pred.test(p)) {
				cons.accept(p);
			}
		}
	}
	
	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);

		// 1: Sorter personene på etternavn.
		
		Collections.sort(people, (a,b) -> a.lastName().compareTo(b.lastName()));
		Comparator<Person> paaEtternavnStigende = (a,b) -> a.lastName().compareTo(b.lastName());
		
		// 2: Skriv ut alle personene, én linje per person. 
		// 		Lag en egen hjelpemetode printAll(...) som gjør dette.
		
		//printAll(people);
		
		
		
		
		// 3: Skriv ut alle personene som har etternavn som begynner på C.
		//		Lag en egen hjelpemetode printLastNameStartsWithC(...) som gjør dette.

		//printLastNameStartsWithC(people);
		
		// 4: Skriv ut alle personene som har fornavn som begynner på C.
		//		Vi ser nå at det er tungvint å lage én utskriftsmetode per
		//      spesialtilfelle. Lag en generell hjelpemetode printConditionally(...)
		//		gjør jobben i stedet. Denne tar inn listen + et lambdauttrykk.

		//printConditionally(people, p -> p.firstName().startsWith("C"));
		
		// 5: Skriv ut ALLE personene ved å bruke printConditionally(...)
		
		
		// >>>> Tilbake til ppt for litt mer "teori" før vi gjør siste
		
		
		// 6: Skriv ut fornavn til alle over 50 år.
		//    	Lag en metode doConditionally(...)
		
		doConditionly(people, p -> p.age() >= 50, p -> System.out.println(p.firstName()));
	}

	

	private static void printAll(List<Person> people) {

		for(Person p : people) {
			System.out.println(p);
		}
	}
	
}
