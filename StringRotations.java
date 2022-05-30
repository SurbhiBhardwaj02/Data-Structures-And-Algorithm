//A Program to check if strings are rotations of each other or not

import java.util.Scanner;

public class StringRotations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=new String();
        String str2=new String();
        str1= sc.next();
        str2 =sc.next();
        if(check(str1, str2))
            System.out.println("Strings are rotation of each other");
        else
            System.out.println("Strings are not rotation of each other");
    }
    public static boolean check(String s1,String s2)
    {
        return s1.length()==s2.length() && ((s1+s1).indexOf(s2)!=-1);

    }
}
