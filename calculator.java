import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,x,ans;
        System.out.println("enter the value of a");
        a = sc.nextInt();
        System.out.println("enter the value of b");
        b = sc.nextInt();
        System.out.println("choose 1 for addition , 2 for sustraction , 3 for multiplication , 4 for division");
        x = sc.nextInt();

        switch(x) 
        {
            case 1 : ans = a+b;
            System.out.println(ans);
            break;

            case 2 : ans = a-b;
            System.out.println(ans);
            break;

            case 3 : ans = a*b;
            System.out.println(ans);
            break;

            case 4 : ans = a/b;
            System.out.println(ans);
            break;
        }
    }
    
}
