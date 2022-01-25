import java.util.Scanner;

public class StrToInt {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(printInt(str));
    }
    public static int printInt(String s){
        if(s.length()==1)
            return (s.charAt(0)-'0');

        double b=printInt(s.substring(1));
        double a=s.charAt(0)-'0';

        a=a*Math.pow(10,s.length()-1)+b;

        return (int)(a);

    }
}
