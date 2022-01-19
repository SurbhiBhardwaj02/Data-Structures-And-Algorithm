import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Company[] salesman=new Company[5];
        int product[][]=new int[5][3];

        int sum=0;
        int sum1=0;
        for (int i = 0; i < salesman.length ; i++)
        {
            salesman[i]=new Company();
            System.out.println("Enter the sales of 3 items sold by salesman "+(i+1)+":");
            for(int j=0;j<3;j++)
            {
                product[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <5 ; i++)
        {
            sum=0;
            for(int j=0;j<3;j++)
            {
                sum=sum+product[i][j];
            }
            System.out.println("Total sales by salesman "+(i+1)+":"+sum);
        }
        for (int i = 0; i <3 ; i++)
        {
            sum1=-0;
            for(int j=0;j<5;j++)
            {
                sum1=sum1+product[j][i];
            }
            System.out.println("Total sales of item "+(i+1)+":"+sum1);
        }
    }
}
