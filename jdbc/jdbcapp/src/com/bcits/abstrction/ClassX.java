package com.bcits.abstrction;

public class ClassX implements Connection {

	@Override
	public Statement createStatement() {
		
		return new ClassC();
	}
	

}
