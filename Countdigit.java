import java.util.Scanner;

public class Countdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        System.out.println(countDigits(n));
    }
    public static int countDigits(int a)
    {
        if(a!=0)
        {
            int c=countDigits(a/10);
            return ++c;
        }
        else
        {
            return 0;
        }
    }
}
