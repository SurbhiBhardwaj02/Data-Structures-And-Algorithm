public class CircularQueue {
    public static void main(String[] args) {
        Cqueue obj=new Cqueue(3);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        //obj.display();
        System.out.println("dequeue");
        obj.dequeue();
        System.out.println("--");
        //obj.display();
        obj.enqueue(40);
        //obj.display();
        //obj.dequeue();
        //obj.dequeue();
        //obj.dequeue();
        obj.display();
    }
}
class Cqueue
{
    int front;
    int rear;
    int arr[];
    int size;
    Cqueue(int size)
    {
        front=rear=-1;
        this.size=size;
        arr=new int[size];
    }
    public boolean IsEmpty()
    {
        if(front==-1)
            return true;
        else
            return false;
    }
    public boolean IsFull()
    {
        if(rear+1==front)
            return true;
        else if(front==0 && rear+1==size)
            return true;
        else
            return false;
    }
    public void enqueue(int value)
    {
        if(IsFull())
            System.out.println("Overflow");
        else if (IsEmpty())
        {
            front++;
            rear++;
            arr[rear]=value;
        }
        else {
            if(rear+1==size)
                rear=0;

            else
                rear++;
            arr[rear]=value;
        }
    }
    public void dequeue()
    {
        if(IsEmpty())
            System.out.println("Empty queue");
        else {
            System.out.println(arr[front]);
            arr[front]=0;
            if(front==rear)
            {
                front=rear=-1;
            }
            else if(front+1==size)
            {
                front = 0;
            }
            else
            {
                front++;
            }
        }
    }
    public void display()
    {
        //int temp=front;
        for (int i=0;i<size;i++)
            System.out.println(arr[i]);

    }

}
