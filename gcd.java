import java.util.*;
public class gcd {
    public static void gcd(int n1 , int n2){
        while(n1!=n2)
        {
            if(n1>n2)
            {
                n1 = n1-n2;
            }
            else
            {
                n2 = n2-n1;
            }

        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("gcd of" + n1 + "and" + n2 + "is" + gcd(a, b));
    }
    
}


