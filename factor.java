import java.util.*;
class factor{

public static void fact(int n)
{
int i = 1;
while(i <= n)
{
if(n%i == 0)
{
System.out.println(" " + i);
}
i++;

}
}

public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("enter the number");
int a = sc.nextInt();
fact(a);


}

}