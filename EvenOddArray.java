import java.util.ArrayList;
import java.util.Scanner;

public class EvenOddArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n=sc.nextInt();

        int[][] arr=new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for(int j=0;j<n;j++)
                arr[i][j]= sc.nextInt();
        }
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd= new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 == 0)
                    even.add(arr[i][j]);
                else
                    odd.add(arr[i][j]);
            }
        }
            System.out.println(even);
            System.out.println(odd);
    }
}

