public class PriorityQueue {
    public static void main(String[] args) {
        Pqueue obj=new Pqueue();
        obj.enqueue(new Node(10,2));
        obj.enqueue(new Node(20,1));
        obj.enqueue(new Node(30,6));
        obj.enqueue(new Node(45,3));
        obj.display();

    }
}
class Pqueue
{
    Node front;
    Node rear;
    public void enqueue(Node newnode)
    {
        if(front==null||newnode.priority<front.priority)
        {
            newnode.next=front;
            front=newnode;
        }
        else{
            Node temp=front;

            while (temp.next!=null&& temp.next.priority<=newnode.priority)
            {
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    public void display()
    {
        Node temp=front;
        while (temp!=null) {
            System.out.println(temp.data + " " + temp.priority);
            temp=temp.next;
        }
    }
}
