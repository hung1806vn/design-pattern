package com.design.pattern.factory;

import com.design.pattern.object.Animal;
import com.design.pattern.type.AnimalType;

public abstract class AnimalAbstractFactory {
	public abstract Animal getAnimal(AnimalType type) ;
}
