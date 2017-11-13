// The test driver for the NumberQueue ADT implementations
// Xiwei Wang

public class TestNumberQueue 
{
    public static void main(String[] args)
    {
        try
        {
            NumberQueue myq1 = new ArrayNumberQueue(5);
            myq1.enqueue(100);
            myq1.enqueue(50);
            myq1.enqueue(75);
            myq1.enqueue(23);
            myq1.enqueue(19);

            System.out.println(myq1);
            System.out.println("Is the queue empty? " + myq1.isEmpty());
            System.out.println("Is the queue full? " + myq1.isFull());
            System.out.println("dequeue() returns " + myq1.dequeue());
            System.out.println("size() returns " + myq1.size());
            
            myq1.dequeue();
            myq1.dequeue();
            myq1.enqueue(3);
            
            System.out.println(myq1);
            
            myq1.dequeue();
            myq1.dequeue();
            myq1.dequeue();
            myq1.dequeue(); 

        }
        catch (RuntimeException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
