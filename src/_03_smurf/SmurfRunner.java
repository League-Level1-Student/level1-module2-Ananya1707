package _03_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		
		Smurf h = new Smurf("Handy");
		Smurf p = new Smurf("Papa");
		Smurf s = new Smurf("Smurfette");
		
		System.out.println(h.getName());
		h.eat();
		
		System.out.println(p.getName());
		p.eat();
		System.out.println(p.getHatColor());
		System.out.println(p.isGirlOrBoy());
		
		System.out.println(s.getName());
		s.eat();
		System.out.println(s.getHatColor());
		System.out.println(s.isGirlOrBoy());

	}

}
