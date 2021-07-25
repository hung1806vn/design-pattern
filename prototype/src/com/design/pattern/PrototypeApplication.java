package com.design.pattern;

import com.design.pattern.model.Circle;
import com.design.pattern.model.Rectangle;

public class PrototypeApplication {
	public static void main (String args[]){
		Circle circle = new Circle();
        circle.setX(10);
        circle.setY(20);
        circle.setRadius(15);
        circle.setColor("red");

        Circle anotherCircle = (Circle) circle.clone();
        
        System.out.println(anotherCircle.toString());

        Rectangle rect = new Rectangle();
        rect.setX(10);
        rect.setY(20);
        rect.setColor("red");
        rect.setWidth(30);
        rect.setHeight(20);
        
        Rectangle anotherRect = (Rectangle) rect.clone();
        System.out.println(anotherRect.toString());
	}
}
