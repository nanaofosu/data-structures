// The RecursiveMethods class that implements several recursive solutions
// Your name here

public class RecursiveMethods
{
    // This method calls the largestRec method and returns the largest.
    public int largest(int[] arr)
    {
        // Do not make any changes to this method!
        return largestRec(arr, 0);
    }

    // This method takes an integer array as well as an integer (the starting index) and returns the largest number in the array.
    public int largestRec(int[] arr, int pos)
    {
        if(pos == (arr.length-1)) { // if the positing is at the end, return the last value
                return arr[pos];
         } else {
                return Math.max(arr[pos], largestRec(arr, pos+1)); //call it on the first value and compare to the next value until you get to the base case
         }
    }

    // This method calls the sumRec method and returns the sum of the array.
    public int sum(int[] arr)
    {
        // Do not make any changes to this method!
        return sumRec(arr, 0);
    }

    // This method takes an integer array as well as an integer (the starting index) and returns the sum of the values in the array.
    public int sumRec(int[] arr, int pos)
    {

        if(pos == arr.length){ // if we get out of bounds, return 0 since we are adding up. this wont make a difference
            return 0;
        }
        else{
            return arr[pos] + sumRec(arr, pos + 1); // starting from pos =0, add all other positions' value
        }
          // replace this statement with your own return
    }

    // This method reads a string and returns the string in the reversed order.
    public String reverseStringRec(String s)
    {
        if ((s == null)||(s.length() <= 1) ){ //if the string is null, or empty, return that value
            return s;
        }
        return reverseStringRec(s.substring(1)) + s.charAt(0);
        //Maiya becomes a+y+i+a+M. This creates a substring minus 1,
        //then creates a substring of that substring, and so on till you get to null
    }



    // Bonus Question
    // This method takes a reference to the head of a linked list.
    // It returns the reference to the head of the linked list in the reversed order.
    public LNode reverseListRec(LNode head)
    {
      LNode newBatch; // create pointer to track the rest of the linked list

        /*If its an empty list */
        if ((head == null) || (head.getLink() == null)){
           return head;
        }

        newBatch = reverseListRec(head.getLink()); // get the rest to call all the nodes from the back to the front leaving out the very first
        head.getLink().setLink(head); //  1>2>3>4 this points the next Node to the head
        head.setLink(null);  // this will set head to null. This is needed because currently, head is pointing to last element in rest

        return newBatch;

    }
}
