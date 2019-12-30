package com.bcits.jdbc.connection;

public class Driver1 {
	public Connection1 myMethod(String str) {
		// some business logic
		Connection1 ref = null;
		if (str.equals("one")) {
			ref = new ClassA();
		} else {
			ref = new ClassB();
		}
		return ref;
	}// end of myMethod

}
