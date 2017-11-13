import java.util.Arrays;

public class BinarySearch {

	public BinarySearch() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] myArray= {10, 20, 5, 13, 7, 19, 8, 18, 6};
		System.out.println("The original is " + Arrays.toString(myArray));
		System.out.println("Itterative binary search: " + binarySearchIter(myArray, 8));

	}
	
	public static boolean binarySearchIter(int[] numArray, int value) {
		int first = 0;
		int last = numArray.length - 1;
		
		while(first <= last) {
			int mid = (first +last ) / 2;
			if(value < numArray[mid]) {
				last = mid - 1;
			}
			else if(value > numArray[mid]){
				first = mid +1;
			}
			else {
				return true;
			}
		}
		return false;
	}
	
	public static boolean binarySearchRecHelper(int numArray, int value, int first, int last) {
		if(first > last) {
			return false;
		}
		
		int mid = (first +last ) / 2;
		
		if(value < numArray[mid]) {
			return binarySearchRecHelper(numArray, value, first, mid - 1);
		}
		else if(value > numArray[mid]){
			return binarySearchRecHelper(numArray, value, mid + 1, first);
		}
		else {
			return true;
		}
	}
	
	public static boolean binarySearchRec(int[] numArray, int value) {
		return binarySearchRecHelper(numArray, value, mid + 1, first);
	}

}
