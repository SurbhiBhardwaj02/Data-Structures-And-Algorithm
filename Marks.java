import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        int marks[][]=new int[4][5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 4; i++)
        {
            System.out.println("Marks of student"+(i+1)+":");
            for(int j=0;j<5;j++)
            {
                marks[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++)
        {
            int sum=0;
            for(int j=0;j<4;j++)
            {
                sum=sum+marks[j][i];
            }
            int avg=sum/5;
            System.out.println("Average marks obtained in subject "+(i+1)+":"+avg);

        }
        System.out.println("\n");

        int k=0;
        for (int i = 0; i < 4; i++)
        {
            int sum1=0;
            for(int j=0;j<5;j++)
                sum1=sum1+marks[i][j];
            int avg1=sum1/5;
            System.out.println("Average marks obtained by student "+(i+1)+":"+avg1);
            if(avg1<50)
                k++;
        }
        System.out.println("\n");
        System.out.println("Total num of students below 50 in their average "+k);
        System.out.println("\n");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
                System.out.println("Marks obtained by student "+(i+1)+" in subject "+(j+1)+":"+marks[i][j]);

        }

    }
}
