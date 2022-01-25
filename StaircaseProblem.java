import java.util.Scanner;

public class StaircaseProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(possiblity(n));
    }
    public static int possiblity(int s)
    {
        if(s==0)
            return 1;
        else if(s<0)
            return 0;
        else
            return possiblity(s-3) + possiblity(s-2) + possiblity(s-1);
    }
}
