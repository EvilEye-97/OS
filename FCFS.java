import java.util.*;
public class FC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.print("Number of Processes:  ");
        n = sc.nextInt();
        int[] pid = new int[n];
        int[] arrival = new int[n];
        int[] completion = new int[n];
        int[] burst = new int[n];
        int[] waiting = new int[n];
        int[] turnaround = new int[n];

        System.out.println("Enter Arrival Time for each: ");
        for (i = 0; i < n; i++) {
            arrival[i] = sc.nextInt();
            
        }
        System.out.println("Enter Burst Time for each: ");
        for (i = 0; i < n; i++) {
            burst[i] = sc.nextInt();
        }
        waiting[0] = 0;

        for (i = 0; i < n; i++) {
            completion[i] = arrival[i] + burst[i];
        }
        for (i = 1; i < n; i++) {
            waiting[i] = turnaround[i]-arrival[i];
        }
        for (i = 0; i < n; i++) {
            turnaround[i] = waiting[i] + burst[i];
        }
        for(i = 0 ; i <n; i++)
         {
             for(int  j=0;  j < n-(i+1) ; j++)
             {
                 if( arrival[j] > arrival[j+1] )
                 {
                    int temp = arrival[j];
                     arrival[j] = arrival[j+1];
                     arrival[j+1] = temp;
                     temp = burst[j];
                     burst[j] = burst[j+1];
                     burst[j+1] = temp;
                     
                 }
             }
         }
 
        System.out.println("Number \tArrival \tBurst Time \tCompletion \tWaiting Time \tTurnaround Time");
        for (i = 0; i < n; i++) {
            System.out.println((i+1)+"\t"+"\t"+arrival[i]+"\t\t"+burst[i]+"\t\t"+completion[i]+"\t\t"+waiting[i]+"\t\t"+turnaround[i]);
        }
    }
    
}
