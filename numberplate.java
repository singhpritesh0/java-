import java.util.*;
import java.lang.*;
public class numberplate{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int a1 = 'A' + (int)(Math.random()*('Z'-'A'));
int a2 = 'A' + (int)(Math.random()*('Z'-'A'));

int b1 = (int)(Math.random()*10);
int b2 = (int)(Math.random()*10);

int a3 = 'A' + (int)(Math.random()*('Z'-'A'));
int a4 = 'A' + (int)(Math.random()*('Z'-'A'));

int b3 = (int)(Math.random()*10);
int b4 = (int)(Math.random()*10);
int b5 = (int)(Math.random()*10);
int b6 = (int)(Math.random()*10);
System.out.println(" " +(char)(a1)+(char)(a2)+" "+b1+b2+" "+(char)(a3)+(char)(a4)+" "+b3+b4+b5+b6);

}
}
