import java.util.*;
import java.io.*;
public class FirstFile {
public static void main(String[] args) throws Exception{
// TODO Auto-generated method stub
Scanner input = new Scanner(new File("pk.txt"));
while(input.hasNextInt())
{
System.out.println(input.nextInt() + "");
}
System.out.println("");
}

}