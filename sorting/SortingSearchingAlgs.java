// Sorting and searching algorithm implementations
// Xiwei Wang

import java.util.*;

public class SortingSearchingAlgs
{
    public static void main(String[] args)
    {
        int[] myArray = {10, 20, 5, 2, 17, 25, 9, 11, 3, 14, 13};
        System.out.println("The original array is " + Arrays.toString(myArray));

        int[] testArray = myArray.clone();
        selectionSort(testArray);
        System.out.println("The array after Selection Sort is "
                            + Arrays.toString(testArray));
    }

    // find the index of the smallest element in the specified range
    public static int minIndex(int[] numArray, int first, int last)
    {
        int indMin = first;

        for (int i = first + 1; i <= last; i++)
            if (numArray[i] < numArray[indMin])
                indMin = i;

        return indMin;
    }

    // selection sort
    public static void selectionSort(int[] numArray)
    {
        int last = numArray.length - 1;

        for (int i = 0; i < last; i++)
        {
            int indMin = minIndex(numArray, i, last);
            int temp = numArray[i];
            numArray[i] = numArray[indMin];
            numArray[indMin] = temp;
        }
    }

    //merge two sorted halves into one sorted Array
    public static void merge(int[] numArray, int first, int last){
      int mid = (first +last)/2;  //index of the middle element
      int n = last -first +1;   //size of the temp array
      int[]  tempArray = new int[n];  //the temp array

      int i1 = first;
      int i2 = mid +1;
      int j = 0;

      //we use a while loop because we dont know how many loops we will make
      while(i1 <= min && i2 <= last){
        if(numArray[i1] < numArray[i2]){
          tempArray[j] = numArray[i1];
          i1++;
        }
        else {
          tempArray[j] = numArray[i2];
          i2++;
        }
        j++;
      }
        // copy the remaining ordered arrays into tempArray
        while(i1 < mid){
          tempArray[j] = numArray[i1];
          i1++;
          j++;
        }
        while(i2 < last){
          tempArray[j] = numArray[i2];
          i2++;
          j++;
        }

        //copy back from the temp array
        for(j = 0; j < n; j++){
          numArray[j + first] = tempArray[j];
        }
    }
}
