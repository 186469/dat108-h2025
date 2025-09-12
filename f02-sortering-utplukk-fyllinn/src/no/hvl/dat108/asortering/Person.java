package no.hvl.dat108.asortering;

/* Ny mulighet f.o.m. Java16: record - En forenklet måte å lage en dataklasse */
public record Person(String fornavn, String etternavn, int fodselsaar)
			implements Comparable<Person> {

	/* Ønsker en litt forenklet toString() */
	@Override
	public String toString() {
		return "["+ fornavn + ", " + etternavn + ", " + fodselsaar + "]";
	}

	@Override
	public int compareTo(Person other) {		
		return this.etternavn.compareTo(other.etternavn);
	}
	
	/* Ønsker standard sortering på etternavn */
}


