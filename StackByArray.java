package Stack;

public class StackByArray {
    int arr[];//declaration
    int top;
    public StackByArray(int size)
    {
        arr=new int[size];//creation
        top=-1;
    }
    public boolean isFull()
    {
        if(top == arr.length - 1)
            return true;
        else
            return false;
    }
    public boolean isEmpty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    public void push(int value)
    {
        if (isFull())
            System.out.println("Stackoverflow");
        else
        {
            //arr[top+1]=value;
            top+=1;
            arr[top]=value;
            System.out.println("Value Inserted");
        }
    }
    public void pop()
    {
        if(isEmpty())
            System.out.println("Stack Underflow");
        else
        {
            System.out.println(arr[top]);
            arr[top]=0;
            top-=1;
        }
    }
    public int peek()
    {
        return arr[top];
    }
    public void deleteCompleteStack()
    {
        while(!this.isEmpty())
        {
            this.pop();
        }
    }
    public void print()
    {
        if(isEmpty())
            return;
        while (!this.isEmpty()) {
            System.out.println(arr[top]);
            top = top - 1;
        }
    }

    public static void main(String[] args) {
        StackByArray obj=new StackByArray(5);
        obj.push(2);
        obj.push(7);
        obj.push(9);
        obj.push(8);
        obj.push(4);
        System.out.println(obj.peek());
        //obj.isEmpty();
        //obj.isFull();
        obj.pop();
        //obj.print();
        System.out.println(obj.peek());
        obj.print();


    }
}
