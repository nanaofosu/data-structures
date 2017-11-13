package ch1;

public class IncDate extends Date {

	public IncDate( int newMonth, int newDay, int newYear) {
		super(newMonth, newDay, newYear);
	}
	
	public void increment() {
		this.day = super.getDay()+1;
	}

}
