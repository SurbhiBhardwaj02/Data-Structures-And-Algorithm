import java.util.*;
public class Stedent {
    private int rollno;
    private int marks;
    private String name;

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void showDetails()
    {
        System.out.println("Name:"+name+" Rollno:"+rollno+" Marks:"+marks);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stedent[] arr=new Stedent[10];
        for (int i = 0; i < arr.length ; i++)
        {
            arr[i]=new Stedent();
            arr[i].setRollno(sc.nextInt());
            arr[i].setMarks(sc.nextInt());
            arr[i].setName(sc.next());
        }
        int max=arr[0].marks;
        int min =arr[0].marks;
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].marks>max)
                max=arr[i].marks;
            else
                min=arr[i].marks;
        }
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i].marks==max)
                arr[i].showDetails();
            if(arr[i].marks==min)
                arr[i].showDetails();

        }

    }
}
