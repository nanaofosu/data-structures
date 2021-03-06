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
    /*
    . While current is not NULL
   If current does not have left child
      a) Print current’s data
      b) Go to the right, i.e., current = current->right
   Else
      a) Make current as right child of the rightmost
         node in current's left subtree
      b) Go to this left child, i.e., current = current->left
     */
    // print the tree content using in-order traversal
    public void inOrder()
    {
        /*create current and parent node*/
        BSTNode current;
        BSTNode parent;
        String output = "";

        /*If the root is null, then there is nothing in the tree. return nothing*/
        if(m_root == null){
            return;
        }

        // set current to be the root
        current = m_root;
        /* We will be looping untill we get to a null position*/
        while(current != null){
            // check if the left is null. If it is, then we have rached the last left node
            if(current.getLeft() == null){
                output += current.getInfo() + " "; // append value to output.
                //set current to the right node
                current = current.getRight();
            }
            else{
                 /* Find the inorder predecessor of current */
                parent = current.getLeft();

                while (parent.getRight() != null && parent.getRight() != current)
                    parent = parent.getRight();

                /* Make current as right child of its inorder predecessor */
                if (parent.getRight() == null)
                {
                    parent.setRight(current);
                    current = current.getLeft();
                }

                 /* fix the right child of predecssor*/
                 else
                 {
                    parent.setRight(null);
                    output +=current.getInfo() + " ";
                    current = current.getRight();
                }   /* End of if condition */

            }
        }

        System.out.print(output);
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
