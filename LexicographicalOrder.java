import java.util.Scanner;

public class LexicographicalOrder {
    public static int Lexico(int end, int i,int initial){
        if(i<=end )
        {
            System.out.print(i+" , ");
            i=i*10+initial;
        }
        else
        {
            i = (i - initial) / 10;
            while (i >= 1)
            {
                if (i * 10 + initial < end)
                {
                    for (int j = 1; j <= 9; j++)
                    {
                        System.out.print((i * 10 + j) + " , ");
                    }
                    return 1;
                } else {
                    i = (i - initial) / 10;
                }
            }
        }
        return Lexico(end,i,0);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        System.out.print(0+" , ");
        for (int i = 1; i <=9 ; i++) {
            Lexico(a,i,0);
            System.out.println();
        }
    }
    /*public static void main(String[] args) {

        int end=100;
        System.out.println(lexica(0,100));
    }
    public static int lexica(int initial,int end)
    {
        if(initial>end)
            return 1;
        System.out.println(initial);
        int i=0;
        if(initial==0)
            i=1;
        while (i<10)
        {
            lexica(initial*10+1,end);
            i++;
        }
        //System.out.println(initial);
        return initial;
    }*/
}
