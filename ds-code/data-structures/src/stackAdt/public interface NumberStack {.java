public interface NumberStack {
	boolean isEmpty(); // checks whether the stack is empty
	boolean isFull(); // check if its full
	void push(int v); //push value into stack
	int pop(); //remove and return the element at the top of stack
	int size(); // returns the size of stack
	
	@Override 
	String to toString(); // return a string representation of the stack
}
