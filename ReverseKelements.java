public class ReverseKelements {
    public static void main(String[] args) {
        RevQueue obj=new RevQueue(5);
        obj.enqueue(1);
        obj.enqueue(2);
        obj.enqueue(3);
        obj.enqueue(4);
        obj.enqueue(5);
        obj.display();
        System.out.println();
        obj.reverseFromK(4);
        //obj.dequeue(3);
    }
}
class RevQueue
{
    int front;
    int rear;
    int arr[];
    RevQueue(int size)
    {
        arr=new int[size];
        front=rear=-1;
    }
    public boolean IsEmpty()
    {
        return front ==-1;
    }
    public boolean Isfull()
    {
        return rear== arr.length-1;
    }
    public void enqueue(int data)
    {
        if(IsEmpty())
        {
            front++;
            rear++;
            arr[front]=data;
        }
        else if(Isfull())
            System.out.println("Overflow");
        else
        {
            rear++;
            arr[rear]=data;
        }
    }
    public void reverseFromK(int k)
    {
        if (IsEmpty())
        {
            System.out.println("empty");
        }
        else {
            for (int i = k-1; i >= 0; i--) {
                System.out.print(arr[i]+" ");
            }
            for (int i = k; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public void display()
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
