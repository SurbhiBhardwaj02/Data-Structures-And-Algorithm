public class CharToLL {
    public static void main(String[] args) {
        //String str="neeraj";
        String str="jareen";
        char ch;
        SampleLinkedList obj=new SampleLinkedList();
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            obj.insert(ch);
        }
        obj.display();
    }
}
class SampleLinkedList
{
    class Node
    {
        char data;
        Node next;
        Node(char data)
        {
            this.data=data;
        }
    }
    Node head;
    public void insert(char ch)
    {
        Node newnode=new Node(ch);
        if(head==null)
        {
            head=newnode;
            //System.out.println("i");
        }
        else
        {
            newnode.next=head;
            head=newnode;
            newnode.data= ch;
            //System.out.println("Inserted");
        }
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("Empty list");
        }
        else
        {
            Node temp=head;
            while (temp!=null)
            {
                System.out.print(temp.data);
                temp=temp.next;
                if(temp!=null)
                    System.out.print("->");
            }
        }
    }
}
