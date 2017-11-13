package numstack;

public class ArrayNumberStack implements NumberStack {
	
	// instance variables
	private int[] m_array;
	private int m_index;

	//constructor
	public ArrayNumberStack(int cap) {
		m_array = new int[cap];
		m_index = 0;
	}

	@Override
	public boolean isEmpty() {
		if(m_index == 0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		if(m_index == m_array.length) {
			return true;
		}
		return false;
	}

	@Override
	public void push(int v) {
		if(isFull()) {
			throw new RuntimeException("Push attempeted on a full stack");
		}
		else {
			m_array[m_index] = v;
			m_index ++;
		}

	}

	@Override
	// removes and returns the element at the top of the stack
	public int pop() {
		if(isEmpty()) {
			throw new RuntimeException(" pop attempted on empty stack");
		}
		else {
			int temp = m_array[m_index-1];
			m_index--;
			return temp;
		}
		
	}

	@Override
	public int top() {
		 // return the element at the top of the stack
		if(isEmpty()) {
			throw new RuntimeException(" top() attempted on empty stack");
		}
		else {
			return m_array[m_index-1];
		}
	}

	@Override
	public int size() {
		return m_index;
		
	}
	
	// return the string representation 
	   @Override
	   public String toString()
	   {
	      String stackContent ="The content of the stack from top to bottom is \n";
	      
	      for(int i = m_index - 1; i >= 0; i--)
	         stackContent += m_array[i] + "\n";
	         
	      return stackContent;   
	   }    

}
