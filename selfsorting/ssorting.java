import java.util.*;


public class ssorting{
  public static void main(String[] args) {
    int[] myArray = {10, 20, 5, 3, 17, 11, 25, 11, 12, 6, 11, 4, 14};
    System.out.println("The original array is " + Arrays.toString(myArray));

    int[] testArray = myArray.clone();
    selectionSort(testArray);
    System.out.println("The array after Selection Sort is "
                        + Arrays.toString(testArray));

    // testArray = myArray.clone();
    // mergeSort(testArray);
    // System.out.println("The array after Merge Sort is "
    //                     + Arrays.toString(testArray));
    //
    // testArray = myArray.clone();
    // quickSort(testArray);
    // System.out.println("The array after Quick Sort is "
    //                         + Arrays.toString(testArray));


     testArray = myArray.clone();
    bubbleSort(testArray);
    System.out.println("The array after Bubble Sort is " + Arrays.toString(testArray));

  }

  /*Bubble sort. */
  //given an array myArray
  public static void bubbleSort(int[] myArray){
    int temp = 0;
    for(int i =0; i < myArray.length-1; i++){
      for(int j=0; j<myArray.length-1; j++){
        if(myArray[j] > myArray[j+1]){
          temp = myArray[j];
          myArray[j] = myArray[j+1];
          myArray[j+1] = temp;
        }

      }
    }
  }

  /*Selection Sort*/
  public static void selectionSort(int[] myArray){
    int i, j, min, minIndex, temp = 0;

    for( i=0; i < myArray.length; i++){
       min = myArray[i];
       minIndex=i;

      for( j =i; /*we start at i every time*/ j < myArray.length; j++){
        if(min > myArray[j]){
          min = myArray[j]; //change what the min value is
          minIndex = j;
        }
      }
      // check to see if the min value has changed. If it has the swap
      if(min < myArray[i]){
        temp = myArray[i];
        myArray[i] = myArray[minIndex];
        myArray[minIndex] = temp;
      }
    }
  }


}
