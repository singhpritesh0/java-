import java.util.Scanner;

class Inc
{
public static void main(String[] args)
{
Scanner n= new Scanner(System.in);
System.out.println("Enter the value of a:");
int a=n.nextInt();
System.out.println(a);
System.out.println("Enter the value of b:");
int b=n.nextInt();
System.out.println(b);
System.out.println("Enter the value of c:");
int c=n.nextInt();
System.out.println(c);
if(a==b||b==c||c==a)
{
if(a==b)
{
if(a>c)
{
System.out.println("a and b is equal"+c+","+b+","+a);
}
else{
System.out.println("a and b is equal"+a+","+a+","+c);
}
}
else if(b==c)
{
if(b>a)
{
System.out.println("c and b is equal"+a+","+c+","+b);
}
else{
System.out.println("c and b is equal"+c+","+b+","+a);
}
}
else if(a==c)
{
if(b>a)
{
System.out.println("c and a is equal"+a+","+c+","+b);
}
else{
System.out.println("c and a is equal"+c+","+b+","+a);
}
}
else{
System.out.println("c,b and a is equal"+a+","+b+","+c);
}


}
else
{
if(a>b && a>c)
{
if(b>c)
{
System.out.println(+c+","+b+","+a);
}
else{
System.out.println(+b+","+c+","+a);
}
}
else if(b>a && b>c)
{
if(a>c)
{
System.out.println(+c+","+a+","+b);
}
else{
System.out.println(+a+","+c+","+b);
}
}
else
{
if(b>a)
{
System.out.println(+a+","+b+","+c);
}
else{
System.out.println(+b+","+a+","+c);
}
}

}
}
}