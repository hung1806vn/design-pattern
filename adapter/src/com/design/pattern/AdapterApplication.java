package com.design.pattern;

import com.design.pattern.adapter.SquarePegAdapter;
import com.design.pattern.model.RoundHole;
import com.design.pattern.model.RoundPeg;
import com.design.pattern.model.SquarePeg;

public class AdapterApplication {
	public static void main(String args[]) {
		RoundHole hole = new RoundHole(5);
		RoundPeg rpeg = new RoundPeg(5);
		if (hole.fits(rpeg)) {
			System.out.println("Round peg r5 fits round hole r5.");
		}

		SquarePeg smallSqPeg = new SquarePeg(2);
		SquarePeg largeSqPeg = new SquarePeg(20);

		SquarePegAdapter adapter = new SquarePegAdapter(largeSqPeg);
		SquarePegAdapter adapter1 = new SquarePegAdapter(smallSqPeg);

		if (hole.fits(adapter1)) {
			System.out.println("Square peg w2 fits round hole r5.");
		}
		if (!hole.fits(adapter)) {
			System.out.println("Square peg w20 does not fit into round hole r5.");
		}
	}
}
