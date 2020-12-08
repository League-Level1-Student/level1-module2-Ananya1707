package _06_minion;

public class Minion {
	private String name; 
	private int eyes; 
	private String color; 
	private String master;
	
	Minion(String name, int eyes, String color, String master){
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;				
	}
	
	public String getName() {
		return name;
	}
	
	public int getEyes() {
		return eyes;
	}
	
	public String getColor() {
		return color;
	}
	
	void setMaster(String m) {
		master = m;
	}
	
	public String getMaster() {
		return master;
	}

}
