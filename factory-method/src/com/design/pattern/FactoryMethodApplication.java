package com.design.pattern;

import com.design.pattern.factory.AnimalFactory;
import com.design.pattern.object.Animal;
import com.design.pattern.type.AnimalType;

public class FactoryMethodApplication {
	public static void main (String args[]){
		AnimalFactory factory = new AnimalFactory();
		Animal animal = factory.getAnimal(AnimalType.HUMAN);
		animal.move();
	}
}
