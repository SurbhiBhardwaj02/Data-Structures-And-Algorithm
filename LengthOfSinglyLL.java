import java.util.Scanner;

class SinglyLL
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

}
public class LengthOfSinglyLL {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no. of test cases:");
        int t=sc.nextInt();

        for(int i = 0; i < t ; i++)
        {
            System.out.println("Enter elements of linked list");
            int data= sc.nextInt();
            SinglyLL obj=new SinglyLL();
            while(data!=-1)
            {
                obj.insert(new Node(data));
                data= sc.nextInt();
            }
            System.out.println(obj.length());
        }
    }
}
