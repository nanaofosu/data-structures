// The SortedPersonList class
// Nana Ofosu Budu

public class SortedPersonList
{
    // instance variables
    private PersonNode m_first;
    private int m_numElements;

    // constructor
    // Do not make any changes to this method!
    public SortedPersonList()
    {
        m_first = null;
        m_numElements = 0;
    }

    // check whether the list is empty
    // Do not make any changes to this method!
    boolean isEmpty()
    {
        if (m_first == null)
            return true;
        else
            return false;
    }

    // return the size of the list (# of Person nodes)
    // Do not make any changes to this method!
    public int size()
    {
        return m_numElements;
    }

    // check whether a PersonNode associated with the given ID is in the list
    public boolean contains(int ID)
    {
        PersonNode checker = m_first; // the checker is to be used to traverse the list

        while(checker != null){     //while the checker's value is not null
            if(checker.getID() == ID){      // check the ID of the of the checker (current node) to see if it equals ID paramerter
                return true;    //if so return true
            }
            else{
               checker = checker.getLink();     //esle move to the next node
            }
        }
        return false;   // return false if we ever get to this line of code.
    }

    // search for and return the PersonNode associated with the given ID
    public PersonNode get(int ID)
    {
        PersonNode checker = m_first;   // the checker is to be used to traverse the list
        while(checker != null){         //while the checker's value is not null
            if(checker.getID() == ID){  //if so return true
                return checker;         // return the node with that ID
          }
            else{
               checker = checker.getLink();     //else go on to the next node
            }

        }
        return null; // replace this statement with your own return
    }

    // add a new PersonNode to the list with the given ID and name
    public boolean add(int ID, String name)
    {
        PersonNode newNode = new PersonNode(ID, name); //create a newNode
        PersonNode current = m_first;       // set up a temporary reference to iterate over the list
        PersonNode previous = null;         // set up a reference that allows the access to the previous node

        while(current != null){         //while current is not null

            if(current.getID() < ID){   //check if the current node's ID is less than the ID we are going to add
                previous = current;     //if it is, set previous to current
                current = current.getLink();    //set current to the next node and keep going forward
            }
            else if(current.getID() == ID){     // if the current ID is equal to one that already exists the returm false. It is not unique
                return false;
                }
            else{
                break;      //One the current ID is not less that than the ID we want to add, break and move on to the next line of code
            }
        }
        if(previous == null){
            newNode.setLink(m_first);
            m_first = newNode;
            m_numElements++;
            return true;
        }

        else{
            newNode.setLink(current);
            previous.setLink(newNode);
            m_numElements++;
            return true;
        }
    }

    // remove a PersonNode associated with the given ID from the list
    public boolean remove(int ID)
    {
        // TODO: implement this method
        PersonNode current = m_first;       // set up a temporary reference to iterate over the list
        PersonNode previous = null;         // set up a reference that allows the access to the previous node
        boolean found = false;

        while (current != null)
        {
            // compare the given value with the value of each node
            if (current.getID() < ID)
            {
                previous = current;
                current = current.getLink();
            }
            else if (current.getID() == ID)
            {
                found = true;
                m_numElements--;
                current = current.getLink();

                if (previous == null){
                  m_first = current;
                }

                else{
                  previous.setLink(current);
                }

            }
            else{
              return found;
            }

        }

        return found;

    }

    // return a string representation of the list
    // Do not make any changes to this method!
    public String toString()
    {
        String listContent = "";
        PersonNode current = m_first;

        while (current != null)
        {
            listContent += "[" + current.getID() + " | " + current.getName() + "] ";
            current = current.getLink();
        }

        return listContent;
    }
}
