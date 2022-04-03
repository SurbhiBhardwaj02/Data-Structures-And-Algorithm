public class QueueByArray {
    public static void main(String[] args) {
        ArrQueue obj=new ArrQueue(5);
        obj.enqueue(12);
        obj.enqueue(21);
        obj.enqueue(14);
        obj.enqueue(15);
        obj.enqueue(16);
        obj.dequeue();
        obj.dequeue();
        obj.display();
    }
}
class ArrQueue
{
    int arr[];
    int front;
    int rear;
    public ArrQueue(int size)
    {
        arr=new int[size];
        front=rear=-1;
    }
    public boolean IsEmpty()
    {
        return (front==-1);
    }
    public boolean IsFull()
    {
        return (rear== arr.length-1);
    }
    public void enqueue(int value)
    {
        if(IsFull())
            System.out.println("Overflow");
        else if(IsEmpty())
        {
            front++;
            rear++;
            arr[rear]=value;
            System.out.println("inserted");
        }
        else
        {
            rear++;
            arr[rear]=value;
            System.out.println("inserted");
        }
    }
    public void dequeue() {
        if (IsEmpty())
            System.out.println("Empty list");
        else {
            //System.out.println(arr[front]);
            arr[front] = 0;
            front++;
        }
    }
    public void display()
    {
        if(IsEmpty())
            System.out.println("empty queue");
        else
        {
            int temp=front;
            while (temp<=rear)
            {
                System.out.println(arr[temp]);
                temp++;
            }
        }
    }
}

