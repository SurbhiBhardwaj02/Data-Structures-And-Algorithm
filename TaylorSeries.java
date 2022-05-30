
/*
1+ x/1! + x^2/2! + x^3/3! ...
    TAYLOR SERIES
 */
public class TaylorSeries {
    public static void main(String[] args) {
        System.out.println(e(3,2));

    }
    static double p=1,f=1;
    public static double e(int x, int n)
    {
        if(n==0) {
            return 1;
        }
        double s= e(x,n-1);
        p=p*x;
        f=f*n;
        //System.out.println(""+s+" + "+p+"/"+f);  //multiplication= n(n+1)  O(n^2)
        return s+p/f;
    }
}
