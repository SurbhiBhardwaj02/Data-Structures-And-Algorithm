import java.util.Scanner;

public class MrBean {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int fact=1;
        for (int i = n; i >0; i--)
            fact=fact*i;
        System.out.println("Factorial:"+fact);

        String num=Integer.toString(fact);
        int k=0;
        for (int i = 0; i < num.length(); i++)
        {
            if(num.charAt(i)=='0')
                k++;
        }
        System.out.println("number of zeroes in factorial n is "+k);
    }
}
