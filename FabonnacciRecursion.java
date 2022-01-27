import java.util.Scanner;

public class FabonnacciRecursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        FabonnacciRecursion obj=new FabonnacciRecursion();
        for (int i = 0; i < n ; i++)
            System.out.print(obj.series(i)+" ");
    }
    public int series(int n)
    {
        if(n==1||n==0)
            return n;
        int m= series(n-1)+series(n-2);
        return m;

    }
}
