import java.util.Scanner;

public class RemoveConsStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        System.out.println(Remove(str));
    }
    public static String Remove(String s) {
        if (s.length() == 1)
            return s;

        if (s.charAt(0) == s.charAt(1))
            return Remove(s.substring(1));

        return s.charAt(0)+Remove(s.substring(1));
    }
}
