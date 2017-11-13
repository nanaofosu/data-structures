package numstack;

public interface NumberStack
{
    boolean isEmpty();      // check whether the stack is empty
    boolean isFull();       // check whether the stack is full
    void push(int v);       // push a value onto the stack
    int pop();              // remove and return the element at the top of the stack
    int top();              // return the element at the top of the stack
    int size();             // return the size of the stack
    
    @Override
    String toString();      // return a string representation of the stack    
}