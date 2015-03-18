package ie.dip.ass.ans;

public interface Drivable extends Comparable<Drivable>{
	
	public String getName();
	public void setName(String name);
	public void drive();
	
}