

public class SortedList {
	// instance vars
	private SLNode m_first;

	//conctructor
	public SortedList(){
		m_first = null;
	}

	// add a new node keeping list sorted
	public void add(int v){
		SLNode newNode = new SLNode(v);
		SLNode current = m_first;
		SLNode previous = null;

		while (current != null){  // while this list is not empty
			if(current.getInfo() < v){	// since we are keeping things sorted, we want to check value to determine were to insert 'v'
				//if the current vaue is smaller than the value we are inserting
				previous = current;		//set previous pointer to current
				current = current.getLink();	//set current pointer to point to the next value
			}
			else {
				break;
			}

		}
		if(previous == null){
			newNode.setLink(m_first);
			m_first = newNode;
		}
		else{
			newNode.setLink(current);
			previous.setLink(newNode);
		}
	}
}