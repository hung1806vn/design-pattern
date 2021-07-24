package com.design.pattern.object;

public class Bird implements Animal{
	public Bird() {
		
	}

	@Override
	public void move() {
		System.out.println("Bird is flying");
	}
}
