public class PalindromePt2 {
    public static void main(String[] args) {
      Stackbylist obj=new Stackbylist();
      obj.push(1);
      obj.push(2);
      obj.push(3);
      obj.push(3);
      obj.push(2);
      obj.push(1);
      obj.print();
        System.out.println(obj.palindromeCheck());
    }
}
class Stackbylist
{
    Node top;
    String str="";
    String str1="";
    public boolean isEmpty()
    {
        return top==null;
    }
    public int push(int data)
    {
        Node newnode=new Node(data);
        newnode.next=top;
        top=newnode;
        newnode.data=data;

        return 1;
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
            //System.out.println(temp.data);
            str=str+temp.data;
            str1=temp.data+str1;
            temp = temp.next;
        }
        System.out.println(str);
        System.out.println(str1);
    }
    public boolean palindromeCheck()
    {
        boolean ispalin=true;
        for (int i = 0; i < str1.length(); i++) {
            if(str1.charAt(i)!=str.charAt(i)){
                ispalin=false;
                break;
            }
        }
        return ispalin;
    }
}
