package com.design.pattern.model;

public class Circle extends Shape {

	private int radius;

	public Circle() {

	}

	public Circle(Circle target) {
		super(target);
		if (target != null) {
			radius = target.getRadius();
		}
	}

	@Override
	public Shape clone() {
		return new Circle(this);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return String.format("Circle info: \n x:%s \n y:%s \n color:%s \n radius:%s", getX(), getY(), getColor(),
				getRadius());
	}
}
