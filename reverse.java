import java.util.*;
public class reverse {
    public static void rev_no(int n){
        int reminder = 0;
        int rev = 0;
        while(n>0)
        {
            reminder = n%10;
            rev = rev*10 + reminder;
            n = n/10;
        }
        System.out.println(rev);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reverse");
        int n = sc.nextInt();
        rev_no(n);
    }
    
    
}
