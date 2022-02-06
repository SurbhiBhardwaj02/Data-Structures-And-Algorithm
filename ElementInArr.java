import java.util.Scanner;

public class ElementInArr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int ele=sc.nextInt();
        System.out.println(search(ele, arr,0));
    }
    public static boolean search(int n,int arr[],int i)
    {
        if(i>= arr.length)
            return false;
        if(arr[i]==n)
            return true;
        else
            return search(n,arr,i+1);
    }
}
