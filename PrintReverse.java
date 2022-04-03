import java.util.Scanner;

class SinglyList
{
    Node head;
    /*public void reverse() {
        int start=0;
        int end=length(this.head)-1;
        while (start<end) {
            Node leftSideNode=fetch(start);
            Node rightSideNode=fetch(end);
            int t=leftSideNode.data;
            leftSideNode.data=rightSideNode.data;
            rightSideNode.data=t;
            start++;
            end--; }
    }*/

    public int length(Node head)
    {
        Node temp=head;
        int c=0;
        if(head==null)
            System.out.println("Empty Linkedlist");
        else{
            while (temp!=null)
            {
                temp=temp.next;
                c++;
            }
        }
        return c;
    }
    public Node fetch(int index)
    {
        Node temp=head;
        for (int i = 0; i < index; i++) {
            temp=temp.next;
        }
        return temp;
    }
    public void insert(Node newnode)
    {
        if (head==null){
            head=newnode;
            return;}
        newnode.next=head;
        head=newnode;
    }
    public void display(){
        Node temp=head;
        if(head==null)
        {
            System.out.println("Empty list");
        }
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}
public class PrintReverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of test cases:");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++)
        {
            System.out.println("Enter the elements");
            SinglyList l1 = new SinglyList();
            int data = sc.nextInt();
            while (data != -1) {
                l1.insert(new Node(data));
                data = sc.nextInt();
            }
           // l1.reversebyrec(l1.head);
         //   l1.display();
           //l1.reverse();
           l1.display();
        }
    }
}