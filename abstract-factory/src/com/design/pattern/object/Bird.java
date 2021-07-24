package com.design.pattern.object;

public class Bird extends RealAnimal implements Animal{

	@Override
	public void move() {
		System.out.println("Bird is flying");
	}

	@Override
	public void showType() {
		System.out.println("Type: " + getType());
	}
	
	
}
