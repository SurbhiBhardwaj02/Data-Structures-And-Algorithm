import java.util.Scanner;

public class Flower {
    private String name;
    public int num;
    public float price;
    public Flower(String name,int num, int price){
        this.name=name;
        this.num=num;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Flower[] arr=new Flower[5];
        for (int i = 0; i <5 ; i++) {
            arr[i]=new Flower(sc.next(), sc.nextInt(), sc.nextInt());
        }

        for (int i = 0; i < 5; i++)
            System.out.println(arr[i].name+" "+arr[i].num+" "+arr[i].price);
    }
}
