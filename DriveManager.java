package ie.dip.ass.ans;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DriveManager {

	private Collection<Drivable> col = new ArrayList<Drivable>();
	private DriveDate dd = new DriveDate();

	public void add(Drivable d) {
		col.add(d);		// O(1) constant; go to end of arraylist
	}

	public void delete(Drivable d){
		col.remove(d);	// O(n) linear; may not be in the list or last in the list
	}

	public void sort() {
		Collections.sort((List) col);
		// Collection.sort((List) col);	// O(n log(n))
	}

	public Collection<Drivable> getAll(){
		return this.col;	// O(1) constant; go to the end of the list
		// or return new ArrayList<Drivable>(col); // O(n) linear; have to copy to a new list
	}

	public Collection<Drivable> getAllSorted() {
		this.sort();	// n log (n); sort O(n log (n))
		return getAll();// n
	}

	public Drivable getDrivable(String name) {
		for (Drivable d : col) {
			if (d.getName().equals(name)){
				return d;
			}
		}
		return null;
	}

	public Collection<Drivable> getDifference(Collection<Drivable> other){

		Collection<Drivable> temp = new ArrayList<Drivable>(col);
		temp.removeAll(other);
		return temp;
	}
	
	

	// Black Diamond
	public DriveDate getDriveDate() throws CloneNotSupportedException {
		//	DriveDate clone = null;
		// clone = (DriveDate) dd.clone();
		DriveDate clone = new DriveDate();
		clone.setDate(new Date(dd.getDate().getTime()));
		return clone;
	}

	//***
	public void setDriveDate(DriveDate dd) {
		// public void setDriveDate(Drivable dd) {
		this.dd = new DriveDate();
		dd.setDate(dd.getDate());
	}

}
