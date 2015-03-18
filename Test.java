package ie.dip.ass.ans;

import ie.gmit.dip.Car;
import ie.gmit.dip.Drivable;
import ie.gmit.dip.DriveManager;

public class Test {
	
public static void main(String[] args) {
		
		DriveManager dm = new DriveManager();
		
		Car ford = new Car("Ford");
		Car bmw = new Car("BMW");
		Car nissan = new Car("Nissan");
		
		dm.add(ford);
		dm.add(bmw);
		dm.add(nissan);
		
		dm.sort();
		for (Drivable car : dm.getCol()) {
			System.out.println(car.getName());
		}	
	}
}
