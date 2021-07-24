package com.design.pattern.object;

public class BirdToy extends AnimalToy implements Animal{

	@Override
	public void move() {
		System.out.println("Bird Toy is running LUL");
	}

	@Override
	public void showType() {
		System.out.println("Type: " + getType());
	}
	
}
