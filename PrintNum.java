public class PrintNum {
    public int print(int a,int b){
        if(b<=a)
        {
            System.out.print(b+" ");
            return print(a,++b);
        }
        return 1;
    }

    public static void main(String[] args) {
        int x=6;
        int y=1;
        PrintNum obj=new PrintNum();
        obj.print(x,y);

    }
}
