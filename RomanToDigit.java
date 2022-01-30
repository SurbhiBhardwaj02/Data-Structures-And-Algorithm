//Converting Roman Numerals to Decimal lying between 1 to 3999

/*Input: IX
  Output: 9
  IX is a Roman symbol which represents 9

  Input: MCMIV
  Output: 1904
  M is a thousand,
  CM is nine hundred and
  IV is four*/
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        String str1= sc.next();
        System.out.println(convert(str));
        System.out.println(shortCheck(str1));
    }

    static int value(char ch)
    {
        if(ch=='I')
            return 1;
        if(ch=='V')
            return 5;
        if(ch=='X')
            return 10;
        if(ch=='L')
            return 50;
        if(ch=='C')
            return 100;
        if(ch=='D')
            return 500;
        if(ch=='M')
            return 1000;
        return -1;
    }

    public static int convert(String s)
    {
        int res=0;
        for (int i = 0; i < s.length(); i++)
        {
            int s1=value(s.charAt(i));
            if(i+1<s.length())
            {
                int s2=value(s.charAt(i+1));
                if(s1>=s2)
                    res=res+s1;
                else {
                    res = res + s2 - s1;
                    i++;
                }
            }
            else
            {
                res=res+s1;
            }
        }
        return res;
    }
    public static Map<Character,Integer> roman=new HashMap<Character,Integer>()
    {{
        put('I',1);
        put('V',5);
        put('X',10);
        put('L',50);
        put('C',100);
        put('D',500);
        put('M',1000);
    }};
    public static int shortCheck(String s)
    {
        int res=0;
        for (int i = 0; i < s.length(); i++) {
            if(i!=s.length()-1 && roman.get(s.charAt(i))<roman.get(s.charAt(i+1)))
            {
                res += roman.get(s.charAt(i+1))-roman.get(s.charAt(i));
                i++;
            }
            else
            {
                res += roman.get(s.charAt(i));

            }
        }
        return res;
    }
}
