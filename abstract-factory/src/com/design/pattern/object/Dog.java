package com.design.pattern.object;

public class Dog extends RealAnimal implements Animal{

	@Override
	public void move() {
		System.out.println("Dog is running");
	}

	@Override
	public void showType() {
		System.out.println("Type: " + getType());
	}
	
}
