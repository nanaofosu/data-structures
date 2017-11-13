package ch1;

public class testDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int temp;
		IncDate date1;
		IncDate date2 ;
//		date1 = new IncDate(5, 5, 2000);
//		date2 = date1;
//		System.out.println(date1);
//		System.out.println(date2);
//		date1.increment();
//		System.out.println(date1);
//		System.out.println(date2);
		
		date1 = new IncDate(5, 5, 2000);
		date2 = new IncDate(5, 5, 2000);
		if (date1 == date2)
			System.out.println("equal");
		else
			System.out.println("not equal");
		date1 = date2;
		if (date1 == date2)
			System.out.println("equal");
		else
			System.out.println("not equal");
		date1.increment();
		if (date1 == date2)
			System.out.println("equal");
		else
			System.out.println("not equal");
	}

}
