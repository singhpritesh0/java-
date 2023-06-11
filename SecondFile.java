import java.io.*;
public class SecondFile {
public static void main(String[] args) throws FileNotFoundException, IOException
{
FileInputStream f = new FileInputStream("pk.txt");
int data1 = f.read();
int data2 = f.read();
int data3 = f.read();
int data4 = f.read();
int data5 = f.read();
int data6 = f.read();
int data7 = f.read();
int data8 = f.read();
int data9 = f.read();



System.out.print(""+ (char)data1);
System.out.print(""+ (char)data2);

System.out.print(""+ (char)data3);
System.out.print(""+ (char)data4);
System.out.print(""+ (char)data5);
System.out.print(""+ (char)data6);
System.out.print(""+ (char)data7);
System.out.print(""+ (char)data8);
System.out.print(""+ (char)data9);

f.close();
}

}