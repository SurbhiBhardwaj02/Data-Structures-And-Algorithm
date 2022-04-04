import java.util.Scanner;

public class RearrangeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrange(arr);
    }
    public static void rearrange(int A[])
    {
        int m=0;
        int arr2[]=new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2==0) {
                arr2[m]=A[i];
                m++;
            }
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2!=0 )//&& m< arr2.length)
            {
                arr2[m]=A[i];
                m++;
            }
        }
        for (int i = 0; i < arr2.length ; i++) {
            System.out.println(arr2[i]);
        }
    }
}
/*
Print an array that contains the exact same number as the given array, but rearrange so that all the even numbers come
before all the odd numbers.
Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

Rearrange ([3,3,2]) -> [2,3,3]
Rearrange(0,1,0,1,1,]) -> [0,0,1,1,1]
 */
