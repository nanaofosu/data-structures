/**
 * 
 */
package queueADT;

/**
 * @author webservices
 *
 */
public class ListNumberQueue implements NumberQueue {
	

	//instance variable 
	private LNode m_front; 		//always points to the front element in the queue
	private LNode m_rear;		//always points to the rear element of the queue
	private int m_numElements;	//keeps track of the number of elements in the queue

	/**
	 * Queue constructor. 
	 */
	public ListNumberQueue() {
		m_front = null; 			//set the front pointer to null since there is nothing in it
		m_rear = null; 			//set the rear pointer to null since there is nothing in it
		m_numElements = 0; 		//set number of elements to 0
	}
	
	// check to see if queue is empty
	public boolean isEmpty() {
		if(m_front == null) { 		//if front is null, then the queue is empty
			return true;
		}
		else {
			return false;		
		}
	}

	// method to check if this is full
	public boolean isFull() {
		return false; 				//since it is a linked list, it is never full
	}
	
	//method to add value to the rear
	public void enqueue(int v) {
		LNode newNode = new LNode(v); 	//first create a newNode with the value of 'v'
		
		//in case this is an empty set, set both front and rear pointers to point to it
		if(m_front == null) {
			m_front == m_rear == newNode; 		// set both front and rear pointers to point to it
		}
		else {
			m_rear.setLink(newNode);				//set the rear to point to the new Node's address
			m_rear  = newNode;				//set the rear value to the new Node's value
		}
		
		m_numElements++;				//increase number of value by a factor of 1

	}
	
	// Remove value from the front of the queue
	public int dequeue() {
		
		// check if its empty
		if(isEmpty()) {
			throw new RuntimeException("dequeue attempted on empty list");	//throw exception
		}
		else {
			int val = m_front.getInfo();		//get the value and store it in val
			m_front = m_front.getLink();		//set the front pointer to point to the next element in the queue
			// if the value of the m_front is null, then there are no more elements left in the queue
			if (m_front == null) {
				m_rear = null;		//set rear to null as well.
			}
		}
		m_numElements--;		//decrease the number of elements by one
		return val;		//return the value
	}

	//Get the size of the linked list
	public int size() {
		return m_numElements;
	}
	
	//Get the string output of the Queue
	@Override 
	public String toString() {
		String queueContent = "The content of the queue is ";
        LNode current = m_front;
        while(current !=null) {
        		queueContent += current.getInfo() + " ";
        		queueContent.getLink();
        }
        return queueContent;
	}

}
