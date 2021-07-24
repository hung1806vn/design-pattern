package com.design.pattern.factory;

import com.design.pattern.object.Animal;
import com.design.pattern.object.BirdToy;
import com.design.pattern.object.DogToy;
import com.design.pattern.type.AnimalType;

public class RealAnimalFactory extends AnimalAbstractFactory{

	public RealAnimalFactory() {
	}

	@Override
	public Animal getAnimal(AnimalType type) {
		switch (type) {
		case BIRD:
			return new BirdToy();
		case DOG:
			return new DogToy();
		default:
			throw new IllegalArgumentException(String.format("Type [%s] is not supported", type));
		}

	}
}
