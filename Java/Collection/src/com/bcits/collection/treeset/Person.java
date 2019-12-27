package com.bcits.collection.treeset;

public class Person implements Comparable<Person> {
	int age;
	String nmae;
	public Person(int age, String nmae) {
		super();
		this.age = age;
		this.nmae = nmae;
	}
	

	@Override
	public String toString() {
		return "Person [age=" + age + ", nmae=" + nmae + "]";
	}


	@Override
	public int compareTo(Person o) {   
		
		return this.age - o.age;
	}

	

}
