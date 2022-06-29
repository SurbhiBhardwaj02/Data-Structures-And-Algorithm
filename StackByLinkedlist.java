import java.util.InputMismatchException;
import java.util.Scanner;
 // create node class for ddl
// make all the variable of the node class private;
//create getter and setter
//create one package with name nodes
//create node class

//create package with name stackbyllandarray
//create two classes in it
//stackbylinkedlist
//stackbyarray
//you want to implement the concept of stack by linked list or by array

//for operation which you want to perform ,create menu driven
//try to include concept of exception handling(custom or predefined)
public class StackByLinkedlist {
    //concept of nesting and containership
    Node top;
    class Node {
        char data;
        Node next;
        Node(char data)
        {
            //Scanner sc=new Scanner(System.in);
            this.data=data;
            next=null;
        }
    }

    public StackByLinkedlist()
    {
        top=null;
    }
    //isfull() no need to define
    //isEmpty()
    public boolean isEmpty()
    {
        /*if(top==null)
            return true;
        else
            return false;*/
        return top==null;
    }
    public int push(char data)
    {
        Node newnode=new Node(data);
        newnode.next=top;
        top=newnode;
        newnode.data=data;

        return 1;
        /*if(isEmpty())
            top=newnode;
        else
        {
            newnode.next=top;
            top=newnode;
        }*/
    }
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Empty");
            return 0;
        }
        else
        {
            int ans= top.data;
            top=top.next;
            return ans;
        }
    }
    public void print()
    {
        if(isEmpty())
            return;
        Node temp=top;
        while (!this.isEmpty()&& temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public void peek()
    {
        System.out.println(top.data);
    }

    public static void main(String[] args) {
        StackByLinkedlist obj= new StackByLinkedlist();
        String str="neeraj";
        for (int i = 0; i < str.length(); i++) {
            obj.push(str.charAt(i));
        }
        /*obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        obj.print();
        //obj.peek();
        System.out.println(obj.pop());*/
        obj.print();
    }
}
