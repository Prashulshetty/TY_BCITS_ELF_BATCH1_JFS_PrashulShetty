package com.bcits.hackerrank.datastructure;

import java.util.Comparator;

public class SortStudent implements Comparator<Student> {
	@Override
	public int compare(Student obj1,Student obj2) {
		if(obj1.getCgpa() < obj2.getCgpa()) {
			return 1;
		} else if (obj1.getCgpa() > obj2.getCgpa()) {
			return -1;
		} else if (obj1.getname() != (obj2.getname())) {
		return obj1.getname().compareTo(obj2.getname());
	} else {
		return obj1.getId() - obj2.getId();
	 }
	}
}
