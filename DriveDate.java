package ie.dip.ass.ans;

import java.util.Date;

public class DriveDate implements Cloneable{

	private Date date;

	public Date getDate() {
		return date;
	}

	public void setDate(Date d) {
		this.date = d;
	}
	
	protected Object clone(){
		
		DriveDate clone = new DriveDate();
		clone.setDate((Date) this.date.clone());
		return clone;
	}

}
