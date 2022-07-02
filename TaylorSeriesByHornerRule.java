/*
1 + x/1 + x^2/2*1 + x^3/3*2*1...

1+ x/1[ 1 + x/2 + x^2/3*2 ]
1+ x/1[ 1 + x/2{ 1 + x/3 }]   HORNER'S RULE
 */

public class TaylorSeriesByHornerRule {
    public static void main(String[] args) {
        System.out.println(e(1,10));
    }
    static double s=1;
    public static double e(int x,int n)
    {
        if(n==0)
            return s;
        s=1+ x * s/n;
        //System.out.println(""+"1+"+ x+"*"+s+"/"+n );   //multiplication=   O(n)
        return e(x,n-1);
    }
}
