package com.design.pattern.adapter;

import com.design.pattern.model.RoundPeg;
import com.design.pattern.model.SquarePeg;

public class SquarePegAdapter extends RoundPeg{
	private SquarePeg peg;
	
	public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }
	
	@Override
	public double getRadius() {
		return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
	}
}
