package com.bcits.jdbc.abstrction;

public class ClassY implements Connection {

	@Override
	public Statement createStatement() {
		return new ClassB();
	}
}
