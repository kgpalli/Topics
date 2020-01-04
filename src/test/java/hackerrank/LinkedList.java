package hackerrank;



//  // Day 15 -  Linked List - it's a data structure
public class LinkedList {

   /* // properties
    Node head;
    int count;
    public LinkedList()
    {
        head = null;
        count = 0;

    }
    public LinkedList(Node newHead)
    {
        head = newHead;
        count = 1;

    }

// Methods

    // add

    public void add (int newData)
    {
        Node temp = new Node(newData);

        Node current = head;  // make sure current value is not null, it means head is not null
        while(current.getNext()!=null)  // if there are 6 cars in a trains , it iterates till 6 th one
        {
            current = current.getNext();
        }
        current.setNext(temp); // after 6th car , if it's empty, it will set temp
        count++;
    }
*/

    //get


   /* public int get(int index)
    {
        if (index<=0)
        {
            return -1;
        }

        Node current = head;
        for(int i=1;i<index;i++)
        {
            current = current.getNext();
        }
        return current.getData();
    }

    //isEmpty

   //size


    //remove
*/



  // TelsukoLearnings


Node head;


public void insert(int data)
{
    Node node = new Node();
    node.data = data;
    node.next = null;

    if(head == null)
    {
        head=node;
    }else
    {
        Node n = head;
        while(n.next != null)
        {
            n=n.next;
        }
        n.next=node;
    }
}


     public void show()
     {
         Node node = head;


         while(node.next != null)
         {
             System.out.println(node.data);
             node = node.next;
         }

         System.out.println(node);
     }
}
