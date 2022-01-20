import java.util.ArrayList;
import java.util.Scanner;

public class MrRaman {

    public static void main(String[] args) {
        int b=1;
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer> myarr1=new ArrayList<>();
        ArrayList<Integer> myarr2=new ArrayList<>();

        System.out.println("Enter elements of myaarr1");
        for (int i = 0; i <n; i++) {
            myarr1.add(sc.nextInt());
        }
        System.out.println("Enter elements of myaarr2");
        for (int i = 0; i < m; i++) {
            myarr2.add(sc.nextInt());
        }

        for (int i = 0; i < n; i++) {
            int a=0;
            for(int j=0;j<n;j++)
            {
                if(myarr1.get(i)<=myarr2.get(j))
                    a++;
            }
            System.out.print(a);
            if(b<n)
            {
                System.out.print(",");
                b++;
            }


        }
    }
}
