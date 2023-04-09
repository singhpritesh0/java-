import java.util.*;
import java.lang.*;
import java.util.Scanner;
public class check {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character");
        char c = sc.next().charAt(0);

        if(c == 'a' || c == 'A' || c== 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U')
        {
            System.out.println("it is vowel");
        }
        else
        {
            System.out.println("it is not vowel");
        }
    }
    
}
