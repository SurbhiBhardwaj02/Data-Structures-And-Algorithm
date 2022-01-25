import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        char ch1=sc.next().charAt(0);
        char ch2=sc.next().charAt(0);
        System.out.println(Occur(str,ch1,ch2));
    }
    public  static String Occur(String s, char a,char b){
        if(s.length()==0)
            return s;

        if(s.charAt(0)==a)
            s= b+s.substring(1);

        return s.charAt(0)+Occur(s.substring(1),a,b);
    }

}
