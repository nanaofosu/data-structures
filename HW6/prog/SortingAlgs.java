// The SortingAlgs class that implements selection sort and merge sort
// your name here

public class SortingAlgs
{
    // card comparison
    public int compares(Card c1, Card c2)
    {
        // TODO: implement this method
        //first compare the suits and see which is greater. If the suits are equal compare the values.

        if(c1.getSuit() == c2.getSuit()){ //if the suits are the same
          if((c1.getRank() - c2.getRank()) > 0){ //check the rank. If the rank is greater than 0, then c1 is greater
            return 1;
          }
          else{
            return -1;
          }
        }
        else if(c1.getSuit() > c2.getSuit()){
          return 1;
        }
        else{
          return -1;
        }


    }

    // selection sort
    public void selectionSort(Card[] cardArray)
    {
                int i, j, minIndex = 0;
                Card min, temp = null; // at first the cards are null.

                for( i=0; i < cardArray.length; i++){
                  min = cardArray[i]; //set min to card at 0 index to start out.
                  minIndex=i;   // set the minIndex to 'i' to start out

                  for( j =i; /*we start at i every time*/ j < cardArray.length; j++){
                    if(compares(min,cardArray[j]) == 1){  //min is greater thank current card at 'j'
                      min = cardArray[j]; //change what the min value is
                      minIndex = j; //set minIndex to the 'j' since we have found a smaller card
                    }
                  }
                  // check to see if the min value has changed. If it has the swap
                  if(compares(min,cardArray[i]) == -1){
                    temp = cardArray[i];  // this is the swapping proccess
                    cardArray[i] = cardArray[minIndex];
                    cardArray[minIndex] = temp;
                  }
                }
    }
 
    // find the index of the smallest element in the specified range
    public int minIndex(Card[] cardArray, int startIndex, int endIndex)
    {
        // TODO: implement this method

        return -1; // replace this statement with your own return
    }

    // merge sort
    public void mergeSort(Card[] cardArray)
    {
        mergeSortRec(cardArray, 0, cardArray.length - 1);
    }

    // recursive helper recursive method for mergeSort
    public void mergeSortRec(Card[] cardArray, int startIndex, int endIndex)
    {
        if (startIndex < endIndex)
        {
            int midIndex = (startIndex + endIndex) / 2;
            mergeSortRec(cardArray, startIndex, midIndex);
            mergeSortRec(cardArray, midIndex + 1, endIndex);
            merge(cardArray, startIndex, endIndex);
        }
    }

    // merge two sorted halves into one sorted array
    public void merge(Card[] cardArray, int startIndex, int endIndex)
    {
        // TODO: implement this method
    }
}
