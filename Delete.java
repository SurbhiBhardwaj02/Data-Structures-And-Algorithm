import java.util.ArrayList;
import java.util.*;

public class Delete {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        ArrayList<Integer> arr=new ArrayList<>(n);
        for (int i = 0; i < n; i++)
            arr.add(sc.nextInt());

        for (int i = 0; i < arr.size(); i++)
        {
            for(int j=0;j<arr.size();j++)
            {
                if(Objects.equals(arr.get(i),arr.get(j)) && i!=j)
                    arr.remove(j);
            }
            System.out.print(arr.get(i)+" ");
        }
    }
}

