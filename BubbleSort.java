public class BubbleSort {
    public void sort(int arr[])
    {
        int n= arr.length-1;
        for (int i = 0; i < n; i++) {
            boolean check=false;
            for (int j = 0; j < n - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    check = true;
                    swap(arr, j + 1, j);
                }
            }
            if (!check) {
                break;
            }
        }
    }
    void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    void display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");;
        }
    }

    public static void main(String[] args) {
        int[] arr={4,7,3,9,5,7,8,2};
        BubbleSort obj=new BubbleSort();
        obj.display(arr);
        obj.sort(arr);
        System.out.println();
        obj.display(arr);
    }
}
