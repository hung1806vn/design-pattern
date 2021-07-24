package com.design.pattern;

import com.design.pattern.builder.CarBuilder;
import com.design.pattern.builder.CarManualBuilder;
import com.design.pattern.builder.Director;
import com.design.pattern.model.Car;
import com.design.pattern.model.Manual;

public class BuilderApplication {
	private final static Director DIRECTOR = new Director();

	public static void main(String args[]) {
		CarBuilder builder = new CarBuilder();
		DIRECTOR.constructSportsCar(builder);
		
		Car car = builder.build();
		System.out.println("Car build: \n" + car.getCarType()) ;
		
		
		CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
		DIRECTOR.constructSUV(manualBuilder);
        Manual carManual = manualBuilder.build();
        System.out.println("\nCar manual built:\n" + carManual.print());
	}
}
