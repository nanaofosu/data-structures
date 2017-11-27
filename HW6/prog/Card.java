// The Card class that represents cards
// Do not make any changes to this file!
// Xiwei Wang

import java.io.*;

public class Card implements Serializable
{
    // instance variables
    private int m_suit;   //defines the suit ex. Hearts, Spades etc.
    private int m_rank;   //defines the rank example 8, 9, King, Jack ect.

    // constructor
    public Card(int suit, int rank)
    {
        m_suit = suit;
        m_rank = rank;
    }

    // getters
    public int getSuit()
    {
        return m_suit;
    }

    public int getRank()
    {
        return m_rank;
    }

    // return a string representation of the card
    public String toString()
    {
        String[] suitChars = {"C", "D", "H", "S"};
        String[] rankChars = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        return suitChars[m_suit] + rankChars[m_rank];
    }
}
