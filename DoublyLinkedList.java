import java.util.Scanner;


class DDl
{
    Node head;
    public void insertAtBegin(Node newnode)
    {
        if(head==null)
            head=newnode;
        else{
            newnode.next=head;
            head.previous=newnode;
            head=newnode;
        }
    }
    public void insertAtlast(Node newnode)
    {
        if(head==null)
            head=newnode;
        else
        {
            Node temp=head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.previous=temp;
        }
    }
    public void insertAtPosition(int pos,Node newnode) {
        if (head == null)
            head = newnode;
        if (pos == 0) {
            insertAtBegin(newnode);
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        newnode.previous = temp;
        newnode.next.previous = newnode;
    }
    public void deletefrombeginning()
    {
        if(head==null)
            System.out.println("Empty linked list");
        head=head.next;
        head.previous=null;
    }
    public void deletefromlast(){
        if(head.equals(null))
            System.out.println("Empty Linked list");
        else {
            Node temp = head;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.previous.next=null;
        }
    }
    public void deleteAtPos(int pos)
    {
        if(head==null)
            System.out.println("Empty linked list");
        else
        {
            Node temp=head;
            for (int i = 0; temp!=null&&i < pos-1; i++) {
                temp=temp.next;
            }

                temp.previous.next=temp.next;
                temp.next.previous=temp.previous;
        }
    }
    public void display()
    {
        if(head==null)
            System.out.println("Empty Linked List");
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;

            }
        }
    }
    public  void reverseDisplay()
    {
        if(head==null)
            System.out.println("Empty Linked List");
        else
        {
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;}
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.previous;
            }
        }
    }
}

public class DoublyLinkedList
{
    public static void main(String[] args) {
        DDl obj1 = new DDl();

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
        System.out.println("8.Reverse Traverse");

        while (x == 1) {
            System.out.println("Enter your Choice:");

            i = s.nextInt();
            switch (i) {
                case 1:
                    obj1.insertAtBegin(new Node(10));
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 2:
                    obj1.insertAtlast(new Node(20));
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 3:
                    obj1.insertAtPosition( 1,new Node(30));
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 4:
                    obj1.deletefrombeginning();
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 5:
                    obj1.deletefromlast();
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 6:
                    obj1.deleteAtPos(2);
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 7:
                    obj1.display();
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;
                case 8:
                    obj1.reverseDisplay();
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
                    break;

                default:
                    System.out.println("Incorrect choice");
                    System.out.println("Press 1 to continue ,Press 0 for Exit:");
                    x = s.nextInt();
            }

        }
    }}
