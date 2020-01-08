package com.bcits.jdbc.abstrction;

public class ClassX implements Connection {

	@Override
	public Statement createStatement() {
		
		return new ClassC();
	}
	

}
