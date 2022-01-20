import java.util.Scanner;

public class GameEntry {
    private int score;
    private String name;
    public GameEntry(int score,String name)
    {
        this.score=score;
        this.name=name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString()
    {
        return "("+score+","+name+")";
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        GameEntry[] arr=new GameEntry[n];

        for (int i = 0; i < n; i++)
            arr[i]=new GameEntry(sc.nextInt(), sc.next());

        int position=0;
        for (int i = 0; i < n; i++)
        {
            int max=0;
            for(int j=0;j<n;j++)
            {
                if (arr[j].getScore() > max) {
                    max = arr[j].getScore();
                    position = j;
                }
            }
            System.out.println(arr[position].toString());
            arr[position].score=0;
        }
    }
}

