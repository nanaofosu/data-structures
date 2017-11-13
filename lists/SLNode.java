// The LNode class that reprents a node in linked lists
// Do not make any changes to this file!
// Xiwei Wang

public class SLNode
{
    // instance variables
    private int m_info; 	// some int value
    private LNode m_link;	//link to the next node

    // constructor
    public SLNode(int info)
    {
        m_info = info;		//set m_value to the integer value passed in the costructor
        m_link = null;		// set the node's link to null
    }

    // member methods
    public void setLink(SLNode link)
    {
        m_link = link;	//this sets the link to the on the node to point to the next node
    }

    public LNode getLink()
    {
        return m_link;	//this return the link being pointed to by the current node.
    }

    public int getInfo()
    {
        return m_info;	// return the vakue of the current node
    }
}
