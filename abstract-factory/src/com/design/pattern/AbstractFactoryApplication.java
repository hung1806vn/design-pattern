package com.design.pattern;

import com.design.pattern.factory.AnimalAbstractFactory;
import com.design.pattern.factory.AnimalFactory;
import com.design.pattern.object.Animal;
import com.design.pattern.type.AnimalType;
import com.design.pattern.type.FactoryType;

public class AbstractFactoryApplication {
	private static final AnimalFactory abstractFactory = new AnimalFactory();
	
	public static void main(String args[]) {
		
		AnimalAbstractFactory factory = abstractFactory.getFactory(FactoryType.REAL);
		Animal animal = factory.getAnimal(AnimalType.BIRD);
		animal.move();
		animal.showType();
	}
}
