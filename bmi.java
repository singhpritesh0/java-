import java.util.*;
public class bmi 
{
    public static void main(String[] args)
    {
        int bmi;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the weight in kg");
        int w = sc.nextInt();
        System.out.println("enter the height in meter");
        int h = sc.nextInt();
        bmi = w/(h*h);
        System.out.println("bmi is "+ bmi "kg/m2");
    }
}
