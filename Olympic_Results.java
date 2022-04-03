import java.util.ArrayList;
import java.util.Scanner;

public class Olympic_Results {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r= sc.nextInt();
        int c= sc.nextInt();
        int arr[][]=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        int arr1[]=new int[r];
        for (int i = 0; i < r; i++)
        {
            int sum=0;
            for (int j = 0; j < c; j++)
            {
                sum=sum+arr[i][j];
            }
            arr1[i]=sum;
            System.out.println(arr1[i]);
        }
    }
}
/*
The Olympic results are given in a table, where each row represents a country, and columns represent gold, silver, and
bronze medals. For example, the element r[0][0] is the number of gold medals earned by the 0-th country. Write a method
that takes the table as an input, and returns a new array which lists the total number of medals for each country.
For example, if we start with the table
     2   0   1
     3   2   0
     0   0   2
in which the 0-th country earned 2 + 0 + 1 = 3 medals, the 1-st country earned 3 + 2 + 0 = 5 medals, and the 2nd country
earned 0 + 0 + 2 = 2 medals, your method should return an array with values
   3
   5
   2
 */