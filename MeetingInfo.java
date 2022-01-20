import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;

class TimeInterval
{
    int start;
    int end;
    public TimeInterval(int start,int end){
        this.start=start;
        this.end=end;
    }
    public static boolean canAttendMeeting(TimeInterval arr[]){
        int start[]=new int[arr.length];
        int end[]=new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            start[i]=arr[i].start;
            end[i]=arr[i].end;
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for (int i = 0; i <  start.length-1; i++) {
            if (start[i + 1] <= end[i]) {
                return false;
            }
        }
        return true;
    }
}

public class MeetingInfo {
    public static void main(String[] args) {
        TimeInterval[] arr=new TimeInterval[4];
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < arr.length; i++)
        {
            arr[i]= new TimeInterval(sc.nextInt(), sc.nextInt());
        }
        boolean r =TimeInterval.canAttendMeeting(arr);
        if(r==true)
            System.out.println("all members can attend meeting");
        else
            System.out.println("clashes are there");

    }
}
