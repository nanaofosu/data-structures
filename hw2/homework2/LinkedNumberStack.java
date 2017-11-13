// The linked list based implementation for the NumberStack ADT
// Your name here
public class LinkedNumberStack implements NumberStack
{
    // instance variable
    private LNode m_top;
    
    // check whether the stack is empty
    public boolean isEmpty()
    {       
        if (m_top == null)
            return true;
        else
            return false;
    }
    
    // check whether the stack is full
    public boolean isFull()
    {
        return false;
    }  
    
    // return the element at the top of the stack
    public int top()
    { 
        if (isEmpty())
            throw new RuntimeException("top attempted on an empty stack");
        else
            return m_top.getInfo();
    }
    
    // push a value onto the stack
    public void push(int v)
    {
		LNode newNode = new LNode(v); // first create a new node with the value that 'v' that has been provided
		newNode.setLink(m_top);		// set the new node to point to m_top. Remember that m_top points to to something already
		m_top = newNode;				// set m_top to point to the new node.
    }
    
    // remove and return the value at the top of the stack
    public int pop()
    { 	/*
	    		first check if it is empty because we cant pop and empty stack.
	    		if it is not empty, we need to get the top value and store it in a temp variable, and get the link to the next value
	    */
	    	if (!isEmpty( )) {		//check and see if the stack is empty.
	    		int poppedNode = m_top.getInfo();	//create an int variable called popped node and store the value of m_top in it.
	   		 m_top = m_top.getLink( );		//m_top is set to point to where to the location (link) of the next node.
	   		return poppedNode;		//we return the poppedNode here.
	   	 }
		 else {
			 throw new RuntimeException("pop attempted on an empty stack");	//if the stack is empty, throw an exception.
		 }
    }
    
    // return the size of the stack
    public int size()
    {   
    		LNode currentNode = m_top; // this node will point to the top.
    		int count = 0; // this is the counter we will be using.
    		while(currentNode != null) {		// as long as current node is not pointing to null we are not at the end of our list (stack)
    			count++;			//increment our counter by 1
    			currentNode = currentNode.getLink();		// get the next link in the stack and point our currentNode to that. 
    		}
        return count; 	// when the loop is over return the count of nodes we have
    }

    // return a string representation of the stack
    @Override    
    public String toString()
    {
        String stackContent = "";
        LNode current = m_top;

        while (current != null)
        {
            stackContent += current.getInfo() + " ";
            current = current.getLink();
        }

        return stackContent;    
    }
}