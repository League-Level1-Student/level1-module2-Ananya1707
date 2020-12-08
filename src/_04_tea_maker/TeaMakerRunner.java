package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class TeaMakerRunner {
	public static void main(String[] args) {
		TeaBag t = new TeaBag("green");
		Kettle k = new Kettle();
		Cup c = new Cup();
		
		t.getFlavor();
		k.boil();
		Water w = k.getWater();
		c.makeTea(t,w);
	}

}
