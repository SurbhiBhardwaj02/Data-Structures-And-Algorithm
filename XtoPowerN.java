import java.util.Scanner;

public class XtoPowerN {
    public static int power(int x,int n){
        if(n==0) return 1;
        return x*power(x,n-1);//head recursion

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println(power(sc.nextInt(),sc.nextInt()));
    }
}
