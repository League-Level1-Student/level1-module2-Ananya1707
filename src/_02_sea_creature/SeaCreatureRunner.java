package _02_sea_creature;

public class SeaCreatureRunner {
	public static void main(String[] args) {
		
		SeaCreature sponge = new SeaCreature("Spongebob");
		SeaCreature starfish = new SeaCreature("Patrick");
		SeaCreature squid = new SeaCreature("Squidward");
		
		System.out.println(sponge.getName());
		sponge.eat();
		
		System.out.println(starfish.getName());		
		starfish.eat();
		
		System.out.println(squid.getName());		
		squid.eat();
	}

}
