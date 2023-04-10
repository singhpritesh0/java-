import java.lang.*;
import java.util.*;
public class loop {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the last number you want to add");
        int n = sc.nextInt();
        int i,avg;
        int sum = 0;
        for(i=1;i<=n;i++)
        {
            sum = sum + i;
        }
        avg = sum/n;
        System.out.print("sum is " + sum);
        System.out.print("avg is " + avg);
    }
    
}
