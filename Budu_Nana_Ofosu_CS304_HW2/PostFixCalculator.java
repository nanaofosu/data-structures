// The PostFixCalculator class that implements a postfix expression calculator
// Your name here

import java.util.Scanner;

public class PostFixCalculator 
{
    // instance variable
    String m_postfix;
    
    // constructor
    public PostFixCalculator()
    {
        m_postfix = "";
    }
    
    // mutator
    public void setPostfix(String postfix)
    {
        m_postfix = postfix;
    }
    
    // evaluate the postfix expression saved in m_postfix
    public int calculate()
    {
        Scanner tokenizer; 
        int result = -1; // This is only an initial value. You will need to update it to the correct value.
        int operand1, operand2, value;
        String operator;
        
        
        NumberStack myStack = new ArrayNumberStack(100);

        tokenizer = new Scanner(m_postfix);
        
       /*
        * first we need to read the tokenizer item by item. Thats the first problem.
        * foreach item in tokenizer,
        * 	if item is an int, we want to push it.
        * 	else if item is operator, we wasnt to perform an operation and push the result back in the stack
        * 		so pop twice and evaluate eg. operand1 - operand2
        * 		push the result back onto the stack.
        *	On to the next one 		
        * 	
        * */

        // TODO: complete this method
        while (tokenizer.hasNext()) {  // keep looping until there are no more tokens 
            //check for integer
        		if(tokenizer.hasNextInt()) { // if the token is an integer, push it onto the stack
        			myStack.push(tokenizer.nextInt()); 
        		}
        		else {	// otherwise if it is not an integer we consider it an operator
        			operator = tokenizer.next();		//set it as the operator
        			
        			if(myStack.size() < 2) {		//check if the stack has at least two operands before we start popping things of the stack.
        				throw new RuntimeException("Not enough operands");	// if not we throw an exception
        			}
        			
        			//assuming we have enough operands to evaluate an operation...
        			operand2 = myStack.pop();
        			operand1 = myStack.pop();	
                
               
                // check which operator it is and do the correct operation
        			switch(operator) {
            		case "-" :
	            			result = operand1 - operand2;
	                break; 
	            		case "+" :
	            			result = operand1 + operand2;
	                break; 
	            		case "*" :
	            			result = operand1 * operand2;
	                break; 
	            		case "/" :
	            			result = operand1 / operand2;
	                break; 
	                default:		//if none of these. Throw a child please exception
	                  throw new RuntimeException("Unrecognized operator: " + operator);
	            }
        			// push the result back onto the stack
        			myStack.push(result);
        		}
        		
        }
//        AFTER the loop is done...
        // We need to check if there are more than one value in the stack. 
        if(myStack.size() > 1) {		//If there are,...Child please!
        		throw new RuntimeException("Too many operands");
        }
        else  {
        	return myStack.pop();
		}
        

            
    }    
}
