import java.util.Scanner;
class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
    }

}
class SinglyLinkedList
{
    Node head;
    public void insertAtLast(Node newnode)
    {
        if(head ==null)
        {
            head=newnode;
            return;
        }
        Node temp=head;
        while ((temp.next!=null))
            temp = temp.next;

        temp.next=newnode;
    }
    public void insertAtBeginning(Node newnode)
    {
        if (head == null)
            head=newnode;

        else{
            newnode.next=head;
            head=newnode;
        }
    }
    public void insertAtPosition( Node newnode ,int pos)
    {
        Node temp=head;
        for (int i = 0; i < pos-1 ; i++)
            temp=temp.next;

        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void deleteFromBeginning()
    {
        if(head==null)
            System.out.println("Empty Linked List");

        else
            head=head.next;
    }
    public void deleteFromLast()
    {
       if(head==null)
           System.out.println("Empty Linked List");
       else{
           Node temp=head;
           while(temp.next.next!=null)
           {
               temp=temp.next;
           }
           temp.next=null;
       }
    }
    public void deleteAtPos(int pos)
    {
        if (head == null)
            System.out.println("Empty Linked List");

        if(pos==1)
            deleteFromBeginning();

        Node temp=head;
        for (int i = 0; i < pos-1; i++) {
            temp=temp.next;
        }
        Node head1=temp.next.next;
        temp.next=head1;
    }
    public void traverse()
    {
        Node temp=head;
        if(head==null)
            System.out.println("Empty Linked List");
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    public void display()
    {
        if(head==null)
            System.out.println("list is empty");
        else
        {
            Node temp=head;
            while (temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}

public class ttt {
    public static void main(String[] args) {
        SinglyLinkedList obj1 = new SinglyLinkedList();
        //obj1.display();

        int i;
        int x = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("1.InsertAtBeginning");
        System.out.println("2.InsertAtLast");
        System.out.println("3.InsertAtPosition");
        System.out.println("4.DeleteAtBeginning");
        System.out.println("5.DeleteAtLast");
        System.out.println("6.DeleteAtPosition");
        System.out.println("7.Traverse");

        while (x == 1) {
            System.out.println("Enter your Choice:");

            i = s.nextInt();
            switch (i) {
                case 1:
                    obj1.insertAtBeginning(new Node(10));
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 2:
                    obj1.insertAtLast(new Node(20));
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 3:
                    obj1.insertAtPosition(new Node(30), 2);
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 4:
                    obj1.deleteFromBeginning();
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 5:
                    obj1.deleteFromLast();
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 6:
                    obj1.deleteAtPos(2);
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 7:
                    obj1.traverse();
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;

                default:
                    System.out.println("Incorrect choice");
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
            }
        }

    }
}
