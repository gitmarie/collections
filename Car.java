package ie.dip.ass.ans;

public class Car implements Drivable{

	private String name;
	
	public void  drivable() {
		System.out.println("Vroooom");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

//***
	@Override
	public int compareTo(Drivable other) {
		// return this.getName().compareTo(name);
		return this.getName().compareTo(other.getName());
	}

	@Override
	public void drive() {
		
	}
}
