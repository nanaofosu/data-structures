// The BST class that represents binary search trees
// Xiwei Wang

import java.util.*; // for using the Stack class

public class BST
{
    // instance variables
    private BSTNode m_root;
    
    // constructor
    public BST()
    {
        m_root = null;
    }

    //clear the tree
    public void clear(){
        m_root.setRight(null);
        m_root.setLeft(null);
    }
    
    // add a value into the tree
    public void add(int v)
    {
        m_root = addRec(v, m_root);
    }
    
    // recursive helper method for add
    public BSTNode addRec(int v, BSTNode node)
    {
        if (node == null) // check if the tree is empty
            node = new BSTNode(v);
        else if (v < node.getInfo())
            node.setLeft(addRec(v, node.getLeft())); // if the value is less than the current
                                                     // node, then go to the left subtree
        else if (v > node.getInfo())
            node.setRight(addRec(v, node.getRight())); // if the value is greater than the current
                                                       // node, then go to the right subtree                                        
        
        return node;
    }
    
    // get the size of the tree
    public int size()
    {
        //return sizeRec(m_root);
        return sizeIter(m_root);
    }
    
    // recursive helper method for size
    public int sizeRec(BSTNode node)
    {
        if (node == null)
            return 0;
        else
            return sizeRec(node.getLeft()) + sizeRec(node.getRight()) + 1;
    }
    
    // iterative helper method for size
    public int sizeIter(BSTNode node)
    {
        int numNodes = 0;
        
        if (node != null)
        {
            Stack<BSTNode> myStack = new Stack<BSTNode>();
            myStack.push(node);
            
            while (!myStack.isEmpty())
            {
                BSTNode current = myStack.pop();
                numNodes++;
                
                if (current.getLeft() != null)
                    myStack.push(current.getLeft());
                
                if (current.getRight() != null)
                    myStack.push(current.getRight());              
            }
        }
        
        return numNodes;
    }
    
    // print the tree content using in-order traversal
    public void inOrder()
    {
        inOrderRec(m_root);
        System.out.println();
    }
    
    // recursive helper method for inOrder
    public void inOrderRec(BSTNode node)
    {
        if (node != null)
        {
            inOrderRec(node.getLeft());
            System.out.print(node.getInfo() + " ");
            inOrderRec(node.getRight());
        }
    }

    //check whether a given method is in the tree
    public boolean contains(int v){
        return containsRec(v, m_root);
    }

    //recursive helper method fot contains
    public boolean containsRec(int v, BSTNode node){
        if(node == null){
            return  false;
        }
        if(v < node.getInfo()){
            return containsRec(v, node.getLeft());
        }
        else if(v > node.getInfo()){
            return containsRec(v, node.getRight());
        }
        else{
            return true;
        }
    }

    //Remove a node from the tree
    public void remove(int v){
        return removeRec(int v, BSTNode node);
    }


}