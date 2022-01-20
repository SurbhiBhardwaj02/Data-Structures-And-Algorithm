import java.util.Scanner;

public class Employee {
    private int emp_id;
    Name name;
    Address address;
    private double salary;
    private String designation;

    public Employee(int e,double s,String d)
    {
        this.emp_id=e;
        this.salary=s;
        this.designation=d;
    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        Employee[] arr=new Employee[n];
        for (int i = 0; i < n; i++)
        {
            arr[i]=new Employee(s.nextInt(),s.nextDouble(),s.next());
            arr[i].name=new Name(s.next(),s.next());
            arr[i].address=new Address(s.next(),s.next(),s.next());

            System.out.println("Information of Employee "+(i+1)+":");

            System.out.println("Employee Id:"+arr[i].emp_id+"  "+
                    "Name:"+arr[i].name.first_name+" "+ arr[i].name.last_name+"  "+
                    "Address:"+arr[i].address.area+" "+arr[i].address.city+" "+arr[i].address.state);
            System.out.println("Salary:"+arr[i].salary+"  "+"Designation:"+arr[i].designation);
        }
    }
}
class Name{
    String first_name;
    String last_name;
    public Name(String f,String l){
        this.first_name=f;
        this.last_name=l;
    }
}
class Address{
    String area;
    String city;
    String state;
    public Address(String a,String c,String s)
    {
        this.area=a;
        this.city=c;
        this.state=s;
    }

}
