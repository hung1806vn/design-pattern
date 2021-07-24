package com.design.pattern;

import com.design.pattern.builder.MyCarBuilder;
import com.design.pattern.model.Car;
import com.design.pattern.model.Engine;
import com.design.pattern.model.GPSNavigator;
import com.design.pattern.model.TripComputer;
import com.design.pattern.type.CarType;
import com.design.pattern.type.Transmission;

public class MyBuilderApplication {
	public static void main(String args[]) {
		MyCarBuilder builder = new MyCarBuilder();
		Car car= builder.setType(CarType.CITY_CAR)
				.setSeats(2)
				.setEngine(new Engine(10.0,0))
				.setTransmission(Transmission.AUTOMATIC)
				.setTripComputer(new TripComputer())
				.setGpsNavigator(new GPSNavigator())
				.build();
		
		System.out.println("Car build: \n" + car.print()) ;
	}
	
}
