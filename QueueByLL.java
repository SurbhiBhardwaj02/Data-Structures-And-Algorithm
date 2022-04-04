public class QueueByLL {
    public static void main(String[] args) {
        Queue1 obj=new Queue1();
        obj.enqueue(10);
        obj.enqueue(23);
        obj.enqueue(34);
        obj.display();
        obj.dequeue();
        System.out.println();
        obj.display();

    }
}
class Queue1
{
    Node front;
    Node rear;
    public void enqueue(int data)
    {
        Node newnode=new Node(data);
        if(front==null||rear==null)
        {
            front=rear=newnode;
            System.out.println("Inserted");
        }
        else
        {
            rear.next=newnode;
            rear=newnode;
            //or rear=rear.next
            System.out.println("Inserted");


        }

    }
    public void dequeue()
    {
        if(front==null)
            System.out.println("underflow");
        else
        {
            System.out.println(front.data);
            front=front.next;
        }
    }
    public void display(){
        Node temp;
        if(front==null)
        {
            System.out.println("Empty queue");
        }
        else {
            temp=front;
            while (temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

    }
}
