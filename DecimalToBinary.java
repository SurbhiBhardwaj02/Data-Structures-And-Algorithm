import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        DecimalToBinary obj=new DecimalToBinary();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s= "";
        System.out.print(obj.decimalToBinary(n,s));
    }
    public int decimalToBinary(int n,String s)
    {
        if(n==0)
            return Integer.parseInt(s);
        s=Integer.toString(n%2)+s;
        return decimalToBinary(n / 2,s);
    }
}
