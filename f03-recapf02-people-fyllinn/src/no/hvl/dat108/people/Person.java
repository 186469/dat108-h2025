package no.hvl.dat108.people;

public record Person(String firstName, String lastName, int age) implements Comparable<Person>{

	@Override
	public int compareTo(Person o) {
		
		return this.lastName().compareTo(other.lastName());
	}
	
}
