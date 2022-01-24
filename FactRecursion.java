import java.util.Scanner;

public class FactRecursion {

    public static int fact(int n)
    {
        if(n==1||n==0) return 1;
        int smallvalue=fact(n-1);
        return n*smallvalue;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(fact(n));
    }
}
