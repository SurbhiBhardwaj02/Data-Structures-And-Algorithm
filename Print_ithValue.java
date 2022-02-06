import java.util.Scanner;

class SinglyLList
{
    Node head;
    public void insert(Node newnode)
    {
        if(head==null)
            head=newnode;
        else
        {
            newnode.next=head;
            head=newnode;
        }
    }
    public int length()
    {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        return count;
    }
    public void print(int n)
    {
        if(head==null)
            System.out.println("empty list");
        // reversing the list
        Node current=head;
        Node previous=null;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
        Node sec=head;

        for (int i = 0; i < n; i++)
        {
            sec=sec.next;
        }
        System.out.println(sec.data);

    }
}

public class Print_ithValue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of test cases:");
        int t=sc.nextInt();

        for(int i = 0; i < t ; i++)
        {
            System.out.println("Enter elements of linked list");
            int data= sc.nextInt();
            SinglyLList obj=new SinglyLList();
            while(data!=-1)
            {
                obj.insert(new Node(data));
                data=sc.nextInt();
            }

            int pos= sc.nextInt();
            if(pos< obj.length()){
            obj.print(pos);
            }
        }
    }
}
