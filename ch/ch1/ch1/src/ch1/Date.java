package ch1;

public class Date {
	protected int year, month, day;
	public static final int MINYEAR = 1583;
	
	//constructor
	public Date(int newMonth, int newDay, int newYear) {
		year = newYear;
		month = newMonth;
		day = newDay;
	}
	
	//observers (setters and getters)
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDay() {
		return day;
	}
	
	public int lilian() {
		return 0;
	}
	
	@Override
	public String toString() {
		return(month + "/" + day + "/" + year);
	}
}
