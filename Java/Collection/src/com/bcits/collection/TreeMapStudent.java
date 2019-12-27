package com.bcits.collection;

public class TreeMapStudent implements Comparable<TreeMapStudent>{
	int age;
	String name;
	public TreeMapStudent(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "TreeMapStudent [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public int compareTo(TreeMapStudent o) {
		return this.age-o.age;
	}
	

}
