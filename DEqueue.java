class DEqueue1 {
    int arr[];
    int front;
    int rear;
    DEqueue1(int size)
    {
        arr=new int[size];
        front=rear=-1;
    }
    public boolean IsEmpty()
    {
        return rear==-1 && front==-1;
    }
    public boolean Isfullrear()
    {
        if(rear==arr.length-1)
            return true;
        else
            return false;
    }
    public boolean Isfullfront()
    {
        if (front==0)
            return true;
        else
            return false;
    }
    public void insertrear(int data)
    {
        if(Isfullrear())
            System.out.println("Overflow");
        else
        {
            if(front==-1 && rear==-1)
            {
                ++rear;
                ++front;
                arr[rear]=data;
            }
            else
            {
                rear++;
                arr[rear]=data;
            }
        }
    }
    public void insertFront(int data)
    {
        if(Isfullfront())
        {
            System.out.println("Overflow");
        }
        else
        {
            if(front==-1 && rear==-1)
            {
                ++rear;
                ++front;
                arr[front]=data;
            }
            else
            {
                front--;
                arr[front]=data;
            }
        }
    }
    public void removeRear()
    {
        if(IsEmpty())
            System.out.println("Empty Queue");
        else
        {
            if(front==rear)
            {
                System.out.println(arr[rear]);
                rear=front=-1;
            }
            else
            {
                System.out.println(arr[rear]);
                rear--;
            }
        }
    }
    public void removeFront()
    {
        if (IsEmpty())
            System.out.println("Empty queue");
        else
        {
            if (front==rear)
            {
                System.out.println(arr[front]);
                front = rear = -1;
            }
            else
            {
                System.out.println(arr[front]);
                front++;
            }
        }
    }
    public void display()
    {
        for (int i = front; i < rear; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class DEqueue
{
    public static void main(String[] args) {
        DEqueue1 obj=new DEqueue1(5);

        obj.insertFront(10);
        obj.insertrear(20);
        obj.insertrear(30);
        obj.insertrear(40);
        obj.insertrear(50);
        System.out.println("print all the data ");
        obj.display();
        System.out.println("delete from front");
        obj.removeFront();
        obj.removeFront();
        System.out.println("delete from rear");
        obj.removeRear();
        System.out.println("insert new value at rear ");
        obj.insertrear(90);
        System.out.println("print the data");
        obj.display();

    }
}
