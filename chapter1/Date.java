//package ch01.dates;
public class Date {
protected int year, month, day;
public static final int MINYEAR = 1583;
// Constructor
public Date(int newMonth, int newDay, int newYear)
{
        month = newMonth; day = newDay; year = newYear;
}
// Observers
public int getYear() {
        return year;
}
public int getMonth() {
        return month;
}
public int getDay(){
        return day;
}
// public int lilian()
// {
//         // Returns the Lilian Day Number of this date.
//         // Algorithm goes here. Code is included with the program files.
//         // See Lilian Day Numbers feature section for details.
// }
@Override
public String toString()  // Returns this date as a String.
{
        return(month + "/" + day + "/" + year);
}

}
