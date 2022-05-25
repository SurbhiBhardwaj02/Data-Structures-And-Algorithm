import java.util.Scanner;

public class RecursiveSumArr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println(sum(arr, arr.length ));

    }
    public static int sum(int arr[],int n)
    {
       if(n<=0)
           return 0;
       return sum(arr,n-1)+arr[n-1];
    }
}
/*
Write a recursive method for computing the sum of all the elements of an array.
Start with an algorithm in English, then translate this algorithm into code.
Trace your method on the example of the following array with 3 elements: 2, 0, and 1.

 */
