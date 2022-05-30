//Check if a string can be obtained by rotating another string 2 places
/*input: string1 = “amazon”, string2 = “azonam”
Output: Yes
rotated anti-clockwise
Input: string1 = “amazon”, string2 = “onamaz”
Output: Yes
rotated clockwise*/

import java.util.Scanner;

public class StringRotationAdv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1= sc.next();
        String str2=sc.next();
        System.out.println(check(str1,str2) ? "Yes" : "No");
    }
    public static boolean check(String s1,String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        if(s1.length()<2)
            return s1.equals(s2);

        int len =s2.length();
        String antic="";
        String clockw="";

        // anticlockwise
        antic= antic + s2.substring(len-2,len) + s2.substring(0,len-2);

        clockw= clockw + s2.substring(2) + s2.substring(0,2);

        return (s1.equals(antic)) || (s1.equals(clockw));
    }
}
