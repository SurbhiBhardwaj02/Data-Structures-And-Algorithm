import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++)
            arr[i]= sc.nextInt();
        System.out.println(sum(arr,n));

    }
    public static int sum(int arr[], int n){
        if(n>0)
        {
            return sum(arr,n-1)+arr[n-1];
        }
        return 0;
    }
}
