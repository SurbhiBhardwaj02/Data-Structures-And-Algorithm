import java.util.Scanner;

public class PermutationRecursively {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        ans(str," ");
    }
    public static void ans(String inp,String ans)
    {
        if(inp.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < inp.length(); i++)
        {
            String remainingString=inp.substring(0,i)+ inp.substring((i+1));
            char extract=inp.charAt(i);
            ans(remainingString,ans+extract);

        }
    }
}
