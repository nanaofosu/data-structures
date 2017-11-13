// The BSTNode class that represents BST nodes
// Xiwei Wang

public class BSTNode
{
    // instance variables
    private int m_info;
    private BSTNode m_left;
    private BSTNode m_right;
    
    // constructor
    public BSTNode(int info)
    {
        m_info = info;
        m_left = null;
        m_right = null;
    }
    
    // getters and setters
    public int getInfo()
    {
        return m_info;
    }
    
    public BSTNode getLeft()
    {
        return m_left;
    }

    public BSTNode getRight()
    {
        return m_right;
    }

    public void setLeft(BSTNode left)
    {
        m_left = left;
    }
    
    public void setRight(BSTNode right)
    {
        m_right = right;
    }    
}
