/**
 * 
 */
package numlist;

/**
 * @author Nana Ofosu
 *
 */
public class LinkedNumberList implements NumberList {

	//instance variable 
	private LNode m_first;
	private LNode m_last;

	 // The constructor
	 
	public LinkedNumberList() {
		m_first = null; // set m_first to null because it does not initially point to anything
	}

	// insert a number into the list
	@Override
	public void insert(int v) {
		LNode newNode = new LNode(v); // create a node object
		newNode.setLink(m_first); // set the link to m_first
		m_first = newNode; // set m_first to be the newNode that was created so our pointer is pointing to the first  node or node at top of stack.
		

	}

	// the list is never fill
	@Override
	public boolean isFull() {
		return false;
	}

	// check if it contains something
	@Override
	public boolean contains(int v) {
		LNode current = m_first; //create a pointer to an LNode and set it to point to m_first which points to our first node
		while(current != null) { // while the that pointer still points to a node.
			if(current.getInfo() == v) { // see if that node contains the int value we wanted
				return true; // if so return true
			}
			else {
				current = current.getLink(); // if not get the link of that node and point 'current' to that new link
			}
		}
		return false; // if loop finished return false because it was not present
	}
	
	@Override
	public String toString() {
		String listContent =  "The content of the list is: ";
		LNode current = m_first;
		
		while(current != null) {
			listContent += current.getInfo() + " ";
			current = current.getLink();
		}
		return listContent;
		
	}

}
