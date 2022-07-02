
public class QuickSortDemo {
    public static void quicksort(int arr[], int start, int end)
    {
        if (start < end) {
            int pivot = partition(arr, start, end);
            quicksort(arr, start, pivot-1 );
            quicksort(arr, pivot + 1,end);
        }
    }

    public static int partition(int arr[], int p , int q )
    {
        int pivot= q;
        int i = p-1;
        for(int j =p; j<=q;j++)
        {
            if(arr[j]<=arr[pivot])
            {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return i;
    }
    public static void display(int arr[])
    {
        for(int i =0; i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {45, 6 ,89,2 ,30,50,2};
        quicksort(arr,0,arr.length-1);
        display(arr);
    }
}
