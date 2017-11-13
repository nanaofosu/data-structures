// The test driver that check for palindromes
// Xiwei Wang

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner conIn = new Scanner(System.in);
        
        System.out.print("Please enter a string: ");
        String str = conIn.nextLine();
        
        if (stringIsPalindrome(str))
            System.out.println("\"" + str + "\" is a palindrome." );
        else
            System.out.println("\"" + str + "\" is not a palindrome." );
    }
	

    public static boolean stringIsPalindrome(String str)
    {
        //get the size of the string
    		int stringSize = str.length();
    		// create an array of characters
    		char[] firstArray = new char[stringSize];
    		char[] secArray = new char[stringSize];
         
         CharQueue q = new CharQueue(str.length());
         CharStack s = new CharStack(str.length());
         
    		for(int i=0; i< stringSize; i++) {
    			char c = str.charAt(i);
    			q.enqueue(c);
            s.push(c);
    		}
         boolean isPalindrome = true;
         
    		while(!s.isEmpty()){
            if(q.dequeue() != s.pop()){
               isPalindrome = false;
               break;
            }
         } 
         return isPalindrome;   		 
    }
}
