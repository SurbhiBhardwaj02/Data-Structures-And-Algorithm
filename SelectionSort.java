public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={4,1,9,2,3,6};
        int n= arr.length;

        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i+1; j <n ; j++) {
                if(arr[j]<arr[min])
                    min=j;
            }
            if(min!=i)
            {
                swap(arr,min,i);
            }
        }
        display(arr);
    }
    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
