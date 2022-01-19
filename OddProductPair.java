import java.util.Scanner;

public class OddProductPair {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();

        System.out.println("Pairs of elements having odd product");
        for (int i = 0; i < n; i++)
        {
            for(int j=0;j<n;j++)
            {
                if((arr[i]*arr[j])%2!=0 && i!=j)
                    System.out.println(arr[i]+","+arr[j]);

            }

        }
    }
}
