public class StepNumber {
    public static void main(String[] args) {
        QueuebyLinkedlist obj=new QueuebyLinkedlist();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
            //System.out.println(check(args[i]));
            check(args[i]);
            obj.enqueue(args[i]);
        }
    }
    public static boolean check(String s)
    {
        String str="";
        boolean res=true;
        for (int i = 0; i < s.length()-1; i++) {
            int a= s.charAt(i)-s.charAt(i+1);
            if(a==1 || a==-1)
                str=str+"true";
            else
                str=str+"false";
        }
        if (str.contains("false"))
            res= false;
        return res;
    }
}
class QueuebyLinkedlist
{
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
        }
    }
    Node front;
    Node rear;

    public void enqueue(String data) {
        Node n1=new Node(data);

        if (front==null&& rear==null) {
            front = rear = n1;
            System.out.println("Inserted");
        }
        else
        {
            rear.next=n1;
            rear=n1;
            System.out.println("Inserted");
        }
    }
}
