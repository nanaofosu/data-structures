package queueADT;

public class Nana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			public int example(int n) {
				if(n == 1) {
					return 1;
				}
				else {
					return example(n/2) +(2 * n -1 );
				}
			}
			
			System.out.println(example(8));
	}

}
