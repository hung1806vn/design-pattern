package com.design.pattern.object;

public class DogToy extends AnimalToy implements Animal{

	@Override
	public void move() {
		System.out.println("Dog Toy is running");
	}

	@Override
	public void showType() {
		System.out.println("Type: " + getType());
	}
	
}
