package com.design.pattern.factory;

import com.design.pattern.type.FactoryType;

public class AnimalFactory {
	public AnimalFactory() {
	}
	
	public AnimalAbstractFactory getFactory(FactoryType type) {
		switch (type) {
		case REAL:
			return new RealAnimalFactory();
		case TOY:
			return new AnimalToyFactory();
		default:
			throw new IllegalArgumentException(String.format("This type [%s] is not supported !", type));
		}
	}
}
