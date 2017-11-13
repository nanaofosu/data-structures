// The BST class that represents binary search trees
// Your name here

import java.util.*;

public class BST 
{
    // instance variables
    private BSTNode m_root;
    private int m_size;
    
    // constructor
    public BST()
    {
        m_root = null;
        m_size = 0;
    }
    
    // add a value into the tree
    public void add(int v)
    {
        /* first we create a node for the new value */
        BSTNode newNode = new BSTNode(v);
        BSTNode current = m_root;

        /*
        next we find where it is to be placed.
        if the rool is null, then set this integer as the root.
        */
        if(m_root == null){
            m_root = newNode;
            m_size++;
            return;
        }

        while (true){
            /*Check to see if it should go left or right*/
            if(newNode.getInfo() < current.getInfo()){ /*
                if we are to go left
                got left
                */
                //if there is no left child set this as the left child
                if(current.getLeft() == null){

                    current.setLeft(newNode);
                    //increment the size
                    m_size++;
                    return;
                }
                else{
                    // set this as the new current and loop again
                    current = current.getLeft();
                }
            }
            else if(newNode.getInfo() > current.getInfo()){
                //go right
                if(current.getRight() == null){
                    current.setRight(newNode);
                    m_size++;
                    return;
                }
                else{
                    current = current.getRight();
                }
            }
            // we have spotted a duplicate
            else {
                return;
            }
        }


    }
    
    // print the tree content using in-order traversal
    public void inOrder()
    {
        /*create a current and parent node*/
        BSTNode current, parent;
        String output = "";

        if(m_root == null){
            return;
        }

        current = m_root;
        while(current != null){
            // check if the left is null
            if(current.getLeft() == null){
                output += current.getInfo(); // append to output.
                //set current to the right
                current = current.getRight();
            }
            else{
                
            }
        }


    }
    
    // get the size of the tree
    public int size()
    {
        return m_size;
    }
    
    // empty the tree
    public void clear()
    {
        m_root = null;
        m_size = 0;
    }
}
