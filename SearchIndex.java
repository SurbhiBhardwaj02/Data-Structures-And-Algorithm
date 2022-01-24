import java.util.Scanner;

public class SearchIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr=new int[5];
        for(int i=0;i< arr.length;i++)
            arr[i]=sc.nextInt();
        int s=sc.nextInt();

        System.out.println(index(arr,0,s));
    }
    public static int index(int arr[],int current_index,int s){
        if(current_index>= arr.length)
            return 1;

        if(arr[current_index]==s)
            return current_index;
        return index(arr,current_index+1,s);
    }
}
