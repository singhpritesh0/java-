import java.lang.*;
import java.util.Scanner;  
public class distance
{  
public static void main(String[] args)   
{  
   double a,b,x,ans;
   Scanner sc = new Scanner(System.in);
   System.out.print("enter the value x1");
   double x1 = sc.nextInt();
   System.out.print("enter the value x2");
   double x2 = sc.nextInt();
   System.out.print("enter the value y1");
   double y1 = sc.nextInt();
   System.out.print("enter the value y2");
   double y2 = sc.nextInt();

   a = (x1-x2)*(x1-x2);
   b = (y1-y2)*(y1-y2);

   x = a + b;
   ans = Math.sqrt(x);
   System.out.println("distance is " + ans );



}  
}  