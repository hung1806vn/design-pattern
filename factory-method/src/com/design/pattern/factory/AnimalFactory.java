package com.design.pattern.factory;

import com.design.pattern.object.Animal;
import com.design.pattern.object.Bird;
import com.design.pattern.object.Dog;
import com.design.pattern.type.AnimalType;

public class AnimalFactory {

	public AnimalFactory() {
	}

	public Animal getAnimal(AnimalType type) {
		switch (type) {
		case BIRD:
			return new Bird();
		case DOG:
			return new Dog();
		default:
			throw new IllegalArgumentException(String.format("Type [%s] is not supported", type));
		}

	}
}
