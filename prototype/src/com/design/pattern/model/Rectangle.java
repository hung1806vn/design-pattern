package com.design.pattern.model;

public class Rectangle extends Shape {

	private int width, height;

	public Rectangle() {

	}

	public Rectangle(Rectangle target) {
		super(target);
		if (target != null) {
			width = target.getWidth();
			height = target.getHeight();
		}
	}

	@Override
	public Shape clone() {
		// TODO Auto-generated method stub
		return new Rectangle(this);
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return String.format("Rect info: \n x:%s \n y:%s \n color:%s \n width:%s \n height:%s ", getX(), getY(),
				getColor(), getWidth(), getHeight());
	}
}
